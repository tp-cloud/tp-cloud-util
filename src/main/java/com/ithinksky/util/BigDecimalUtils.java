package com.ithinksky.util;


import java.math.BigDecimal;

/**
 * BigDecimal 四则运算
 *
 * @author tengpeng.gao
 */
public final class BigDecimalUtils {

    /**
     * Add big decimal.
     *
     * @param v1 the v1
     * @param v2 the v2
     * @return the big decimal
     */
    public static BigDecimal add(double v1, double v2) {
        BigDecimal b1 = BigDecimal.valueOf(v1);
        BigDecimal b2 = BigDecimal.valueOf(v2);
        return b1.add(b2);
    }

    /**
     * Subtract big decimal.
     *
     * @param v1 the v1
     * @param v2 the v2
     * @return the big decimal
     */
    public static BigDecimal subtract(double v1, double v2) {
        BigDecimal b1 = BigDecimal.valueOf(v1);
        BigDecimal b2 = BigDecimal.valueOf(v2);
        return b1.subtract(b2);
    }

    /**
     * Multiply big decimal.
     *
     * @param v1 the v1
     * @param v2 the v2
     * @return the big decimal
     */
    public static BigDecimal multiply(double v1, double v2) {
        BigDecimal b1 = BigDecimal.valueOf(v1);
        BigDecimal b2 = BigDecimal.valueOf(v2);
        return b1.multiply(b2);
    }

    /**
     * Divide big decimal.
     * 保留两位小数
     *
     * @param v1 the v1
     * @param v2 the v2
     * @return the big decimal
     */
    public static BigDecimal divide(double v1, double v2) {
        BigDecimal b1 = BigDecimal.valueOf(v1);
        BigDecimal b2 = BigDecimal.valueOf(v2);
        return b1.divide(b2, 2, BigDecimal.ROUND_HALF_UP);
    }

}
