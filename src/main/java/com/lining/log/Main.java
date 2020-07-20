package com.lining.log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;

import java.util.UUID;

/**
 * @author lining
 * @version 1.0.0
 */
public class Main {

    private static final Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        MDC.put("REQUEST_ID", UUID.randomUUID().toString());
        System.out.println(System.getProperty("user.dir"));
        System.out.println(System.getProperty("user.home"));
        System.out.println(System.getProperty("log4j.configurationFile"));
        // Log4j will inspect the "log4j.configurationFile" system property and,
        // if set, will attempt to load the configuration using the ConfigurationFactory that matches the file extension.
        //If no system property is set the properties ConfigurationFactory will look for log4j2-test.properties in the classpath.
        //If no such file is found the YAML ConfigurationFactory will look for log4j2-test.yaml or log4j2-test.yml in the classpath.
        //If no such file is found the JSON ConfigurationFactory will look for log4j2-test.json or log4j2-test.jsn in the classpath.
        //If no such file is found the XML ConfigurationFactory will look for log4j2-test.xml in the classpath.
        //If a test file cannot be located the properties ConfigurationFactory will look for log4j2.properties on the classpath.
        //If a properties file cannot be located the YAML ConfigurationFactory will look for log4j2.yaml or log4j2.yml on the classpath.
        //If a YAML file cannot be located the JSON ConfigurationFactory will look for log4j2.json or log4j2.jsn on the classpath.
        //If a JSON file cannot be located the XML ConfigurationFactory will try to locate log4j2.xml on the classpath.
        //If no configuration file could be located the DefaultConfiguration will be used. This will cause logging output to go to the console.
        //monitorInterval="1"可以实现热加载
        logger.warn("test");
        while (true) {
            logger.debug("debug");
            logger.info("info");
            logger.warn("warn");
            logger.error("error");
        }
    }

}
