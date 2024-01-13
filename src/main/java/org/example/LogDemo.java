package org.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogDemo {
    private static final Logger log = LoggerFactory.getLogger("logger");

    public static void main(String[] args) {
        log.info("info");
        log.error("error");
        log.trace("trace");
        log.warn("warn");
    }
}
