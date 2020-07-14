package com.ithinksky.util;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

/**
 * BigDecimal 四则运算 单元测试
 *
 * @author tengpeng.gao
 */
class BigDecimalUtilsTest {

    private static Logger log = LogManager.getLogger(LogManager.ROOT_LOGGER_NAME);

    @Test
    void add() {
        BigDecimal add = BigDecimalUtils.add(0.22, 0.44);
        log.info(" add = {} ", add);
        Assertions.assertTrue(add.equals(new BigDecimal("0.66")));
    }

    @Test
    void subtract() {
        BigDecimal subtract = BigDecimalUtils.subtract(0.22, 0.44);
        log.info(" subtract = {} ", subtract);
        Assertions.assertTrue(subtract.equals(new BigDecimal("-0.22")));
    }

    @Test
    void multiply() {
        BigDecimal multiply = BigDecimalUtils.multiply(0.22, 0.44);
        log.info(" multiply = {} ", multiply);
        Assertions.assertTrue(multiply.equals(new BigDecimal("0.0968")));
    }

    @Test
    void divide() {
        BigDecimal divide = BigDecimalUtils.divide(0.22, 0.44);
        log.info(" divide = {} ", divide);
        Assertions.assertTrue(divide.equals(new BigDecimal("0.50")));
    }
}