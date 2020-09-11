//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.mppkvvcl.bean;

import java.util.Date;

public class ReportTemplate {
    private long id;
    private String reportName;
    private String version;
    private String templateName;
    private String effectiveStartMonth;
    private String effectiveEndMonth;
    private boolean deleted;
    private String createdBy;
    private Date createdOn;
    private String updatedBy;
    private Date updatedOn;

    public ReportTemplate() {
    }

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getReportName() {
        return this.reportName;
    }

    public void setReportName(String reportName) {
        this.reportName = reportName;
    }

    public String getVersion() {
        return this.version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getTemplateName() {
        return this.templateName;
    }

    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

    public String getEffectiveStartMonth() {
        return this.effectiveStartMonth;
    }

    public void setEffectiveStartMonth(String effectiveStartMonth) {
        this.effectiveStartMonth = effectiveStartMonth;
    }

    public String getEffectiveEndMonth() {
        return this.effectiveEndMonth;
    }

    public void setEffectiveEndMonth(String effectiveEndMonth) {
        this.effectiveEndMonth = effectiveEndMonth;
    }

    public boolean isDeleted() {
        return this.deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }

    public String getCreatedBy() {
        return this.createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Date getCreatedOn() {
        return this.createdOn;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }

    public String getUpdatedBy() {
        return this.updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    public Date getUpdatedOn() {
        return this.updatedOn;
    }

    public void setUpdatedOn(Date updatedOn) {
        this.updatedOn = updatedOn;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ReportTemplate{");
        sb.append("id=").append(this.id);
        sb.append(", reportName='").append(this.reportName).append('\'');
        sb.append(", version='").append(this.version).append('\'');
        sb.append(", templateName='").append(this.templateName).append('\'');
        sb.append(", effectiveStartMonth='").append(this.effectiveStartMonth).append('\'');
        sb.append(", effectiveEndMonth='").append(this.effectiveEndMonth).append('\'');
        sb.append(", deleted=").append(this.deleted);
        sb.append(", createdBy='").append(this.createdBy).append('\'');
        sb.append(", createdOn=").append(this.createdOn);
        sb.append(", updatedBy='").append(this.updatedBy).append('\'');
        sb.append(", updatedOn=").append(this.updatedOn);
        sb.append('}');
        String objStr = sb.toString();
        sb.setLength(0);
        return objStr;
    }
}
