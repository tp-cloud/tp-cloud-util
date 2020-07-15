package com.ithinksky.util.http;

import com.ithinksky.util.helper.AppTest;
import com.ithinksky.util.helper.JsonUtil;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * ApiResult 单元测试
 *
 * @author tengpeng.gao
 */
class ApiResultTest extends AppTest {

    @Test
    void successBase() {
        ApiResult success = ApiResult.SUCCESS;
        String string = JsonUtil.toJsonString(success);
        log.info("ApiResult.SUCCESS === {}", string);
        Assertions.assertTrue("{\"code\":100200,\"message\":\"成功\",\"data\":null}".equals(string));
    }

    @Test
    void successData() {
        ApiResult success = ApiResult.success("true");
        String string = JsonUtil.toJsonString(success);
        log.info("ApiResult.successData === {}", string);
        Assertions.assertTrue("{\"code\":100200,\"message\":\"成功\",\"data\":\"true\"}".equals(string));
    }

    @Test
    void successDataMap() {
        HashMap<String, Object> result = new HashMap<>();
        result.put("flag", true);
        result.put("list", new ArrayList<>());
        ApiResult success = ApiResult.success(result);
        String string = JsonUtil.toJsonString(success);
        log.info("ApiResult.successDataMap === {}", string);
        Assertions.assertTrue("{\"code\":100200,\"message\":\"成功\",\"data\":{\"flag\":true,\"list\":[]}}".equals(string));
    }

    @Test
    void error() {
        ApiResult error = ApiResult.ERROR;
        String string = JsonUtil.toJsonString(error);
        log.info("ApiResult.ERROR === {}", string);
        Assertions.assertTrue("{\"code\":100500,\"message\":\"服务器内部错误\",\"data\":null}".equals(string));
    }

    @Test
    void build() {
        ApiResult error = new ApiResult.ApiResultBuilder<Map<String, Object>>().code(100404).message("什么鬼啊，异常了").build();
        String string = JsonUtil.toJsonString(error);
        log.info("ApiResult.build === {}", string);
        Assertions.assertTrue("{\"code\":100404,\"message\":\"什么鬼啊，异常了\",\"data\":null}".equals(string));
    }
}