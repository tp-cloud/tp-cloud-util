package com.ithinksky.util;

import org.apache.commons.codec.binary.Hex;
import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.lang3.StringUtils;

/**
 * 加密工具
 *
 * @author tengpeng.gao
 */
public class EncryptUtil {

    /**
     * Md5 基于 apache commons-codec 组件
     *
     * @param data        待加密数据
     * @param toLowerCase true - 小写，false - 大写
     * @return 已加密数据
     */
    public static final String encoderMd5(final String data, final boolean toLowerCase) {
        if (StringUtils.isEmpty(data)) {
            throw new IllegalArgumentException("data 不能为空！");
        }
        byte[] bytes = DigestUtils.md5(data);
        return Hex.encodeHexString(bytes, toLowerCase);
    }

    /**
     * Md5 基于 apache commons-codec 组件
     *
     * @param data 待加密数据
     * @return 已加密数据
     */
    public static final String encoderMd5(final String data) {
        return EncryptUtil.encoderMd5(data, true);
    }

    /**
     * SHA-512 基于 apache commons-codec 组件
     *
     * @param data        待加密数据
     * @param toLowerCase true - 小写，false - 大写
     * @return 已加密数据
     */
    public static final String encoderSHA512(final String data, final boolean toLowerCase) {
        if (StringUtils.isEmpty(data)) {
            throw new IllegalArgumentException("data 不能为空！");
        }
        byte[] bytes = DigestUtils.sha512(data);
        return Hex.encodeHexString(bytes, toLowerCase);
    }

    /**
     * SHA-512 基于 apache commons-codec 组件
     *
     * @param data 待加密数据
     * @return 已加密数据
     */
    public static final String encoderSHA512(final String data) {
        return EncryptUtil.encoderSHA512(data, true);
    }

}
