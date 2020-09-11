//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.mppkvvcl.dto;

import java.math.BigDecimal;
import java.util.Date;

public class BillDTO {
    private String locationCode;
    private String billNumber;
    private String groupNo;
    private String readingDiaryNo;
    private String consumerNo;
    private String billMonth;
    private String billType;
    private Date billDate;
    private Date dueDate;
    private Date chequeDueDate;
    private Date currentReadDate;
    private BigDecimal currentRead;
    private BigDecimal previousRead;
    private BigDecimal difference;
    private BigDecimal mf;
    private BigDecimal meteredUnit;
    private BigDecimal assessment;
    private BigDecimal totalUnit;
    private BigDecimal gmcUnit;
    private BigDecimal billedUnit;
    private BigDecimal billedMD;
    private BigDecimal billedPF;
    private BigDecimal loadFactor;
    private BigDecimal fixedCharge;
    private BigDecimal additionalFixedCharges1;
    private BigDecimal additionalFixedCharges2;
    private BigDecimal energyCharge;
    private BigDecimal fcaCharge;
    private BigDecimal electricityDuty;
    private BigDecimal meterRent;
    private BigDecimal pfCharge;
    private BigDecimal weldingTransformerSurcharge;
    private BigDecimal loadFactorIncentive;
    private BigDecimal sdInterest;
    private BigDecimal ccbAdjustment;
    private BigDecimal lockCredit;
    private BigDecimal otherAdjustment;
    private BigDecimal employeeRebate;
    private BigDecimal onlinePaymentRebate;
    private BigDecimal prepaidMeterRebate;
    private BigDecimal promptPaymentIncentive;
    private BigDecimal advancePaymentIncentive;
    private BigDecimal demandSideIncentive;
    private BigDecimal otherRebates;
    private BigDecimal lockCreditWithLoadFactorIncentive;
    private BigDecimal subsidy;
    private BigDecimal currentBill;
    private BigDecimal arrear;
    private BigDecimal cumulativeSurcharge;
    private BigDecimal surchargeDemanded;
    private BigDecimal netBill;
    private BigDecimal currentBillSurcharge;
    private BigDecimal asdArrear;
    private BigDecimal asdInstallment;
    private BigDecimal xrayFixedCharge;
    private String consumerName;
    private String consumerNameH;
    private String category;
    private String address1;
    private String address2;
    private String address3;
    private String address1H;
    private String address2H;
    private String address3H;
    private String mobileNo;
    private String aadhaarNo;
    private String bplNo;
    private String poleNo;
    private String tariffCategory;
    private String premiseType;
    private BigDecimal sanctionedLoad;
    private String sanctionedLoadUnit;
    private String sanctionedLoadWithUnit;
    private BigDecimal contractDemand;
    private String contractDemandUnit;
    private String contractDemandWithUnit;
    private String purposeOfInstallation;
    private String tariffCode;
    private String phase;
    private String consumerStatus;
    private String oldLocationCode;
    private String serviceNo;
    private String oldServiceNo;
    private String oldGroupNo;
    private String oldReadingDiaryNo;
    private String zoneName;
    private String zoneAddress;
    private String zonePhoneNo;
    private String divisionName;
    private String circleName;
    private String employeeNo;
    private String readingType;
    private String source1;
    private boolean isOnline1;
    private Date punchingDate1;
    private Date payDate1;
    private long amountPaid1;
    private String payMode1;
    private String payWindow1;
    private String cacNo1;
    private Date postingDate1;
    private String postingBillMonth1;
    private String source2;
    private boolean isOnline2;
    private Date punchingDate2;
    private Date payDate2;
    private long amountPaid2;
    private String payMode2;
    private String payWindow2;
    private String cacNo2;
    private Date postingDate2;
    private String postingBillMonth2;
    private String readingMonth1;
    private Date readingDate1;
    private BigDecimal reading1;
    private BigDecimal consumeUnit1;
    private String readingMonth2;
    private Date readingDate2;
    private BigDecimal reading2;
    private BigDecimal consumeUnit2;
    private String readingMonth3;
    private Date readingDate3;
    private BigDecimal reading3;
    private BigDecimal consumeUnit3;
    private String readingMonth4;
    private Date readingDate4;
    private BigDecimal reading4;
    private BigDecimal consumeUnit4;
    private String readingMonth5;
    private Date readingDate5;
    private BigDecimal reading5;
    private BigDecimal consumeUnit5;
    private String readingMonth6;
    private Date readingDate6;
    private BigDecimal reading6;
    private BigDecimal consumeUnit6;
    private BigDecimal sdHeld;
    private String meterIdentifier;
    private String serialNo;
    private String make;
    private String meterOwner;
    private String capacity;
    private String contact1;
    private String contactPhone1;
    private String contactDesignation1;
    private String contact2;
    private String contactPhone2;
    private String contactDesignation2;
    private String meterReader;
    private String meterReaderMobileNo;
    private BigDecimal averageBill;
    private BigDecimal averageUnit;
    private BigDecimal billRoundAmount;
    private BigDecimal billMonth1;
    private BigDecimal billMonth2;
    private BigDecimal billMonth3;
    private BigDecimal billMonth4;
    private BigDecimal totalSubsidy;
    private BigDecimal subTotal;
    private BigDecimal billMafiAmount;
    private boolean saral;
    private boolean billMafi;
    private boolean revised;
    private boolean bpl;
    private boolean beneficiary;
    private String labourRegistrationNo;
    private String connectionType;
    private BigDecimal saralSubsidy;
    private String meteringStatus;
    private boolean employee;
    private boolean xray;
    private boolean seasonal;
    private long subCategoryCode;
    private long purposeOfInstallationId;
    private long revenueCategory;
    private BigDecimal igjySubsidy;
    private long unpostedPayment;
    private String divisionCode;
    private boolean isNetMeter;
    private BigDecimal solarPlantCapacity;
    private BigDecimal carryForwardUnit;
    private BigDecimal exportCurrentRead;
    private BigDecimal exportPreviousRead;
    private BigDecimal exportMF;
    private BigDecimal exportMeteredUnit;
    private BigDecimal exportAssessment;
    private BigDecimal exportTotalUnit;
    private BigDecimal netMeteredUnit;
    private BigDecimal netTotalUnit;
    private BigDecimal solarGeneratorCurrentRead;
    private BigDecimal solarGeneratorPreviousRead;
    private BigDecimal solarGeneratorMF;
    private BigDecimal solarGeneratorMeteredUnit;
    private BigDecimal solarGeneratorAssessment;
    private BigDecimal solarGeneratorTotalUnit;

    public BillDTO() {
    }

    public String getLocationCode() {
        return this.locationCode;
    }

    public void setLocationCode(String locationCode) {
        this.locationCode = locationCode;
    }

    public String getBillNumber() {
        return this.billNumber;
    }

    public void setBillNumber(String billNumber) {
        this.billNumber = billNumber;
    }

    public String getGroupNo() {
        return this.groupNo;
    }

    public void setGroupNo(String groupNo) {
        this.groupNo = groupNo;
    }

    public String getReadingDiaryNo() {
        return this.readingDiaryNo;
    }

    public void setReadingDiaryNo(String readingDiaryNo) {
        this.readingDiaryNo = readingDiaryNo;
    }

    public String getConsumerNo() {
        return this.consumerNo;
    }

    public void setConsumerNo(String consumerNo) {
        this.consumerNo = consumerNo;
    }

    public String getBillMonth() {
        return this.billMonth;
    }

    public void setBillMonth(String billMonth) {
        this.billMonth = billMonth;
    }

    public String getBillType() {
        return this.billType;
    }

    public void setBillType(String billType) {
        this.billType = billType;
    }

    public Date getBillDate() {
        return this.billDate;
    }

    public void setBillDate(Date billDate) {
        this.billDate = billDate;
    }

    public Date getDueDate() {
        return this.dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public Date getChequeDueDate() {
        return this.chequeDueDate;
    }

    public void setChequeDueDate(Date chequeDueDate) {
        this.chequeDueDate = chequeDueDate;
    }

    public Date getCurrentReadDate() {
        return this.currentReadDate;
    }

    public void setCurrentReadDate(Date currentReadDate) {
        this.currentReadDate = currentReadDate;
    }

    public BigDecimal getCurrentRead() {
        return this.currentRead != null ? new BigDecimal(String.valueOf(this.currentRead.doubleValue())) : this.currentRead;
    }

    public void setCurrentRead(BigDecimal currentRead) {
        this.currentRead = currentRead;
    }

    public BigDecimal getPreviousRead() {
        return this.previousRead != null ? new BigDecimal(String.valueOf(this.previousRead.doubleValue())) : this.previousRead;
    }

    public void setPreviousRead(BigDecimal previousRead) {
        this.previousRead = previousRead;
    }

    public BigDecimal getDifference() {
        return this.difference != null ? new BigDecimal(String.valueOf(this.difference.doubleValue())) : this.difference;
    }

    public void setDifference(BigDecimal difference) {
        this.difference = difference;
    }

    public BigDecimal getMf() {
        return this.mf != null ? new BigDecimal(String.valueOf(this.mf.doubleValue())) : this.mf;
    }

    public void setMf(BigDecimal mf) {
        this.mf = mf;
    }

    public BigDecimal getMeteredUnit() {
        return this.meteredUnit != null ? new BigDecimal(String.valueOf(this.meteredUnit.doubleValue())) : this.meteredUnit;
    }

    public void setMeteredUnit(BigDecimal meteredUnit) {
        this.meteredUnit = meteredUnit;
    }

    public BigDecimal getAssessment() {
        return this.assessment != null ? new BigDecimal(String.valueOf(this.assessment.doubleValue())) : this.assessment;
    }

    public void setAssessment(BigDecimal assessment) {
        this.assessment = assessment;
    }

    public BigDecimal getTotalUnit() {
        return this.totalUnit != null ? new BigDecimal(String.valueOf(this.totalUnit.doubleValue())) : this.totalUnit;
    }

    public void setTotalUnit(BigDecimal totalUnit) {
        this.totalUnit = totalUnit;
    }

    public BigDecimal getGmcUnit() {
        return this.gmcUnit != null ? new BigDecimal(String.valueOf(this.gmcUnit.doubleValue())) : this.gmcUnit;
    }

    public void setGmcUnit(BigDecimal gmcUnit) {
        this.gmcUnit = gmcUnit;
    }

    public BigDecimal getBilledUnit() {
        return this.billedUnit != null ? new BigDecimal(String.valueOf(this.billedUnit.doubleValue())) : this.billedUnit;
    }

    public void setBilledUnit(BigDecimal billedUnit) {
        this.billedUnit = billedUnit;
    }

    public BigDecimal getBilledMD() {
        return this.billedMD != null ? new BigDecimal(String.valueOf(this.billedMD.doubleValue())) : this.billedMD;
    }

    public void setBilledMD(BigDecimal billedMD) {
        this.billedMD = billedMD;
    }

    public BigDecimal getBilledPF() {
        return this.billedPF != null ? new BigDecimal(String.valueOf(this.billedPF.doubleValue())) : this.billedPF;
    }

    public void setBilledPF(BigDecimal billedPF) {
        this.billedPF = billedPF;
    }

    public BigDecimal getLoadFactor() {
        return this.loadFactor != null ? new BigDecimal(String.valueOf(this.loadFactor.doubleValue())) : this.loadFactor;
    }

    public void setLoadFactor(BigDecimal loadFactor) {
        this.loadFactor = loadFactor;
    }

    public BigDecimal getFixedCharge() {
        return this.fixedCharge != null ? new BigDecimal(String.valueOf(this.fixedCharge.doubleValue())) : this.fixedCharge;
    }

    public void setFixedCharge(BigDecimal fixedCharge) {
        this.fixedCharge = fixedCharge;
    }

    public BigDecimal getAdditionalFixedCharges1() {
        return this.additionalFixedCharges1 != null ? new BigDecimal(String.valueOf(this.additionalFixedCharges1.doubleValue())) : this.additionalFixedCharges1;
    }

    public void setAdditionalFixedCharges1(BigDecimal additionalFixedCharges1) {
        this.additionalFixedCharges1 = additionalFixedCharges1;
    }

    public BigDecimal getAdditionalFixedCharges2() {
        return this.additionalFixedCharges2 != null ? new BigDecimal(String.valueOf(this.additionalFixedCharges2.doubleValue())) : this.additionalFixedCharges2;
    }

    public void setAdditionalFixedCharges2(BigDecimal additionalFixedCharges2) {
        this.additionalFixedCharges2 = additionalFixedCharges2;
    }

    public BigDecimal getEnergyCharge() {
        return this.energyCharge != null ? new BigDecimal(String.valueOf(this.energyCharge.doubleValue())) : this.energyCharge;
    }

    public void setEnergyCharge(BigDecimal energyCharge) {
        this.energyCharge = energyCharge;
    }

    public BigDecimal getFcaCharge() {
        return this.fcaCharge != null ? new BigDecimal(String.valueOf(this.fcaCharge.doubleValue())) : this.fcaCharge;
    }

    public void setFcaCharge(BigDecimal fcaCharge) {
        this.fcaCharge = fcaCharge;
    }

    public BigDecimal getElectricityDuty() {
        return this.electricityDuty != null ? new BigDecimal(String.valueOf(this.electricityDuty.doubleValue())) : this.electricityDuty;
    }

    public void setElectricityDuty(BigDecimal electricityDuty) {
        this.electricityDuty = electricityDuty;
    }

    public BigDecimal getMeterRent() {
        return this.meterRent != null ? new BigDecimal(String.valueOf(this.meterRent.doubleValue())) : this.meterRent;
    }

    public void setMeterRent(BigDecimal meterRent) {
        this.meterRent = meterRent;
    }

    public BigDecimal getPfCharge() {
        return this.pfCharge != null ? new BigDecimal(String.valueOf(this.pfCharge.doubleValue())) : this.pfCharge;
    }

    public void setPfCharge(BigDecimal pfCharge) {
        this.pfCharge = pfCharge;
    }

    public BigDecimal getWeldingTransformerSurcharge() {
        return this.weldingTransformerSurcharge != null ? new BigDecimal(String.valueOf(this.weldingTransformerSurcharge.doubleValue())) : this.weldingTransformerSurcharge;
    }

    public void setWeldingTransformerSurcharge(BigDecimal weldingTransformerSurcharge) {
        this.weldingTransformerSurcharge = weldingTransformerSurcharge;
    }

    public BigDecimal getLoadFactorIncentive() {
        return this.loadFactorIncentive != null ? new BigDecimal(String.valueOf(this.loadFactorIncentive.doubleValue())) : this.loadFactorIncentive;
    }

    public void setLoadFactorIncentive(BigDecimal loadFactorIncentive) {
        this.loadFactorIncentive = loadFactorIncentive;
    }

    public BigDecimal getSdInterest() {
        return this.sdInterest != null ? new BigDecimal(String.valueOf(this.sdInterest.doubleValue())) : this.sdInterest;
    }

    public void setSdInterest(BigDecimal sdInterest) {
        this.sdInterest = sdInterest;
    }

    public BigDecimal getCcbAdjustment() {
        return this.ccbAdjustment != null ? new BigDecimal(String.valueOf(this.ccbAdjustment.doubleValue())) : this.ccbAdjustment;
    }

    public void setCcbAdjustment(BigDecimal ccbAdjustment) {
        this.ccbAdjustment = ccbAdjustment;
    }

    public BigDecimal getLockCredit() {
        return this.lockCredit != null ? new BigDecimal(String.valueOf(this.lockCredit.doubleValue())) : this.lockCredit;
    }

    public void setLockCredit(BigDecimal lockCredit) {
        this.lockCredit = lockCredit;
    }

    public BigDecimal getOtherAdjustment() {
        return this.otherAdjustment != null ? new BigDecimal(String.valueOf(this.otherAdjustment.doubleValue())) : this.otherAdjustment;
    }

    public void setOtherAdjustment(BigDecimal otherAdjustment) {
        this.otherAdjustment = otherAdjustment;
    }

    public BigDecimal getEmployeeRebate() {
        return this.employeeRebate != null ? new BigDecimal(String.valueOf(this.employeeRebate.doubleValue())) : this.employeeRebate;
    }

    public void setEmployeeRebate(BigDecimal employeeRebate) {
        this.employeeRebate = employeeRebate;
    }

    public BigDecimal getOnlinePaymentRebate() {
        return this.onlinePaymentRebate != null ? new BigDecimal(String.valueOf(this.onlinePaymentRebate.doubleValue())) : this.onlinePaymentRebate;
    }

    public void setOnlinePaymentRebate(BigDecimal onlinePaymentRebate) {
        this.onlinePaymentRebate = onlinePaymentRebate;
    }

    public BigDecimal getPrepaidMeterRebate() {
        return this.prepaidMeterRebate != null ? new BigDecimal(String.valueOf(this.prepaidMeterRebate.doubleValue())) : this.prepaidMeterRebate;
    }

    public void setPrepaidMeterRebate(BigDecimal prepaidMeterRebate) {
        this.prepaidMeterRebate = prepaidMeterRebate;
    }

    public BigDecimal getPromptPaymentIncentive() {
        return this.promptPaymentIncentive != null ? new BigDecimal(String.valueOf(this.promptPaymentIncentive.doubleValue())) : this.promptPaymentIncentive;
    }

    public void setPromptPaymentIncentive(BigDecimal promptPaymentIncentive) {
        this.promptPaymentIncentive = promptPaymentIncentive;
    }

    public BigDecimal getAdvancePaymentIncentive() {
        return this.advancePaymentIncentive != null ? new BigDecimal(String.valueOf(this.advancePaymentIncentive.doubleValue())) : this.advancePaymentIncentive;
    }

    public void setAdvancePaymentIncentive(BigDecimal advancePaymentIncentive) {
        this.advancePaymentIncentive = advancePaymentIncentive;
    }

    public BigDecimal getDemandSideIncentive() {
        return this.demandSideIncentive != null ? new BigDecimal(String.valueOf(this.demandSideIncentive.doubleValue())) : this.demandSideIncentive;
    }

    public void setDemandSideIncentive(BigDecimal demandSideIncentive) {
        this.demandSideIncentive = demandSideIncentive;
    }

    public BigDecimal getOtherRebates() {
        return this.otherRebates != null ? new BigDecimal(String.valueOf(this.otherRebates.doubleValue())) : this.otherRebates;
    }

    public void setOtherRebates(BigDecimal otherRebates) {
        this.otherRebates = otherRebates;
    }

    public BigDecimal getLockCreditWithLoadFactorIncentive() {
        return this.lockCreditWithLoadFactorIncentive != null ? new BigDecimal(String.valueOf(this.lockCreditWithLoadFactorIncentive.doubleValue())) : this.lockCreditWithLoadFactorIncentive;
    }

    public void setLockCreditWithLoadFactorIncentive(BigDecimal lockCreditWithLoadFactorIncentive) {
        this.lockCreditWithLoadFactorIncentive = lockCreditWithLoadFactorIncentive;
    }

    public BigDecimal getSubsidy() {
        return this.subsidy != null ? new BigDecimal(String.valueOf(this.subsidy.doubleValue())) : this.subsidy;
    }

    public void setSubsidy(BigDecimal subsidy) {
        this.subsidy = subsidy;
    }

    public BigDecimal getCurrentBill() {
        return this.currentBill != null ? new BigDecimal(String.valueOf(this.currentBill.doubleValue())) : this.currentBill;
    }

    public void setCurrentBill(BigDecimal currentBill) {
        this.currentBill = currentBill;
    }

    public BigDecimal getArrear() {
        return this.arrear != null ? new BigDecimal(String.valueOf(this.arrear.doubleValue())) : this.arrear;
    }

    public void setArrear(BigDecimal arrear) {
        this.arrear = arrear;
    }

    public BigDecimal getCumulativeSurcharge() {
        return this.cumulativeSurcharge != null ? new BigDecimal(String.valueOf(this.cumulativeSurcharge.doubleValue())) : this.cumulativeSurcharge;
    }

    public void setCumulativeSurcharge(BigDecimal cumulativeSurcharge) {
        this.cumulativeSurcharge = cumulativeSurcharge;
    }

    public BigDecimal getSurchargeDemanded() {
        return this.surchargeDemanded != null ? new BigDecimal(String.valueOf(this.surchargeDemanded.doubleValue())) : this.surchargeDemanded;
    }

    public void setSurchargeDemanded(BigDecimal surchargeDemanded) {
        this.surchargeDemanded = surchargeDemanded;
    }

    public BigDecimal getNetBill() {
        return this.netBill != null ? new BigDecimal(String.valueOf(this.netBill.doubleValue())) : this.netBill;
    }

    public void setNetBill(BigDecimal netBill) {
        this.netBill = netBill;
    }

    public BigDecimal getCurrentBillSurcharge() {
        return this.currentBillSurcharge != null ? new BigDecimal(String.valueOf(this.currentBillSurcharge.doubleValue())) : this.currentBillSurcharge;
    }

    public void setCurrentBillSurcharge(BigDecimal currentBillSurcharge) {
        this.currentBillSurcharge = currentBillSurcharge;
    }

    public BigDecimal getAsdArrear() {
        return this.asdArrear != null ? new BigDecimal(String.valueOf(this.asdArrear.doubleValue())) : this.asdArrear;
    }

    public void setAsdArrear(BigDecimal asdArrear) {
        this.asdArrear = asdArrear;
    }

    public BigDecimal getAsdInstallment() {
        return this.asdInstallment != null ? new BigDecimal(String.valueOf(this.asdInstallment.doubleValue())) : this.asdInstallment;
    }

    public void setAsdInstallment(BigDecimal asdInstallment) {
        this.asdInstallment = asdInstallment;
    }

    public BigDecimal getXrayFixedCharge() {
        return this.xrayFixedCharge != null ? new BigDecimal(String.valueOf(this.xrayFixedCharge.doubleValue())) : this.xrayFixedCharge;
    }

    public void setXrayFixedCharge(BigDecimal xrayFixedCharge) {
        this.xrayFixedCharge = xrayFixedCharge;
    }

    public String getConsumerName() {
        return this.consumerName;
    }

    public void setConsumerName(String consumerName) {
        this.consumerName = consumerName;
    }

    public String getConsumerNameH() {
        return this.consumerNameH;
    }

    public void setConsumerNameH(String consumerNameH) {
        this.consumerNameH = consumerNameH;
    }

    public String getCategory() {
        return this.category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getAddress1() {
        return this.address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return this.address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getAddress3() {
        return this.address3;
    }

    public void setAddress3(String address3) {
        this.address3 = address3;
    }

    public String getAddress1H() {
        return this.address1H;
    }

    public void setAddress1H(String address1H) {
        this.address1H = address1H;
    }

    public String getAddress2H() {
        return this.address2H;
    }

    public void setAddress2H(String address2H) {
        this.address2H = address2H;
    }

    public String getAddress3H() {
        return this.address3H;
    }

    public void setAddress3H(String address3H) {
        this.address3H = address3H;
    }

    public String getMobileNo() {
        return this.mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getAadhaarNo() {
        return this.aadhaarNo;
    }

    public void setAadhaarNo(String aadhaarNo) {
        this.aadhaarNo = aadhaarNo;
    }

    public String getBplNo() {
        return this.bplNo;
    }

    public void setBplNo(String bplNo) {
        this.bplNo = bplNo;
    }

    public String getPoleNo() {
        return this.poleNo;
    }

    public void setPoleNo(String poleNo) {
        this.poleNo = poleNo;
    }

    public String getTariffCategory() {
        return this.tariffCategory;
    }

    public void setTariffCategory(String tariffCategory) {
        this.tariffCategory = tariffCategory;
    }

    public String getPremiseType() {
        return this.premiseType;
    }

    public void setPremiseType(String premiseType) {
        this.premiseType = premiseType;
    }

    public BigDecimal getSanctionedLoad() {
        return this.sanctionedLoad != null ? new BigDecimal(String.valueOf(this.sanctionedLoad.doubleValue())) : this.sanctionedLoad;
    }

    public void setSanctionedLoad(BigDecimal sanctionedLoad) {
        this.sanctionedLoad = sanctionedLoad;
    }

    public String getSanctionedLoadUnit() {
        return this.sanctionedLoadUnit;
    }

    public void setSanctionedLoadUnit(String sanctionedLoadUnit) {
        this.sanctionedLoadUnit = sanctionedLoadUnit;
    }

    public String getSanctionedLoadWithUnit() {
        return this.sanctionedLoadWithUnit;
    }

    public void setSanctionedLoadWithUnit(String sanctionedLoadWithUnit) {
        this.sanctionedLoadWithUnit = sanctionedLoadWithUnit;
    }

    public BigDecimal getContractDemand() {
        return this.contractDemand != null ? new BigDecimal(String.valueOf(this.contractDemand.doubleValue())) : this.contractDemand;
    }

    public void setContractDemand(BigDecimal contractDemand) {
        this.contractDemand = contractDemand;
    }

    public String getContractDemandUnit() {
        return this.contractDemandUnit;
    }

    public void setContractDemandUnit(String contractDemandUnit) {
        this.contractDemandUnit = contractDemandUnit;
    }

    public String getContractDemandWithUnit() {
        return this.contractDemandWithUnit;
    }

    public void setContractDemandWithUnit(String contractDemandWithUnit) {
        this.contractDemandWithUnit = contractDemandWithUnit;
    }

    public String getPurposeOfInstallation() {
        return this.purposeOfInstallation;
    }

    public void setPurposeOfInstallation(String purposeOfInstallation) {
        this.purposeOfInstallation = purposeOfInstallation;
    }

    public String getTariffCode() {
        return this.tariffCode;
    }

    public void setTariffCode(String tariffCode) {
        this.tariffCode = tariffCode;
    }

    public String getPhase() {
        return this.phase;
    }

    public void setPhase(String phase) {
        this.phase = phase;
    }

    public String getConsumerStatus() {
        return this.consumerStatus;
    }

    public void setConsumerStatus(String consumerStatus) {
        this.consumerStatus = consumerStatus;
    }

    public String getOldLocationCode() {
        return this.oldLocationCode;
    }

    public void setOldLocationCode(String oldLocationCode) {
        this.oldLocationCode = oldLocationCode;
    }

    public String getServiceNo() {
        return this.serviceNo;
    }

    public void setServiceNo(String serviceNo) {
        this.serviceNo = serviceNo;
    }

    public String getOldServiceNo() {
        return this.oldServiceNo;
    }

    public void setOldServiceNo(String oldServiceNo) {
        this.oldServiceNo = oldServiceNo;
    }

    public String getOldGroupNo() {
        return this.oldGroupNo;
    }

    public void setOldGroupNo(String oldGroupNo) {
        this.oldGroupNo = oldGroupNo;
    }

    public String getOldReadingDiaryNo() {
        return this.oldReadingDiaryNo;
    }

    public void setOldReadingDiaryNo(String oldReadingDiaryNo) {
        this.oldReadingDiaryNo = oldReadingDiaryNo;
    }

    public String getZoneName() {
        return this.zoneName;
    }

    public void setZoneName(String zoneName) {
        this.zoneName = zoneName;
    }

    public String getZoneAddress() {
        return this.zoneAddress;
    }

    public void setZoneAddress(String zoneAddress) {
        this.zoneAddress = zoneAddress;
    }

    public String getZonePhoneNo() {
        return this.zonePhoneNo;
    }

    public void setZonePhoneNo(String zonePhoneNo) {
        this.zonePhoneNo = zonePhoneNo;
    }

    public String getDivisionName() {
        return this.divisionName;
    }

    public void setDivisionName(String divisionName) {
        this.divisionName = divisionName;
    }

    public String getEmployeeNo() {
        return this.employeeNo;
    }

    public void setEmployeeNo(String employeeNo) {
        this.employeeNo = employeeNo;
    }

    public String getReadingType() {
        return this.readingType;
    }

    public void setReadingType(String readingType) {
        this.readingType = readingType;
    }

    public String getSource1() {
        return this.source1;
    }

    public void setSource1(String source1) {
        this.source1 = source1;
    }

    public boolean isOnline1() {
        return this.isOnline1;
    }

    public void setOnline1(boolean online1) {
        this.isOnline1 = online1;
    }

    public Date getPunchingDate1() {
        return this.punchingDate1;
    }

    public void setPunchingDate1(Date punchingDate1) {
        this.punchingDate1 = punchingDate1;
    }

    public Date getPayDate1() {
        return this.payDate1;
    }

    public void setPayDate1(Date payDate1) {
        this.payDate1 = payDate1;
    }

    public long getAmountPaid1() {
        return this.amountPaid1;
    }

    public void setAmountPaid1(long amountPaid1) {
        this.amountPaid1 = amountPaid1;
    }

    public String getPayMode1() {
        return this.payMode1;
    }

    public void setPayMode1(String payMode1) {
        this.payMode1 = payMode1;
    }

    public String getPayWindow1() {
        return this.payWindow1;
    }

    public void setPayWindow1(String payWindow1) {
        this.payWindow1 = payWindow1;
    }

    public String getCacNo1() {
        return this.cacNo1;
    }

    public void setCacNo1(String cacNo1) {
        this.cacNo1 = cacNo1;
    }

    public Date getPostingDate1() {
        return this.postingDate1;
    }

    public void setPostingDate1(Date postingDate1) {
        this.postingDate1 = postingDate1;
    }

    public String getPostingBillMonth1() {
        return this.postingBillMonth1;
    }

    public void setPostingBillMonth1(String postingBillMonth1) {
        this.postingBillMonth1 = postingBillMonth1;
    }

    public String getSource2() {
        return this.source2;
    }

    public void setSource2(String source2) {
        this.source2 = source2;
    }

    public boolean isOnline2() {
        return this.isOnline2;
    }

    public void setOnline2(boolean online2) {
        this.isOnline2 = online2;
    }

    public Date getPunchingDate2() {
        return this.punchingDate2;
    }

    public void setPunchingDate2(Date punchingDate2) {
        this.punchingDate2 = punchingDate2;
    }

    public Date getPayDate2() {
        return this.payDate2;
    }

    public void setPayDate2(Date payDate2) {
        this.payDate2 = payDate2;
    }

    public long getAmountPaid2() {
        return this.amountPaid2;
    }

    public void setAmountPaid2(long amountPaid2) {
        this.amountPaid2 = amountPaid2;
    }

    public String getPayMode2() {
        return this.payMode2;
    }

    public void setPayMode2(String payMode2) {
        this.payMode2 = payMode2;
    }

    public String getPayWindow2() {
        return this.payWindow2;
    }

    public void setPayWindow2(String payWindow2) {
        this.payWindow2 = payWindow2;
    }

    public String getCacNo2() {
        return this.cacNo2;
    }

    public void setCacNo2(String cacNo2) {
        this.cacNo2 = cacNo2;
    }

    public Date getPostingDate2() {
        return this.postingDate2;
    }

    public void setPostingDate2(Date postingDate2) {
        this.postingDate2 = postingDate2;
    }

    public String getPostingBillMonth2() {
        return this.postingBillMonth2;
    }

    public void setPostingBillMonth2(String postingBillMonth2) {
        this.postingBillMonth2 = postingBillMonth2;
    }

    public String getReadingMonth1() {
        return this.readingMonth1;
    }

    public void setReadingMonth1(String readingMonth1) {
        this.readingMonth1 = readingMonth1;
    }

    public Date getReadingDate1() {
        return this.readingDate1;
    }

    public void setReadingDate1(Date readingDate1) {
        this.readingDate1 = readingDate1;
    }

    public BigDecimal getReading1() {
        return this.reading1 != null ? new BigDecimal(String.valueOf(this.reading1.doubleValue())) : this.reading1;
    }

    public void setReading1(BigDecimal reading1) {
        this.reading1 = reading1;
    }

    public BigDecimal getConsumeUnit1() {
        return this.consumeUnit1 != null ? new BigDecimal(String.valueOf(this.consumeUnit1.doubleValue())) : this.consumeUnit1;
    }

    public void setConsumeUnit1(BigDecimal consumeUnit1) {
        this.consumeUnit1 = consumeUnit1;
    }

    public String getReadingMonth2() {
        return this.readingMonth2;
    }

    public void setReadingMonth2(String readingMonth2) {
        this.readingMonth2 = readingMonth2;
    }

    public Date getReadingDate2() {
        return this.readingDate2;
    }

    public void setReadingDate2(Date readingDate2) {
        this.readingDate2 = readingDate2;
    }

    public BigDecimal getReading2() {
        return this.reading2 != null ? new BigDecimal(String.valueOf(this.reading2.doubleValue())) : this.reading2;
    }

    public void setReading2(BigDecimal reading2) {
        this.reading2 = reading2;
    }

    public BigDecimal getConsumeUnit2() {
        return this.consumeUnit2 != null ? new BigDecimal(String.valueOf(this.consumeUnit2.doubleValue())) : this.consumeUnit2;
    }

    public void setConsumeUnit2(BigDecimal consumeUnit2) {
        this.consumeUnit2 = consumeUnit2;
    }

    public String getReadingMonth3() {
        return this.readingMonth3;
    }

    public void setReadingMonth3(String readingMonth3) {
        this.readingMonth3 = readingMonth3;
    }

    public Date getReadingDate3() {
        return this.readingDate3;
    }

    public void setReadingDate3(Date readingDate3) {
        this.readingDate3 = readingDate3;
    }

    public BigDecimal getReading3() {
        return this.reading3 != null ? new BigDecimal(String.valueOf(this.reading3.doubleValue())) : this.reading3;
    }

    public void setReading3(BigDecimal reading3) {
        this.reading3 = reading3;
    }

    public BigDecimal getConsumeUnit3() {
        return this.consumeUnit3 != null ? new BigDecimal(String.valueOf(this.consumeUnit3.doubleValue())) : this.consumeUnit3;
    }

    public void setConsumeUnit3(BigDecimal consumeUnit3) {
        this.consumeUnit3 = consumeUnit3;
    }

    public String getReadingMonth4() {
        return this.readingMonth4;
    }

    public void setReadingMonth4(String readingMonth4) {
        this.readingMonth4 = readingMonth4;
    }

    public Date getReadingDate4() {
        return this.readingDate4;
    }

    public void setReadingDate4(Date readingDate4) {
        this.readingDate4 = readingDate4;
    }

    public BigDecimal getReading4() {
        return this.reading4 != null ? new BigDecimal(String.valueOf(this.reading4.doubleValue())) : this.reading4;
    }

    public void setReading4(BigDecimal reading4) {
        this.reading4 = reading4;
    }

    public BigDecimal getConsumeUnit4() {
        return this.consumeUnit4 != null ? new BigDecimal(String.valueOf(this.consumeUnit4.doubleValue())) : this.consumeUnit4;
    }

    public void setConsumeUnit4(BigDecimal consumeUnit4) {
        this.consumeUnit4 = consumeUnit4;
    }

    public String getReadingMonth5() {
        return this.readingMonth5;
    }

    public void setReadingMonth5(String readingMonth5) {
        this.readingMonth5 = readingMonth5;
    }

    public Date getReadingDate5() {
        return this.readingDate5;
    }

    public void setReadingDate5(Date readingDate5) {
        this.readingDate5 = readingDate5;
    }

    public BigDecimal getReading5() {
        return this.reading5 != null ? new BigDecimal(String.valueOf(this.reading5.doubleValue())) : this.reading5;
    }

    public void setReading5(BigDecimal reading5) {
        this.reading5 = reading5;
    }

    public BigDecimal getConsumeUnit5() {
        return this.consumeUnit5 != null ? new BigDecimal(String.valueOf(this.consumeUnit5.doubleValue())) : this.consumeUnit5;
    }

    public void setConsumeUnit5(BigDecimal consumeUnit5) {
        this.consumeUnit5 = consumeUnit5;
    }

    public String getReadingMonth6() {
        return this.readingMonth6;
    }

    public void setReadingMonth6(String readingMonth6) {
        this.readingMonth6 = readingMonth6;
    }

    public Date getReadingDate6() {
        return this.readingDate6;
    }

    public void setReadingDate6(Date readingDate6) {
        this.readingDate6 = readingDate6;
    }

    public BigDecimal getReading6() {
        return this.reading6 != null ? new BigDecimal(String.valueOf(this.reading6.doubleValue())) : this.reading6;
    }

    public void setReading6(BigDecimal reading6) {
        this.reading6 = reading6;
    }

    public BigDecimal getConsumeUnit6() {
        return this.consumeUnit6 != null ? new BigDecimal(String.valueOf(this.consumeUnit6.doubleValue())) : this.consumeUnit6;
    }

    public void setConsumeUnit6(BigDecimal consumeUnit6) {
        this.consumeUnit6 = consumeUnit6;
    }

    public BigDecimal getSdHeld() {
        return this.sdHeld != null ? new BigDecimal(String.valueOf(this.sdHeld.doubleValue())) : this.sdHeld;
    }

    public void setSdHeld(BigDecimal sdHeld) {
        this.sdHeld = sdHeld;
    }

    public String getMeterIdentifier() {
        return this.meterIdentifier;
    }

    public void setMeterIdentifier(String meterIdentifier) {
        this.meterIdentifier = meterIdentifier;
    }

    public String getSerialNo() {
        return this.serialNo;
    }

    public void setSerialNo(String serialNo) {
        this.serialNo = serialNo;
    }

    public String getMake() {
        return this.make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getMeterOwner() {
        return this.meterOwner;
    }

    public void setMeterOwner(String meterOwner) {
        this.meterOwner = meterOwner;
    }

    public String getCapacity() {
        return this.capacity;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }

    public String getContact1() {
        return this.contact1;
    }

    public void setContact1(String contact1) {
        this.contact1 = contact1;
    }

    public String getContactPhone1() {
        return this.contactPhone1;
    }

    public void setContactPhone1(String contactPhone1) {
        this.contactPhone1 = contactPhone1;
    }

    public String getContactDesignation1() {
        return this.contactDesignation1;
    }

    public void setContactDesignation1(String contactDesignation1) {
        this.contactDesignation1 = contactDesignation1;
    }

    public String getContact2() {
        return this.contact2;
    }

    public void setContact2(String contact2) {
        this.contact2 = contact2;
    }

    public String getContactPhone2() {
        return this.contactPhone2;
    }

    public void setContactPhone2(String contactPhone2) {
        this.contactPhone2 = contactPhone2;
    }

    public String getContactDesignation2() {
        return this.contactDesignation2;
    }

    public void setContactDesignation2(String contactDesignation2) {
        this.contactDesignation2 = contactDesignation2;
    }

    public String getMeterReader() {
        return this.meterReader;
    }

    public void setMeterReader(String meterReader) {
        this.meterReader = meterReader;
    }

    public String getMeterReaderMobileNo() {
        return this.meterReaderMobileNo;
    }

    public void setMeterReaderMobileNo(String meterReaderMobileNo) {
        this.meterReaderMobileNo = meterReaderMobileNo;
    }

    public BigDecimal getAverageBill() {
        return this.averageBill != null ? new BigDecimal(String.valueOf(this.averageBill.doubleValue())) : this.averageBill;
    }

    public void setAverageBill(BigDecimal averageBill) {
        this.averageBill = averageBill;
    }

    public BigDecimal getAverageUnit() {
        return this.averageUnit != null ? new BigDecimal(String.valueOf(this.averageUnit.doubleValue())) : this.averageUnit;
    }

    public void setAverageUnit(BigDecimal averageUnit) {
        this.averageUnit = averageUnit;
    }

    public BigDecimal getBillRoundAmount() {
        return this.billRoundAmount != null ? new BigDecimal(String.valueOf(this.billRoundAmount.doubleValue())) : this.billRoundAmount;
    }

    public void setBillRoundAmount(BigDecimal billRoundAmount) {
        this.billRoundAmount = billRoundAmount;
    }

    public BigDecimal getBillMonth1() {
        return this.billMonth1 != null ? new BigDecimal(String.valueOf(this.billMonth1.doubleValue())) : this.billMonth1;
    }

    public void setBillMonth1(BigDecimal billMonth1) {
        this.billMonth1 = billMonth1;
    }

    public BigDecimal getBillMonth2() {
        return this.billMonth2 != null ? new BigDecimal(String.valueOf(this.billMonth2.doubleValue())) : this.billMonth2;
    }

    public void setBillMonth2(BigDecimal billMonth2) {
        this.billMonth2 = billMonth2;
    }

    public BigDecimal getBillMonth3() {
        return this.billMonth3 != null ? new BigDecimal(String.valueOf(this.billMonth3.doubleValue())) : this.billMonth3;
    }

    public void setBillMonth3(BigDecimal billMonth3) {
        this.billMonth3 = billMonth3;
    }

    public BigDecimal getBillMonth4() {
        return this.billMonth4 != null ? new BigDecimal(String.valueOf(this.billMonth4.doubleValue())) : this.billMonth4;
    }

    public void setBillMonth4(BigDecimal billMonth4) {
        this.billMonth4 = billMonth4;
    }

    public BigDecimal getTotalSubsidy() {
        return this.totalSubsidy != null ? new BigDecimal(String.valueOf(this.totalSubsidy.doubleValue())) : this.totalSubsidy;
    }

    public void setTotalSubsidy(BigDecimal totalSubsidy) {
        this.totalSubsidy = totalSubsidy;
    }

    public BigDecimal getSubTotal() {
        return this.subTotal != null ? new BigDecimal(String.valueOf(this.subTotal.doubleValue())) : this.subTotal;
    }

    public void setSubTotal(BigDecimal subTotal) {
        this.subTotal = subTotal;
    }

    public BigDecimal getBillMafiAmount() {
        return this.billMafiAmount != null ? new BigDecimal(String.valueOf(this.billMafiAmount.doubleValue())) : this.billMafiAmount;
    }

    public void setBillMafiAmount(BigDecimal billMafiAmount) {
        this.billMafiAmount = billMafiAmount;
    }

    public boolean isSaral() {
        return this.saral;
    }

    public void setSaral(boolean saral) {
        this.saral = saral;
    }

    public boolean isRevised() {
        return this.revised;
    }

    public void setRevised(boolean revised) {
        this.revised = revised;
    }

    public boolean isBpl() {
        return this.bpl;
    }

    public void setBpl(boolean bpl) {
        this.bpl = bpl;
    }

    public boolean isBeneficiary() {
        return this.beneficiary;
    }

    public void setBeneficiary(boolean beneficiary) {
        this.beneficiary = beneficiary;
    }

    public String getLabourRegistrationNo() {
        return this.labourRegistrationNo;
    }

    public void setLabourRegistrationNo(String labourRegistrationNo) {
        this.labourRegistrationNo = labourRegistrationNo;
    }

    public String getConnectionType() {
        return this.connectionType;
    }

    public void setConnectionType(String connectionType) {
        this.connectionType = connectionType;
    }

    public BigDecimal getSaralSubsidy() {
        return this.saralSubsidy != null ? new BigDecimal(String.valueOf(this.saralSubsidy.doubleValue())) : this.saralSubsidy;
    }

    public void setSaralSubsidy(BigDecimal saralSubsidy) {
        this.saralSubsidy = saralSubsidy;
    }

    public String getMeteringStatus() {
        return this.meteringStatus;
    }

    public void setMeteringStatus(String meteringStatus) {
        this.meteringStatus = meteringStatus;
    }

    public boolean isEmployee() {
        return this.employee;
    }

    public void setEmployee(boolean employee) {
        this.employee = employee;
    }

    public boolean isXray() {
        return this.xray;
    }

    public void setXray(boolean xray) {
        this.xray = xray;
    }

    public boolean isSeasonal() {
        return this.seasonal;
    }

    public void setSeasonal(boolean seasonal) {
        this.seasonal = seasonal;
    }

    public long getSubCategoryCode() {
        return this.subCategoryCode;
    }

    public void setSubCategoryCode(long subCategoryCode) {
        this.subCategoryCode = subCategoryCode;
    }

    public long getPurposeOfInstallationId() {
        return this.purposeOfInstallationId;
    }

    public void setPurposeOfInstallationId(long purposeOfInstallationId) {
        this.purposeOfInstallationId = purposeOfInstallationId;
    }

    public long getRevenueCategory() {
        return this.revenueCategory;
    }

    public void setRevenueCategory(long revenueCategory) {
        this.revenueCategory = revenueCategory;
    }

    public BigDecimal getIgjySubsidy() {
        return this.igjySubsidy != null ? new BigDecimal(String.valueOf(this.igjySubsidy.doubleValue())) : this.igjySubsidy;
    }

    public void setIgjySubsidy(BigDecimal igjySubsidy) {
        this.igjySubsidy = igjySubsidy;
    }

    public String getCircleName() {
        return this.circleName;
    }

    public void setCircleName(String circleName) {
        this.circleName = circleName;
    }

    public boolean isBillMafi() {
        return this.billMafi;
    }

    public void setBillMafi(boolean billMafi) {
        this.billMafi = billMafi;
    }

    public long getUnpostedPayment() {
        return this.unpostedPayment;
    }

    public void setUnpostedPayment(long unpostedPayment) {
        this.unpostedPayment = unpostedPayment;
    }

    public String getDivisionCode() {
        return this.divisionCode;
    }

    public void setDivisionCode(String divisionCode) {
        this.divisionCode = divisionCode;
    }

    public boolean getIsNetMeter() {
        return this.isNetMeter;
    }

    public void setIsNetMeter(boolean netMeter) {
        this.isNetMeter = netMeter;
    }

    public BigDecimal getSolarPlantCapacity() {
        return this.solarPlantCapacity != null ? new BigDecimal(String.valueOf(this.solarPlantCapacity.doubleValue())) : this.solarPlantCapacity;
    }

    public void setSolarPlantCapacity(BigDecimal solarPlantCapacity) {
        this.solarPlantCapacity = solarPlantCapacity;
    }

    public BigDecimal getCarryForwardUnit() {
        return this.carryForwardUnit != null ? new BigDecimal(String.valueOf(this.carryForwardUnit.doubleValue())) : this.carryForwardUnit;
    }

    public void setCarryForwardUnit(BigDecimal carryForwardUnit) {
        this.carryForwardUnit = carryForwardUnit;
    }

    public BigDecimal getExportCurrentRead() {
        return this.exportCurrentRead != null ? new BigDecimal(String.valueOf(this.exportCurrentRead.doubleValue())) : this.exportCurrentRead;
    }

    public void setExportCurrentRead(BigDecimal exportCurrentRead) {
        this.exportCurrentRead = exportCurrentRead;
    }

    public BigDecimal getExportPreviousRead() {
        return this.exportPreviousRead != null ? new BigDecimal(String.valueOf(this.exportPreviousRead.doubleValue())) : this.exportPreviousRead;
    }

    public void setExportPreviousRead(BigDecimal exportPreviousRead) {
        this.exportPreviousRead = exportPreviousRead;
    }

    public BigDecimal getExportMF() {
        return this.exportMF != null ? new BigDecimal(String.valueOf(this.exportMF.doubleValue())) : this.exportMF;
    }

    public void setExportMF(BigDecimal exportMF) {
        this.exportMF = exportMF;
    }

    public BigDecimal getExportMeteredUnit() {
        return this.exportMeteredUnit != null ? new BigDecimal(String.valueOf(this.exportMeteredUnit.doubleValue())) : this.exportMeteredUnit;
    }

    public void setExportMeteredUnit(BigDecimal exportMeteredUnit) {
        this.exportMeteredUnit = exportMeteredUnit;
    }

    public BigDecimal getExportAssessment() {
        return this.exportAssessment != null ? new BigDecimal(String.valueOf(this.exportAssessment.doubleValue())) : this.exportAssessment;
    }

    public void setExportAssessment(BigDecimal exportAssessment) {
        this.exportAssessment = exportAssessment;
    }

    public BigDecimal getExportTotalUnit() {
        return this.exportTotalUnit != null ? new BigDecimal(String.valueOf(this.exportTotalUnit.doubleValue())) : this.exportTotalUnit;
    }

    public void setExportTotalUnit(BigDecimal exportTotalUnit) {
        this.exportTotalUnit = exportTotalUnit;
    }

    public BigDecimal getNetMeteredUnit() {
        return this.netMeteredUnit != null ? new BigDecimal(String.valueOf(this.netMeteredUnit.doubleValue())) : this.netMeteredUnit;
    }

    public void setNetMeteredUnit(BigDecimal netMeteredUnit) {
        this.netMeteredUnit = netMeteredUnit;
    }

    public BigDecimal getNetTotalUnit() {
        return this.netTotalUnit != null ? new BigDecimal(String.valueOf(this.netTotalUnit.doubleValue())) : this.netTotalUnit;
    }

    public void setNetTotalUnit(BigDecimal netTotalUnit) {
        this.netTotalUnit = netTotalUnit;
    }

    public BigDecimal getSolarGeneratorCurrentRead() {
        return this.solarGeneratorCurrentRead != null ? new BigDecimal(String.valueOf(this.solarGeneratorCurrentRead.doubleValue())) : this.solarGeneratorCurrentRead;
    }

    public void setSolarGeneratorCurrentRead(BigDecimal solarGeneratorCurrentRead) {
        this.solarGeneratorCurrentRead = solarGeneratorCurrentRead;
    }

    public BigDecimal getSolarGeneratorPreviousRead() {
        return this.solarGeneratorPreviousRead != null ? new BigDecimal(String.valueOf(this.solarGeneratorPreviousRead.doubleValue())) : this.solarGeneratorPreviousRead;
    }

    public void setSolarGeneratorPreviousRead(BigDecimal solarGeneratorPreviousRead) {
        this.solarGeneratorPreviousRead = solarGeneratorPreviousRead;
    }

    public BigDecimal getSolarGeneratorMF() {
        return this.solarGeneratorMF != null ? new BigDecimal(String.valueOf(this.solarGeneratorMF.doubleValue())) : this.solarGeneratorMF;
    }

    public void setSolarGeneratorMF(BigDecimal solarGeneratorMF) {
        this.solarGeneratorMF = solarGeneratorMF;
    }

    public BigDecimal getSolarGeneratorMeteredUnit() {
        return this.solarGeneratorMeteredUnit != null ? new BigDecimal(String.valueOf(this.solarGeneratorMeteredUnit.doubleValue())) : this.solarGeneratorMeteredUnit;
    }

    public void setSolarGeneratorMeteredUnit(BigDecimal solarGeneratorMeteredUnit) {
        this.solarGeneratorMeteredUnit = solarGeneratorMeteredUnit;
    }

    public BigDecimal getSolarGeneratorAssessment() {
        return this.solarGeneratorAssessment != null ? new BigDecimal(String.valueOf(this.solarGeneratorAssessment.doubleValue())) : this.solarGeneratorAssessment;
    }

    public void setSolarGeneratorAssessment(BigDecimal solarGeneratorAssessment) {
        this.solarGeneratorAssessment = solarGeneratorAssessment;
    }

    public BigDecimal getSolarGeneratorTotalUnit() {
        return this.solarGeneratorTotalUnit != null ? new BigDecimal(String.valueOf(this.solarGeneratorTotalUnit.doubleValue())) : this.solarGeneratorTotalUnit;
    }

    public void setSolarGeneratorTotalUnit(BigDecimal solarGeneratorTotalUnit) {
        this.solarGeneratorTotalUnit = solarGeneratorTotalUnit;
    }

    public String toString() {
        return "BillDTO{locationCode='" + this.locationCode + '\'' + ", billNumber='" + this.billNumber + '\'' + ", groupNo='" + this.groupNo + '\'' + ", readingDiaryNo='" + this.readingDiaryNo + '\'' + ", consumerNo='" + this.consumerNo + '\'' + ", billMonth='" + this.billMonth + '\'' + ", billType='" + this.billType + '\'' + ", billDate=" + this.billDate + ", dueDate=" + this.dueDate + ", chequeDueDate=" + this.chequeDueDate + ", currentReadDate=" + this.currentReadDate + ", currentRead=" + this.currentRead + ", previousRead=" + this.previousRead + ", difference=" + this.difference + ", mf=" + this.mf + ", meteredUnit=" + this.meteredUnit + ", assessment=" + this.assessment + ", totalUnit=" + this.totalUnit + ", gmcUnit=" + this.gmcUnit + ", billedUnit=" + this.billedUnit + ", billedMD=" + this.billedMD + ", billedPF=" + this.billedPF + ", loadFactor=" + this.loadFactor + ", fixedCharge=" + this.fixedCharge + ", additionalFixedCharges1=" + this.additionalFixedCharges1 + ", additionalFixedCharges2=" + this.additionalFixedCharges2 + ", energyCharge=" + this.energyCharge + ", fcaCharge=" + this.fcaCharge + ", electricityDuty=" + this.electricityDuty + ", meterRent=" + this.meterRent + ", pfCharge=" + this.pfCharge + ", weldingTransformerSurcharge=" + this.weldingTransformerSurcharge + ", loadFactorIncentive=" + this.loadFactorIncentive + ", sdInterest=" + this.sdInterest + ", ccbAdjustment=" + this.ccbAdjustment + ", lockCredit=" + this.lockCredit + ", otherAdjustment=" + this.otherAdjustment + ", employeeRebate=" + this.employeeRebate + ", onlinePaymentRebate=" + this.onlinePaymentRebate + ", prepaidMeterRebate=" + this.prepaidMeterRebate + ", promptPaymentIncentive=" + this.promptPaymentIncentive + ", advancePaymentIncentive=" + this.advancePaymentIncentive + ", demandSideIncentive=" + this.demandSideIncentive + ", otherRebates=" + this.otherRebates + ", lockCreditWithLoadFactorIncentive=" + this.lockCreditWithLoadFactorIncentive + ", subsidy=" + this.subsidy + ", currentBill=" + this.currentBill + ", arrear=" + this.arrear + ", cumulativeSurcharge=" + this.cumulativeSurcharge + ", surchargeDemanded=" + this.surchargeDemanded + ", netBill=" + this.netBill + ", currentBillSurcharge=" + this.currentBillSurcharge + ", asdArrear=" + this.asdArrear + ", asdInstallment=" + this.asdInstallment + ", xrayFixedCharge=" + this.xrayFixedCharge + ", consumerName='" + this.consumerName + '\'' + ", consumerNameH='" + this.consumerNameH + '\'' + ", category='" + this.category + '\'' + ", address1='" + this.address1 + '\'' + ", address2='" + this.address2 + '\'' + ", address3='" + this.address3 + '\'' + ", address1H='" + this.address1H + '\'' + ", address2H='" + this.address2H + '\'' + ", address3H='" + this.address3H + '\'' + ", mobileNo='" + this.mobileNo + '\'' + ", aadhaarNo='" + this.aadhaarNo + '\'' + ", bplNo='" + this.bplNo + '\'' + ", poleNo='" + this.poleNo + '\'' + ", tariffCategory='" + this.tariffCategory + '\'' + ", premiseType='" + this.premiseType + '\'' + ", sanctionedLoad=" + this.sanctionedLoad + ", sanctionedLoadUnit='" + this.sanctionedLoadUnit + '\'' + ", sanctionedLoadWithUnit='" + this.sanctionedLoadWithUnit + '\'' + ", contractDemand=" + this.contractDemand + ", contractDemandUnit='" + this.contractDemandUnit + '\'' + ", contractDemandWithUnit='" + this.contractDemandWithUnit + '\'' + ", purposeOfInstallation='" + this.purposeOfInstallation + '\'' + ", tariffCode='" + this.tariffCode + '\'' + ", phase='" + this.phase + '\'' + ", consumerStatus='" + this.consumerStatus + '\'' + ", oldLocationCode='" + this.oldLocationCode + '\'' + ", serviceNo='" + this.serviceNo + '\'' + ", oldServiceNo='" + this.oldServiceNo + '\'' + ", oldGroupNo='" + this.oldGroupNo + '\'' + ", oldReadingDiaryNo='" + this.oldReadingDiaryNo + '\'' + ", zoneName='" + this.zoneName + '\'' + ", zoneAddress='" + this.zoneAddress + '\'' + ", zonePhoneNo='" + this.zonePhoneNo + '\'' + ", divisionName='" + this.divisionName + '\'' + ", circleName='" + this.circleName + '\'' + ", employeeNo='" + this.employeeNo + '\'' + ", readingType='" + this.readingType + '\'' + ", source1='" + this.source1 + '\'' + ", isOnline1=" + this.isOnline1 + ", punchingDate1=" + this.punchingDate1 + ", payDate1=" + this.payDate1 + ", amountPaid1=" + this.amountPaid1 + ", payMode1='" + this.payMode1 + '\'' + ", payWindow1='" + this.payWindow1 + '\'' + ", cacNo1='" + this.cacNo1 + '\'' + ", postingDate1=" + this.postingDate1 + ", postingBillMonth1='" + this.postingBillMonth1 + '\'' + ", source2='" + this.source2 + '\'' + ", isOnline2=" + this.isOnline2 + ", punchingDate2=" + this.punchingDate2 + ", payDate2=" + this.payDate2 + ", amountPaid2=" + this.amountPaid2 + ", payMode2='" + this.payMode2 + '\'' + ", payWindow2='" + this.payWindow2 + '\'' + ", cacNo2='" + this.cacNo2 + '\'' + ", postingDate2=" + this.postingDate2 + ", postingBillMonth2='" + this.postingBillMonth2 + '\'' + ", readingMonth1='" + this.readingMonth1 + '\'' + ", readingDate1=" + this.readingDate1 + ", reading1=" + this.reading1 + ", consumeUnit1=" + this.consumeUnit1 + ", readingMonth2='" + this.readingMonth2 + '\'' + ", readingDate2=" + this.readingDate2 + ", reading2=" + this.reading2 + ", consumeUnit2=" + this.consumeUnit2 + ", readingMonth3='" + this.readingMonth3 + '\'' + ", readingDate3=" + this.readingDate3 + ", reading3=" + this.reading3 + ", consumeUnit3=" + this.consumeUnit3 + ", readingMonth4='" + this.readingMonth4 + '\'' + ", readingDate4=" + this.readingDate4 + ", reading4=" + this.reading4 + ", consumeUnit4=" + this.consumeUnit4 + ", readingMonth5='" + this.readingMonth5 + '\'' + ", readingDate5=" + this.readingDate5 + ", reading5=" + this.reading5 + ", consumeUnit5=" + this.consumeUnit5 + ", readingMonth6='" + this.readingMonth6 + '\'' + ", readingDate6=" + this.readingDate6 + ", reading6=" + this.reading6 + ", consumeUnit6=" + this.consumeUnit6 + ", sdHeld=" + this.sdHeld + ", meterIdentifier='" + this.meterIdentifier + '\'' + ", serialNo='" + this.serialNo + '\'' + ", make='" + this.make + '\'' + ", meterOwner='" + this.meterOwner + '\'' + ", capacity='" + this.capacity + '\'' + ", contact1='" + this.contact1 + '\'' + ", contactPhone1='" + this.contactPhone1 + '\'' + ", contactDesignation1='" + this.contactDesignation1 + '\'' + ", contact2='" + this.contact2 + '\'' + ", contactPhone2='" + this.contactPhone2 + '\'' + ", contactDesignation2='" + this.contactDesignation2 + '\'' + ", meterReader='" + this.meterReader + '\'' + ", meterReaderMobileNo='" + this.meterReaderMobileNo + '\'' + ", averageBill=" + this.averageBill + ", averageUnit=" + this.averageUnit + ", billRoundAmount=" + this.billRoundAmount + ", billMonth1=" + this.billMonth1 + ", billMonth2=" + this.billMonth2 + ", billMonth3=" + this.billMonth3 + ", billMonth4=" + this.billMonth4 + ", totalSubsidy=" + this.totalSubsidy + ", subTotal=" + this.subTotal + ", billMafiAmount=" + this.billMafiAmount + ", saral=" + this.saral + ", billMafi=" + this.billMafi + ", revised=" + this.revised + ", bpl=" + this.bpl + ", beneficiary=" + this.beneficiary + ", labourRegistrationNo='" + this.labourRegistrationNo + '\'' + ", connectionType='" + this.connectionType + '\'' + ", saralSubsidy=" + this.saralSubsidy + ", meteringStatus='" + this.meteringStatus + '\'' + ", employee=" + this.employee + ", xray=" + this.xray + ", seasonal=" + this.seasonal + ", subCategoryCode=" + this.subCategoryCode + ", purposeOfInstallationId=" + this.purposeOfInstallationId + ", revenueCategory=" + this.revenueCategory + ", igjySubsidy=" + this.igjySubsidy + ", unpostedPayment=" + this.unpostedPayment + ", divisionCode='" + this.divisionCode + '\'' + ", isNetMeter=" + this.isNetMeter + ", solarPlantCapacity=" + this.solarPlantCapacity + ", carryForwardUnit=" + this.carryForwardUnit + ", exportCurrentRead=" + this.exportCurrentRead + ", exportPreviousRead=" + this.exportPreviousRead + ", exportMF=" + this.exportMF + ", exportMeteredUnit=" + this.exportMeteredUnit + ", exportAssessment=" + this.exportAssessment + ", exportTotalUnit=" + this.exportTotalUnit + ", netMeteredUnit=" + this.netMeteredUnit + ", netTotalUnit=" + this.netTotalUnit + ", solarGeneratorCurrentRead=" + this.solarGeneratorCurrentRead + ", solarGeneratorPreviousRead=" + this.solarGeneratorPreviousRead + ", solarGeneratorMF=" + this.solarGeneratorMF + ", solarGeneratorMeteredUnit=" + this.solarGeneratorMeteredUnit + ", solarGeneratorAssessment=" + this.solarGeneratorAssessment + ", solarGeneratorTotalUnit=" + this.solarGeneratorTotalUnit + '}';
    }
}
