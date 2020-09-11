//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.mppkvvcl.util;

import java.io.File;
import java.net.URL;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.StringUtils;

public class GlobalResources {
    private static final Logger logger = getLogger(GlobalResources.class);

    public GlobalResources() {
    }

    public static URL getImageUrl(String imageName) {
        if (StringUtils.isEmpty(imageName)) {
            logger.error("Image name is empty");
            return null;
        } else {
            URL url = null;

            try {
                url = (new File("..\\resources\\mpwz.png")).toURI().toURL();
            } catch (Exception var3) {
                logger.error(var3.getMessage(), var3);
            }

            return url;
        }
    }

    public static URL getReportUrl() {
        URL url = null;

        try {
            url = (new File("\\desk\\ngb-bill-generator\\src\\main\\resources\\bill_english_vr_2.prpt")).toURI().toURL();
        } catch (Exception var2) {
            logger.error(var2.getMessage(), var2);
        }

        return url;
    }

    public static Logger getLogger(Class className) {
        return LoggerFactory.getLogger(className);
    }
}
