//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.mppkvvcl.util;

import com.mppkvvcl.dto.BillDTO;
import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import org.slf4j.Logger;
import org.springframework.util.StringUtils;

public class BillFileReader {
    private static final Logger logger = GlobalResources.getLogger(BillFileReader.class);
    private static final SimpleDateFormat billFileDateFormat = new SimpleDateFormat("dd/MM/yyyy");

    public BillFileReader() {
    }

    public static List<BillDTO> readBillFile(File billFile) throws FileNotFoundException, ParseException, Exception {
        logger.info("Reading and parsing Bill file: " + billFile);
        Scanner scanner = new Scanner(billFile);
        List<BillDTO> billDTOs = new ArrayList();
        if (!scanner.hasNext()) {
            logger.error("Empty bill File found. Discarding it");
            return null;
        } else {
            scanner.nextLine();

            while(scanner.hasNextLine()) {
                try {
                    String billRow = scanner.nextLine();
                    String[] billTokens = billRow.split("\t", -1);
                    if (billTokens.length < 147) {
                        logger.error("Discarding bill File. Number of tokens are less than 147");
                        return null;
                    }

                    BillDTO billDto = parseBillFileTokens(billTokens);
                    billDTOs.add(billDto);
                    logger.info("Parsed Bill File Row: " + billDto);
                } catch (ParseException var6) {
                    logger.error(var6.getMessage(), var6);
                    return null;
                } catch (Exception var7) {
                    logger.error(var7.getMessage(), var7);
                    return null;
                }
            }

            scanner.close();
            return billDTOs;
        }
    }

    private static BillDTO parseBillFileTokens(String[] billFileTokens) throws ParseException {
        BillDTO billDTO = new BillDTO();
        billDTO.setDivisionName(billFileTokens[0]);
        billDTO.setTariffCode(billFileTokens[1]);
        billDTO.setLocationCode(billFileTokens[2]);
        billDTO.setGroupNo(billFileTokens[3]);
        billDTO.setReadingDiaryNo(billFileTokens[4]);
        billDTO.setConsumerNo(billFileTokens[5]);
        billDTO.setServiceNo(billDTO.getGroupNo().concat(" - ").concat(billDTO.getReadingDiaryNo()).concat(" - ").concat(billDTO.getConsumerNo()));
        billDTO.setBillMonth(billFileTokens[6]);
        billDTO.setBillNumber(billFileTokens[7]);
        billDTO.setBillDate(StringUtils.isEmpty(billFileTokens[8]) ? null : billFileDateFormat.parse(billFileTokens[8]));
        billDTO.setTotalUnit(StringUtils.isEmpty(billFileTokens[9]) ? BigDecimal.ZERO : new BigDecimal(billFileTokens[9]));
        billDTO.setConsumerName(billFileTokens[10]);
        billDTO.setAddress1(billFileTokens[11]);
        billDTO.setNetBill(StringUtils.isEmpty(billFileTokens[12]) ? BigDecimal.ZERO : new BigDecimal(billFileTokens[12]));
        billDTO.setAddress2(billFileTokens[13]);
        billDTO.setAddress3(billFileTokens[14]);
        billDTO.setMobileNo(billFileTokens[16]);
        billDTO.setChequeDueDate(billFileDateFormat.parse(billFileTokens[17]));
        billDTO.setDueDate(billFileDateFormat.parse(billFileTokens[18]));
        billDTO.setPoleNo(billFileTokens[19]);
        billDTO.setMeterIdentifier(billFileTokens[20]);
        billDTO.setPhase(billFileTokens[21]);
        billDTO.setCurrentReadDate(billFileDateFormat.parse(billFileTokens[22]));
        billDTO.setSanctionedLoad(StringUtils.isEmpty(billFileTokens[23]) ? BigDecimal.ZERO : new BigDecimal(billFileTokens[23]));
        billDTO.setSanctionedLoadUnit(billFileTokens[24]);
        billDTO.setSanctionedLoadWithUnit(billDTO.getSanctionedLoad().toString().concat(" ").concat(billDTO.getSanctionedLoadUnit()));
        billDTO.setReadingType(billFileTokens[25]);
        billDTO.setContractDemandWithUnit(billFileTokens[26]);
        billDTO.setBilledMD(StringUtils.isEmpty(billFileTokens[27]) ? BigDecimal.ZERO : new BigDecimal(billFileTokens[27]));
        billDTO.setCurrentRead(StringUtils.isEmpty(billFileTokens[28]) ? BigDecimal.ZERO : new BigDecimal(billFileTokens[28]));
        billDTO.setPreviousRead(StringUtils.isEmpty(billFileTokens[29]) ? BigDecimal.ZERO : new BigDecimal(billFileTokens[29]));
        billDTO.setMf(StringUtils.isEmpty(billFileTokens[30]) ? BigDecimal.ZERO : new BigDecimal(billFileTokens[30]));
        billDTO.setBilledPF(StringUtils.isEmpty(billFileTokens[31]) ? BigDecimal.ZERO : new BigDecimal(billFileTokens[31]));
        billDTO.setDifference(StringUtils.isEmpty(billFileTokens[32]) ? BigDecimal.ZERO : new BigDecimal(billFileTokens[32]));
        billDTO.setAssessment(StringUtils.isEmpty(billFileTokens[33]) ? BigDecimal.ZERO : new BigDecimal(billFileTokens[33]));
        billDTO.setBilledUnit(StringUtils.isEmpty(billFileTokens[34]) ? BigDecimal.ZERO : new BigDecimal(billFileTokens[34]));
        billDTO.setZoneName(billFileTokens[36]);
        billDTO.setZoneAddress(billFileTokens[37]);
        billDTO.setEnergyCharge(StringUtils.isEmpty(billFileTokens[38]) ? BigDecimal.ZERO : new BigDecimal(billFileTokens[38]));
        billDTO.setFixedCharge(StringUtils.isEmpty(billFileTokens[40]) ? BigDecimal.ZERO : new BigDecimal(billFileTokens[40]));
        billDTO.setElectricityDuty(StringUtils.isEmpty(billFileTokens[42]) ? BigDecimal.ZERO : new BigDecimal(billFileTokens[42]));
        billDTO.setMeterRent(StringUtils.isEmpty(billFileTokens[44]) ? BigDecimal.ZERO : new BigDecimal(billFileTokens[44]));
        billDTO.setContact1(billFileTokens[45]);
        billDTO.setContactPhone1(billFileTokens[47]);
        billDTO.setSdInterest(StringUtils.isEmpty(billFileTokens[48]) ? BigDecimal.ZERO : new BigDecimal(billFileTokens[48]));
        billDTO.setPfCharge(StringUtils.isEmpty(billFileTokens[49]) ? BigDecimal.ZERO : new BigDecimal(billFileTokens[49]));
        billDTO.setContact2(billFileTokens[50]);
        billDTO.setContactPhone2(billFileTokens[52]);
        billDTO.setPurposeOfInstallation(billFileTokens[54]);
        billDTO.setSdHeld(StringUtils.isEmpty(billFileTokens[55]) ? BigDecimal.ZERO : new BigDecimal(billFileTokens[55]));
        billDTO.setBillType(billFileTokens[57]);
        billDTO.setAsdArrear(StringUtils.isEmpty(billFileTokens[58]) ? BigDecimal.ZERO : new BigDecimal(billFileTokens[58]));
        billDTO.setSdInterest(StringUtils.isEmpty(billFileTokens[60]) ? BigDecimal.ZERO : new BigDecimal(billFileTokens[60]));
        billDTO.setLockCreditWithLoadFactorIncentive(StringUtils.isEmpty(billFileTokens[62]) ? BigDecimal.ZERO : new BigDecimal(billFileTokens[62]));
        billDTO.setOtherRebates(StringUtils.isEmpty(billFileTokens[64]) ? BigDecimal.ZERO : new BigDecimal(billFileTokens[64]));
        billDTO.setSubsidy(StringUtils.isEmpty(billFileTokens[66]) ? BigDecimal.ZERO : new BigDecimal(billFileTokens[66]));
        billDTO.setArrear(StringUtils.isEmpty(billFileTokens[69]) ? BigDecimal.ZERO : new BigDecimal(billFileTokens[69]));
        billDTO.setReadingMonth1(billFileTokens[71]);
        billDTO.setReadingDate1(StringUtils.isEmpty(billFileTokens[72]) ? null : billFileDateFormat.parse(billFileTokens[72]));
        billDTO.setReading1(StringUtils.isEmpty(billFileTokens[73]) ? BigDecimal.ZERO : new BigDecimal(billFileTokens[73]));
        billDTO.setConsumeUnit1(StringUtils.isEmpty(billFileTokens[74]) ? BigDecimal.ZERO : new BigDecimal(billFileTokens[74]));
        billDTO.setReadingMonth2(billFileTokens[76]);
        billDTO.setReadingDate2(StringUtils.isEmpty(billFileTokens[77]) ? null : billFileDateFormat.parse(billFileTokens[77]));
        billDTO.setReading2(StringUtils.isEmpty(billFileTokens[78]) ? BigDecimal.ZERO : new BigDecimal(billFileTokens[78]));
        billDTO.setConsumeUnit2(StringUtils.isEmpty(billFileTokens[79]) ? BigDecimal.ZERO : new BigDecimal(billFileTokens[79]));
        billDTO.setReadingMonth3(billFileTokens[81]);
        billDTO.setReadingDate3(StringUtils.isEmpty(billFileTokens[82]) ? null : billFileDateFormat.parse(billFileTokens[82]));
        billDTO.setReading3(StringUtils.isEmpty(billFileTokens[83]) ? BigDecimal.ZERO : new BigDecimal(billFileTokens[83]));
        billDTO.setConsumeUnit3(StringUtils.isEmpty(billFileTokens[84]) ? BigDecimal.ZERO : new BigDecimal(billFileTokens[84]));
        billDTO.setReadingMonth4(billFileTokens[85]);
        billDTO.setReadingDate4(StringUtils.isEmpty(billFileTokens[86]) ? null : billFileDateFormat.parse(billFileTokens[86]));
        billDTO.setReading4(StringUtils.isEmpty(billFileTokens[87]) ? BigDecimal.ZERO : new BigDecimal(billFileTokens[87]));
        billDTO.setConsumeUnit4(StringUtils.isEmpty(billFileTokens[88]) ? BigDecimal.ZERO : new BigDecimal(billFileTokens[88]));
        billDTO.setReadingMonth5(billFileTokens[89]);
        billDTO.setReadingDate5(StringUtils.isEmpty(billFileTokens[90]) ? null : billFileDateFormat.parse(billFileTokens[90]));
        billDTO.setReading5(StringUtils.isEmpty(billFileTokens[91]) ? BigDecimal.ZERO : new BigDecimal(billFileTokens[91]));
        billDTO.setConsumeUnit5(StringUtils.isEmpty(billFileTokens[92]) ? BigDecimal.ZERO : new BigDecimal(billFileTokens[92]));
        billDTO.setReadingMonth6(billFileTokens[93]);
        billDTO.setReadingDate6(StringUtils.isEmpty(billFileTokens[94]) ? null : billFileDateFormat.parse(billFileTokens[94]));
        billDTO.setReading6(StringUtils.isEmpty(billFileTokens[95]) ? BigDecimal.ZERO : new BigDecimal(billFileTokens[95]));
        billDTO.setConsumeUnit6(StringUtils.isEmpty(billFileTokens[96]) ? BigDecimal.ZERO : new BigDecimal(billFileTokens[96]));
        billDTO.setAverageBill(StringUtils.isEmpty(billFileTokens[97]) ? BigDecimal.ZERO : new BigDecimal(billFileTokens[97]));
        billDTO.setAverageUnit(StringUtils.isEmpty(billFileTokens[98]) ? BigDecimal.ZERO : new BigDecimal(billFileTokens[98]));
        billDTO.setCircleName(billFileTokens[99]);
        billDTO.setOldServiceNo(billFileTokens[117]);
        billDTO.setSurchargeDemanded(StringUtils.isEmpty(billFileTokens[118]) ? BigDecimal.ZERO : new BigDecimal(billFileTokens[118]));
        billDTO.setMeterReader(billFileTokens[120]);
        billDTO.setSaral(strToBool(billFileTokens[122]));
        billDTO.setBillMonth1(StringUtils.isEmpty(billFileTokens[125]) ? BigDecimal.ZERO : new BigDecimal(billFileTokens[125]));
        billDTO.setTotalSubsidy(StringUtils.isEmpty(billFileTokens[126]) ? BigDecimal.ZERO : new BigDecimal(billFileTokens[126]));
        billDTO.setSubTotal(StringUtils.isEmpty(billFileTokens[127]) ? BigDecimal.ZERO : new BigDecimal(billFileTokens[127]));
        billDTO.setBillMonth2(StringUtils.isEmpty(billFileTokens[128]) ? BigDecimal.ZERO : new BigDecimal(billFileTokens[128]));
        billDTO.setBillMonth3(StringUtils.isEmpty(billFileTokens[129]) ? BigDecimal.ZERO : new BigDecimal(billFileTokens[129]));
        billDTO.setBillMonth4(StringUtils.isEmpty(billFileTokens[130]) ? BigDecimal.ZERO : new BigDecimal(billFileTokens[130]));
        billDTO.setPremiseType(billFileTokens[133]);
        billDTO.setCategory(billFileTokens[134]);
        billDTO.setBpl(strToBool(billFileTokens[135]));
        billDTO.setLockCredit(StringUtils.isEmpty(billFileTokens[138]) ? BigDecimal.ZERO : new BigDecimal(billFileTokens[138]));
        billDTO.setDivisionCode(billFileTokens[139]);
        billDTO.setOnlinePaymentRebate(StringUtils.isEmpty(billFileTokens[141]) ? BigDecimal.ZERO : new BigDecimal(billFileTokens[141]));
        billDTO.setPrepaidMeterRebate(StringUtils.isEmpty(billFileTokens[142]) ? BigDecimal.ZERO : new BigDecimal(billFileTokens[142]));
        billDTO.setPromptPaymentIncentive(StringUtils.isEmpty(billFileTokens[143]) ? BigDecimal.ZERO : new BigDecimal(billFileTokens[143]));
        billDTO.setAdvancePaymentIncentive(StringUtils.isEmpty(billFileTokens[144]) ? BigDecimal.ZERO : new BigDecimal(billFileTokens[144]));
        billDTO.setDemandSideIncentive(StringUtils.isEmpty(billFileTokens[145]) ? BigDecimal.ZERO : new BigDecimal(billFileTokens[145]));
        billDTO.setFcaCharge(StringUtils.isEmpty(billFileTokens[146]) ? BigDecimal.ZERO : new BigDecimal(billFileTokens[146]));
        return billDTO;
    }

    private static boolean strToBool(String str) {
        return "Y".equals(str);
    }
}
