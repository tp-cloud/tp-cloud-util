package com.ithinksky.util;

import com.ithinksky.util.helper.AppTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * 获取当前生效配置/属性相关（类似于监控）单元测试
 *
 * @author tengpeng.gao
 */
class CurrentUtilTest extends AppTest {

    @Test
    void getMethodSimpleName() {
        String methodSimpleName = CurrentUtil.getMethodSimpleName();
        log.info(" methodSimpleName ==== {}", methodSimpleName);
        Assertions.assertTrue("getMethodSimpleName".equals(methodSimpleName));
    }

    @Test
    void getClassMethodName() {
        String classMethodName = CurrentUtil.getClassMethodName();
        log.info(" classMethodName ==== {}", classMethodName);
        Assertions.assertTrue("com.ithinksky.util.CurrentUtilTest.getClassMethodName".equals(classMethodName));
    }

}