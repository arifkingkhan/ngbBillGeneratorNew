//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.mppkvvcl.util;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.swing.table.DefaultTableModel;
import org.apache.commons.beanutils.PropertyUtils;
import org.pentaho.reporting.engine.classic.core.ClassicEngineBoot;
import org.pentaho.reporting.engine.classic.core.MasterReport;
import org.pentaho.reporting.engine.classic.core.ReportProcessingException;
import org.pentaho.reporting.engine.classic.core.TableDataFactory;
import org.pentaho.reporting.engine.classic.core.cache.DataCacheFactory;
import org.pentaho.reporting.engine.classic.core.modules.output.pageable.pdf.PdfReportUtil;
import org.pentaho.reporting.engine.classic.core.modules.output.table.html.HtmlReportUtil;
import org.pentaho.reporting.engine.classic.core.modules.output.table.xls.ExcelReportUtil;
import org.pentaho.reporting.libraries.resourceloader.Resource;
import org.pentaho.reporting.libraries.resourceloader.ResourceManager;
import org.slf4j.Logger;
import org.springframework.util.StringUtils;

public class PentahoUtility {
    private static final Logger logger = GlobalResources.getLogger(PentahoUtility.class);
    private static ClassicEngineBoot classicEngineBoot = null;

    public PentahoUtility() {
    }

    private static ClassicEngineBoot getClassicEngineBootInstance() {
        String methodName = "getClassicEngineBootInstance() : ";
        logger.info(methodName + "called");
        if (classicEngineBoot == null) {
            Class var1 = ClassicEngineBoot.class;
            synchronized(ClassicEngineBoot.class) {
                if (classicEngineBoot == null) {
                    logger.info(methodName + "Instantiating Pentaho Classic boot engine");
                    classicEngineBoot = ClassicEngineBoot.getInstance();
                    classicEngineBoot.start();
                }
            }
        }

        return classicEngineBoot;
    }

    public static MasterReport bootReport(final URL reportURL) {
        String methodName = "bootReport() : ";
        logger.info("bootReport() : called");
        if (reportURL == null) {
            logger.error("bootReport() : Report URL is null");
            return null;
        } else {
            getClassicEngineBootInstance();
            MasterReport report = null;
            DataCacheFactory.getCache().getCacheManager().clearAll();

            try {
                Resource resource = (new ResourceManager()).createDirectly(reportURL, MasterReport.class);
                report = (MasterReport)resource.getResource();
            } catch (Exception var4) {
                var4.printStackTrace();
                logger.error("bootReport() : " + var4.getMessage());
            }

            return report;
        }
    }

    public static TableDataFactory getDataFactory(final String tableName, final Object dataObject) {
        String methodName = "getDataFactory() : ";
        logger.info("getDataFactory() : called");
        if (!StringUtils.isEmpty(tableName) && dataObject != null) {
            TableDataFactory dataFactory = null;

            try {
                Map<String, Object> fieldMap = PropertyUtils.describe(dataObject);
                fieldMap.values().removeIf(Objects::isNull);
                Object[] columns = fieldMap.keySet().toArray();
                int rowCount = 1;
                List<Object[]> dataSet = new ArrayList();
                dataSet.add(fieldMap.values().toArray());
                Object[][] data = new Object[rowCount][];
                dataSet.toArray(data);
                DefaultTableModel tableModel = new DefaultTableModel(data, columns);
                dataFactory = new TableDataFactory();
                dataFactory.addTable(tableName, tableModel);
            } catch (Exception var10) {
                logger.error("getDataFactory() : " + var10.getMessage(), var10);
            }

            return dataFactory;
        } else {
            logger.error("getDataFactory() : Input param(s) is null");
            return null;
        }
    }

    public static TableDataFactory getDataFactory(final String tableName, List<? extends Object> dataObjects, String[] columnsExpected) {
        String methodName = "getDataFactory() : ";
        logger.info("getDataFactory() : called");
        if (!StringUtils.isEmpty(tableName) && !ReportUtility.isEmpty(dataObjects)) {
            TableDataFactory dataFactory = null;

            try {
                List<Object[]> dataSet = new ArrayList();
                Object[] columns = null;
                Map<String, Object> fieldMap = null;

                for(Iterator var8 = dataObjects.iterator(); var8.hasNext(); dataSet.add(fieldMap.values().toArray())) {
                    Object dataObject = var8.next();
                    fieldMap = PropertyUtils.describe(dataObject);
                    if (columnsExpected != null && columnsExpected.length > 0) {
                        fieldMap.keySet().retainAll(Arrays.asList(columnsExpected));
                    }

                    if (columns == null) {
                        columns = fieldMap.keySet().toArray();
                    }
                }

                logger.info("Iterated over all rows");
                Object[][] data = new Object[dataObjects.size()][];
                dataSet.toArray(data);
                logger.info("Put the elements from list in the array");
                DefaultTableModel tableModel = new DefaultTableModel(data, columns);
                dataFactory = new TableDataFactory();
                logger.info("Set the table inside data factory");
                dataFactory.addTable(tableName, tableModel);
            } catch (Exception var10) {
                logger.error(var10.getMessage(), var10);
                logger.error("getDataFactory() : " + var10.getMessage());
            }

            return dataFactory;
        } else {
            logger.error("getDataFactory() : Input param(s) is null");
            return null;
        }
    }

    public static void cleanReport(final MasterReport report) {
        String methodName = "cleanReport() : ";
        logger.info("cleanReport() : called");
        if (report == null) {
            logger.error("cleanReport() : Master report is null");
        } else {
            if (report.getResourceManager() != null) {
                report.getResourceManager().getBundleCache().clear();
                report.getResourceManager().getDataCache().clear();
                report.getResourceManager().getFactoryCache().clear();
            }

            if (report.getDataFactory() != null) {
                report.getDataFactory().close();
            }

        }
    }

    public static ByteArrayOutputStream getOutputStream(final MasterReport report, String fileFormat) {
        String methodName = "getOutputStream() : ";
        logger.info("getOutputStream() : called");
        logger.info("Incoming format: " + fileFormat);
        logger.info("Parameter values: " + report.getParameterValues());
        if (report != null && fileFormat != null) {
            ByteArrayOutputStream out = new ByteArrayOutputStream();

            try {
                if ("PDF".equals(fileFormat)) {
                    PdfReportUtil.createPDF(report, out);
                } else if ("XLSX".equals(fileFormat)) {
                    ExcelReportUtil.createXLSX(report, out);
                } else if ("HTML".equals(fileFormat)) {
                    HtmlReportUtil.createStreamHTML(report, out);
                } else {
                    logger.error("getOutputStream() : Unsupported file format " + fileFormat);
                }
            } catch (ReportProcessingException var5) {
                logger.error("getOutputStream() : " + var5.getMessage());
            }

            return out;
        } else {
            logger.error("getOutputStream() : Master report / file format is null");
            return null;
        }
    }

    public static byte[] getBytesFromReport(final MasterReport report, final String fileFormat) {
        String methodName = "getBytesFromReport() : ";
        logger.info("getBytesFromReport() : called");
        if (report != null && !StringUtils.isEmpty(fileFormat)) {
            byte[] bytes = null;

            try {
                ByteArrayOutputStream outputStream = getOutputStream(report, fileFormat);
                Throwable var5 = null;

                try {
                    if (outputStream != null) {
                        bytes = outputStream.toByteArray();
                    }
                } catch (Throwable var15) {
                    var5 = var15;
                    throw var15;
                } finally {
                    if (outputStream != null) {
                        if (var5 != null) {
                            try {
                                outputStream.close();
                            } catch (Throwable var14) {
                                var5.addSuppressed(var14);
                            }
                        } else {
                            outputStream.close();
                        }
                    }

                }
            } catch (IOException var17) {
                logger.error("getBytesFromReport() : " + var17.getMessage());
            }

            return bytes;
        } else {
            logger.error("getBytesFromReport() : Input param(s) is null");
            return null;
        }
    }

    public static boolean storeFileFromReport(final MasterReport report, final String fileFormat, final String fullFilePath) {
        String methodName = "storeFileFromReport() : ";
        logger.info("storeFileFromReport() : called");
        if (report != null && fileFormat != null && !StringUtils.isEmpty(fullFilePath)) {
            boolean fileSaved = false;

            try {
                File file = new File(fullFilePath);
                file.getParentFile().mkdirs();
                if ("PDF".equals(fileFormat.toUpperCase())) {
                    PdfReportUtil.createPDF(report, fullFilePath);
                } else if ("XLSX".equals(fileFormat.toUpperCase())) {
                    ExcelReportUtil.createXLSX(report, fullFilePath);
                } else {
                    logger.error("storeFileFromReport() : Unsupported file format " + fileFormat);
                }

                fileSaved = true;
            } catch (IOException | ReportProcessingException var9) {
                logger.error("storeFileFromReport() : " + var9.getMessage());
                fileSaved = false;
            } finally {
                cleanReport(report);
            }

            return fileSaved;
        } else {
            logger.error("storeFileFromReport() : Input param(s) is null");
            return false;
        }
    }
}
