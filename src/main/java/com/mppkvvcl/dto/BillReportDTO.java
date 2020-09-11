//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.mppkvvcl.dto;

import com.mppkvvcl.bean.Discom;
import com.mppkvvcl.bean.ReportTemplate;

public class BillReportDTO {
    private BillDTO billDTO;
    private Discom discom;
    private ReportTemplate reportTemplate;
    private String fileFormat;
    private String billLogo;
    private String language;
    private boolean isAgricultureBill;

    public BillReportDTO() {
    }

    public BillDTO getBillDTO() {
        return this.billDTO;
    }

    public void setBillDTO(BillDTO billDTO) {
        this.billDTO = billDTO;
    }

    public Discom getDiscom() {
        return this.discom;
    }

    public void setDiscom(Discom discom) {
        this.discom = discom;
    }

    public ReportTemplate getReportTemplate() {
        return this.reportTemplate;
    }

    public void setReportTemplate(ReportTemplate reportTemplate) {
        this.reportTemplate = reportTemplate;
    }

    public String getFileFormat() {
        return this.fileFormat;
    }

    public void setFileFormat(String fileFormat) {
        this.fileFormat = fileFormat;
    }

    public String getBillLogo() {
        return this.billLogo;
    }

    public void setBillLogo(String billLogo) {
        this.billLogo = billLogo;
    }

    public String getLanguage() {
        return this.language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public boolean getIsAgricultureBill() {
        return this.isAgricultureBill;
    }

    public void setIsAgricultureBill(boolean agricultureBill) {
        this.isAgricultureBill = agricultureBill;
    }

    public String toString() {
        return "BillReportDTO{billDTO=" + this.billDTO + ", discom=" + this.discom + ", reportTemplate=" + this.reportTemplate + ", fileFormat='" + this.fileFormat + '\'' + ", billLogo='" + this.billLogo + '\'' + ", language='" + this.language + '\'' + ", isAgricultureBill=" + this.isAgricultureBill + '}';
    }
}
