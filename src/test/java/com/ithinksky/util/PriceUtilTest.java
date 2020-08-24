package com.ithinksky.util;

import com.ithinksky.util.helper.AppTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

/**
 * @author tengpeng.gao
 */
class PriceUtilTest extends AppTest {

    @Test
    void testHandleInteger() {
        Double value = 202222200.01d;
        String handle = PriceUtil.handleInteger(value);
        log.info("testHandleInteger ==== {}", handle);
        Assertions.assertTrue(handle.equals("202222200"));
    }

    @Test
    void testHandleInteger1() {
        BigDecimal value = new BigDecimal("202222200.01");
        String handle = PriceUtil.handleInteger(value);
        log.info("testHandleInteger1 ==== {}", handle);
        Assertions.assertTrue(handle.equals("202222200"));
    }

    @Test
    void testHandleMulti() {
        Double value = 202222200.01d;
        String handle = PriceUtil.handleInteger(value);
        log.info("testHandleMulti ==== {}", handle);
        Assertions.assertTrue(handle.equals("202222200"));
    }

    @Test
    void testHandleMulti2() {
        Float value = 202222200f;
        log.info("testHandleMulti2 ==== {}", new Double(value));
        String handle = PriceUtil.handleInteger(value.doubleValue());
        log.info("testHandleMulti2 ==== {}", handle);

        // 202222208
        Assertions.assertFalse(handle.equals("202222200"));
    }

    @Test
    void testHandleMulti1() {
        BigDecimal value = new BigDecimal("202222200.01");
        String handle = PriceUtil.handleInteger(value);
        log.info("testHandleMulti1 ==== {}", handle);
        Assertions.assertTrue(handle.equals("202222200"));
    }
}