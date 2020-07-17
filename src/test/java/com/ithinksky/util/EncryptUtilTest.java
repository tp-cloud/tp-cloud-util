package com.ithinksky.util;

import com.ithinksky.util.helper.AppTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Encrypt 算法 单元测试
 *
 * @author tengpeng.gao
 */
class EncryptUtilTest extends AppTest {

    @Test
    void encoderByMd5False() {
        String admin = EncryptUtil.encoderMd5("admin", false);
        log.info(" encoderByMd5False === {}", admin);
        Assertions.assertTrue("21232F297A57A5A743894A0E4A801FC3".equals(admin));
    }

    @Test
    void encoderByMd5True() {
        String admin = EncryptUtil.encoderMd5("admin", true);
        log.info(" encoderByMd5True === {}", admin);
        Assertions.assertTrue("21232f297a57a5a743894a0e4a801fc3".equals(admin));
    }

    @Test
    void encoderByMd5Default() {
        String admin = EncryptUtil.encoderMd5("admin");
        log.info(" encoderByMd5Default === {}", admin);
        Assertions.assertTrue("21232f297a57a5a743894a0e4a801fc3".equals(admin));
    }

    @Test
    void encoderBySHA512False() {
        String admin = EncryptUtil.encoderSHA512("admin", false);
        log.info(" encoderBySHA512False === {}", admin);
        Assertions.assertTrue("C7AD44CBAD762A5DA0A452F9E854FDC1E0E7A52A38015F23F3EAB1D80B931DD472634DFAC71CD34EBC35D16AB7FB8A90C81F975113D6C7538DC69DD8DE9077EC".equals(admin));
    }

    @Test
    void encoderBySHA512True() {
        String admin = EncryptUtil.encoderSHA512("admin", true);
        log.info(" encoderBySHA512True === {}", admin);
        Assertions.assertTrue("c7ad44cbad762a5da0a452f9e854fdc1e0e7a52a38015f23f3eab1d80b931dd472634dfac71cd34ebc35d16ab7fb8a90c81f975113d6c7538dc69dd8de9077ec".equals(admin));
    }

    @Test
    void encoderBySHA512Default() {
        String admin = EncryptUtil.encoderSHA512("admin");
        log.info(" encoderBySHA512Default === {}", admin);
        Assertions.assertTrue("c7ad44cbad762a5da0a452f9e854fdc1e0e7a52a38015f23f3eab1d80b931dd472634dfac71cd34ebc35d16ab7fb8a90c81f975113d6c7538dc69dd8de9077ec".equals(admin));
    }
}