//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.mppkvvcl.service;

import com.mppkvvcl.bean.Discom;
import com.mppkvvcl.bean.ReportTemplate;
import com.mppkvvcl.dto.BillReportDTO;
import com.mppkvvcl.util.GlobalResources;
import com.mppkvvcl.util.PentahoUtility;
import java.net.URL;
import org.pentaho.reporting.engine.classic.core.MasterReport;
import org.pentaho.reporting.engine.classic.core.TableDataFactory;
import org.slf4j.Logger;
import org.springframework.util.StringUtils;

public abstract class BillReportService {
    private static final Logger logger = GlobalResources.getLogger(BillReportService.class);

    public BillReportService() {
    }

    public static MasterReport getReport(final BillReportDTO billReportDTO) {
        String methodName = "getReport() : ";
        logger.info("getReport() : called");
        if (billReportDTO != null && billReportDTO.getBillDTO() != null && billReportDTO.getDiscom() != null && billReportDTO.getReportTemplate() != null) {
            ReportTemplate reportTemplate = billReportDTO.getReportTemplate();
            String version = reportTemplate.getVersion();
            URL reportURL = getReportURL();
            MasterReport report = PentahoUtility.bootReport(reportURL);
            if (report == null) {
                System.out.println("Report initialization failed");
                logger.error("getReport() : Report initialization failed");
                return null;
            } else {
                TableDataFactory dataFactory = null;
                logger.info("Getting the data factory for the report");
                dataFactory = PentahoUtility.getDataFactory("bill", billReportDTO.getBillDTO());
                if (dataFactory == null) {
                    logger.error("getReport() : Data factory is null");
                    return null;
                } else {
                    logger.info("Retrieved data factory. Now setting it in the report");
                    report.setDataFactory(dataFactory);
                    logger.info("Successfully set the data factory inside report");
                    setDiscomParams(report, billReportDTO.getDiscom());
                    report.getParameterValues().put("app_version", "v1.0");
                    report.getParameterValues().put("template_version", version);
                    if (!StringUtils.isEmpty(billReportDTO.getBillLogo())) {
                        report.getParameterValues().put("bill_logo", billReportDTO.getBillLogo());
                    }

                    return report;
                }
            }
        } else {
            logger.error("getReport() : Input param(s) is null");
            return null;
        }
    }

    public static byte[] getReportAsBytes(final BillReportDTO billReportDTO) {
        String methodName = "getReportAsBytes() : ";
        logger.info("getReportAsBytes() : called");
        MasterReport report = null;
        Object var3 = null;

        byte[] out;
        try {
            logger.info("Calling getReport method");
            report = getReport(billReportDTO);
            logger.info("Got report object. Now getting bytes from it");
            out = PentahoUtility.getBytesFromReport(report, billReportDTO.getFileFormat());
        } finally {
            PentahoUtility.cleanReport(report);
        }

        return out;
    }

    private static URL getReportURL() {
        return GlobalResources.getReportUrl();
    }

    private static void setDiscomParams(final MasterReport report, final Discom discom) {
        String methodName = "setDiscomParams() : ";
        logger.info("setDiscomParams() : called");
        if (report == null) {
            logger.error("setDiscomParams() : Input param(s) is null");
        }

        if (discom != null) {
            report.getParameterValues().put("discom_logo", GlobalResources.getImageUrl(discom.getShortName().toLowerCase() + "." + "png").getPath());
            report.getParameterValues().put("discom_website", discom.getOfficialWebsite());
            report.getParameterValues().put("discom_cin", discom.getCin());
            report.getParameterValues().put("discom_call_center_no", discom.getCallCenterNo());
            report.getParameterValues().put("discom_full_name", discom.getFullName());
            report.getParameterValues().put("discom_office_address", discom.getAddress());
        }

    }
}
