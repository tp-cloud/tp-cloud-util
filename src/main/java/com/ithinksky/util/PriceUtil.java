package com.ithinksky.util;

import cn.hutool.core.util.NumberUtil;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * 价格处理
 *
 * @author tengpeng.gao
 */
public class PriceUtil {


  public static String handleInteger(Double price) {
    Objects.requireNonNull(price, "price 不能为空");
    return NumberUtil.decimalFormat("##0", price);
  }

  public static String handleInteger(BigDecimal price) {
    Objects.requireNonNull(price, "price 不能为空");
    return NumberUtil.decimalFormat("##0", price);
  }

  public static String handleMulti(Double price) {
    Objects.requireNonNull(price, "price 不能为空");
    return NumberUtil.decimalFormat("##0.00", price);
  }

  public static String handleMulti(BigDecimal price) {
    Objects.requireNonNull(price, "price 不能为空");
    return NumberUtil.decimalFormat("##0.00", price);
  }
}
