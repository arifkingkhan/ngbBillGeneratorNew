//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.mppkvvcl.ui;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.PdfCopy;
import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.PdfSmartCopy;
import com.mppkvvcl.bean.Discom;
import com.mppkvvcl.bean.ReportTemplate;
import com.mppkvvcl.dto.BillDTO;
import com.mppkvvcl.dto.BillReportDTO;
import com.mppkvvcl.dto.StatusDTO;
import com.mppkvvcl.service.BillReportService;
import com.mppkvvcl.util.BillFileReader;
import com.mppkvvcl.util.GlobalResources;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;
import javax.swing.SwingWorker;
import org.apache.commons.io.FilenameUtils;
import org.slf4j.Logger;

public class BillGeneratorWorker extends SwingWorker<Integer, StatusDTO> {
    private static final Logger logger = GlobalResources.getLogger(BillGeneratorWorker.class);
    private File billFile;
    private File outputDirectory;
    private Document document;
    private PdfCopy pdfCopy;
    private OutputStream fileOutputStream;
    private final BillGenerator parentComponent;
    private final JButton btnChooseBillFile;
    private final JButton btnChooseOutputDirectory;
    private final JButton btnGenerate;
    private final JLabel lblTotalBills;
    private final JLabel lblProcessedBills;
    private final JLabel lblStatus;
    private final JProgressBar billGenerationProgressbar;

    public BillGeneratorWorker(File selectedBillFile, File outputDirectory, BillGenerator parentComponent, JButton btnChooseBillFile, JButton btnChooseOutputDirectory, JButton btnGenerate, JLabel lblTotalBills, JLabel lblProcessedBills, JLabel lblStatus, JProgressBar billGenerationProgressbar) {
        this.billFile = selectedBillFile;
        this.parentComponent = parentComponent;
        this.btnChooseBillFile = btnChooseBillFile;
        this.btnChooseOutputDirectory = btnChooseOutputDirectory;
        this.btnGenerate = btnGenerate;
        this.lblTotalBills = lblTotalBills;
        this.lblProcessedBills = lblProcessedBills;
        this.lblStatus = lblStatus;
        this.outputDirectory = outputDirectory;
        this.billGenerationProgressbar = billGenerationProgressbar;
    }

    protected Integer doInBackground() throws Exception {
        logger.info("Reading bill File..");
        List<BillDTO> billDTOs = BillFileReader.readBillFile(this.billFile);
        if (billDTOs == null) {
            this.publish(new StatusDTO[]{new StatusDTO(true, "Error occurred while parsing bill file. Please check if it's valid", (String)null, 0)});
            return null;
        } else {
            logger.info("Read Bill File successfully");
            int totalRecords = billDTOs.size();
            this.publish(new StatusDTO[]{new StatusDTO(false, (String)null, "billFileSize", totalRecords)});

            try {
                this.setOutputFile();
            } catch (Exception var13) {
                logger.error("Couldn't initialize the output pdf file");
                this.publish(new StatusDTO[]{new StatusDTO(true, "Error occurred while initializing the output pdf file", (String)null, 0)});
                return null;
            }

            int generatedFiles = 0;
            Iterator var4 = billDTOs.iterator();

            while(var4.hasNext()) {
                BillDTO billDTO = (BillDTO)var4.next();
                BillReportDTO billReportDTO = this.createBillReportDto(billDTO);
                logger.info("Prepared billReportDTO. Now generating pentaho report");
                byte[] masterReportBytes = BillReportService.getReportAsBytes(billReportDTO);
                if (masterReportBytes == null) {
                    logger.error("Couldn't generate PDF bytes for a bill row");
                    logger.error("Consumer number: " + billDTO.getConsumerNo());
                    this.publish(new StatusDTO[]{new StatusDTO(true, "Error occurred while generating report from a bill. Discarding the bill file", (String)null, 0)});
                    return null;
                }

                try {
                    this.writeBytesToFile(masterReportBytes);
                    Logger var10000 = logger;
                    StringBuilder var10001 = (new StringBuilder()).append("Processed ");
                    ++generatedFiles;
                    var10000.info(var10001.append(generatedFiles).append(" bills").toString());
                    this.setProgress(100 * generatedFiles / totalRecords);
                    this.publish(new StatusDTO[]{new StatusDTO(false, (String)null, "recordsProcessed", generatedFiles)});
                } catch (DocumentException var10) {
                    logger.error("DocumentException occurred");
                    logger.error(var10.getMessage(), var10);
                    this.publish(new StatusDTO[]{new StatusDTO(true, "Error occurred while adding the generated bill report to PDF. Discarding the bill file", (String)null, 0)});
                    return null;
                } catch (IOException var11) {
                    logger.error("IOException occurred");
                    logger.error(var11.getMessage(), var11);
                    this.publish(new StatusDTO[]{new StatusDTO(true, "Error occurred while adding the generated bill report to PDF. Discarding the bill file", (String)null, 0)});
                    return null;
                } catch (Exception var12) {
                    logger.error("Some unexpected exception occurred");
                    logger.error(var12.getMessage(), var12);
                    this.publish(new StatusDTO[]{new StatusDTO(true, "Error occurred while adding the generated bill report to PDF. Discarding the bill file", (String)null, 0)});
                    return null;
                }
            }

            try {
                this.closeStream();
            } catch (IOException var9) {
                logger.error("IOException occurred");
                this.publish(new StatusDTO[]{new StatusDTO(true, "Error occurred while closing the open stream. Discarding the bill file", (String)null, 0)});
                return null;
            }

            return generatedFiles;
        }
    }

    public void process(List<StatusDTO> statusDTOs) {
        StatusDTO statusDTO = (StatusDTO)statusDTOs.get(statusDTOs.size() - 1);
        if (statusDTO.isIsException()) {
            JOptionPane.showMessageDialog(this.parentComponent, statusDTO.getExceptionMessage(), "NGB PDF Bill Generator", 0);
        } else if (statusDTO.getMessageType().equals("billFileSize")) {
            this.lblStatus.setText("Generating PDF");
            this.lblTotalBills.setText(String.valueOf(statusDTO.getCount()));
            this.lblProcessedBills.setText("0");
        } else if (statusDTO.getMessageType().equals("recordsProcessed")) {
            this.lblProcessedBills.setText(String.valueOf(statusDTO.getCount()));
        }

    }

    protected void done() {
        try {
            Integer output = (Integer)this.get();
            if (output != null) {
                JOptionPane.showMessageDialog(this.parentComponent, "PDF file generated: ".concat(FilenameUtils.removeExtension(this.outputDirectory.getAbsolutePath().concat("\\").concat(this.billFile.getName())).concat(".pdf")), "NGB PDF Bill Generator", 1);
            }

            this.btnChooseBillFile.setEnabled(true);
            this.btnChooseOutputDirectory.setEnabled(true);
            this.btnGenerate.setEnabled(true);
            this.lblProcessedBills.setText("-");
            this.lblStatus.setText("Waiting For User's Input..");
            this.lblTotalBills.setText("-");
            this.billFile = null;
            this.outputDirectory = null;
            this.billGenerationProgressbar.setValue(0);
        } catch (Exception var2) {
            logger.error("Some error occurred while retrieving worker thread's output");
        }

    }

    private void closeStream() throws IOException {
        this.document.close();
        this.fileOutputStream.close();
    }

    private void setOutputFile() throws DocumentException, FileNotFoundException {
        Document document = new Document();
        OutputStream fileOutputStream = new FileOutputStream(new File(FilenameUtils.removeExtension(this.outputDirectory.getAbsolutePath().concat("\\").concat(this.billFile.getName())).concat(".pdf")));
        this.fileOutputStream = fileOutputStream;
        PdfCopy pdfCopy = new PdfSmartCopy(document, fileOutputStream);
        document.open();
        this.document = document;
        this.pdfCopy = pdfCopy;
    }

    private void writeBytesToFile(byte[] reportBytes) throws DocumentException, IOException {
        logger.info("Adding pdf to original document");
        PdfReader pdfReader = new PdfReader(reportBytes);
        this.pdfCopy.addDocument(pdfReader);
        pdfReader.close();
    }

    private BillReportDTO createBillReportDto(BillDTO billDTO) {
        BillReportDTO billReportDTO = new BillReportDTO();
        billReportDTO.setBillDTO(billDTO);
        billReportDTO.setBillLogo("");
        billReportDTO.setDiscom(this.createDiscom());
        billReportDTO.setReportTemplate(this.createReportTemplate());
        billReportDTO.setFileFormat("PDF");
        billReportDTO.setIsAgricultureBill(false);
        return billReportDTO;
    }

    private Discom createDiscom() {
        Discom discom = new Discom();
        discom.setName("Indore");
        discom.setOfficialWebsite("http://www.mpwz.co.in");
        discom.setShortName("mpwz");
        discom.setFullName("Madhya Pradesh Paschim Kshetra Vidyut Vitran Company Ltd. Indore");
        discom.setNameAbbreviation("MPPKVVCL Indore");
        discom.setCin("U40109MP2002SGC015121");
        discom.setCallCenterNo("1912");
        discom.setAddress("G.P.H. Compound, Pologround, Indore (M.P.)");
        return discom;
    }

    private ReportTemplate createReportTemplate() {
        ReportTemplate reportTemplate = new ReportTemplate();
        reportTemplate.setReportName("bill");
        reportTemplate.setVersion("v5");
        reportTemplate.setTemplateName("bill_english_vr_2.prpt");
        reportTemplate.setEffectiveStartMonth("FEB-2019");
        reportTemplate.setEffectiveEndMonth("MAR-2050");
        reportTemplate.setDeleted(false);
        return reportTemplate;
    }
}
