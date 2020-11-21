package com.tai.TestLog;


import org.apache.log4j.Logger;

/**
 * @author kontai
 */
public class testLog {
    public static void main(String[] args) {
        Logger logger=Logger.getLogger(testLog.class);
        logger.info("log4j info test");

    }
}
