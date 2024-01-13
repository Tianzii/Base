package org.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LoggerTest {
    private static final Logger logger1 = LogManager.getLogger("Logger1");
    private static final Logger logger2 = LogManager.getLogger("Logger2");
    private static final Logger logger  = LogManager.getLogger(LoggerTest.class);

    public static void main(String[] args) {
        logger1.debug("This message will be logged to Logger1");
        logger2.debug("This message will be logged to Logger2");
        logger.info("test");
        logger.debug("test");
    }
}
