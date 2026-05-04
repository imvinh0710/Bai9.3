package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Calculator {
    private static final Logger logger = LoggerFactory.getLogger(Calculator.class);

    public int sum(int a, int b) {
        logger.info("Calculating sum of {} and {}", a, b);
        int result = a + b;
        logger.debug("Result: {}", result);
        return result;
    }

    public int subtract(int a, int b) {
        logger.info("Calculating difference of {} and {}", a, b);
        int result = a - b;
        logger.debug("Result: {}", result);
        return result;
    }
}
