package com.ithinksky.util.http;

import java.io.Serializable;

/**
 * @author tengpeng.gao
 */
public class ApiResult<T> implements Serializable {

    /**
     * 状态码
     */
    private int code;

    /**
     * 描述信息
     */
    private String message;

    /**
     * 响应数据
     */
    private T data;

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public T getData() {
        return data;
    }

    private ApiResult() {

    }

    /**
     * 默认操作成功
     */
    public final static ApiResult SUCCESS = new ApiResultBuilder<>()
            .code(ApiResultStatus.SUCCESS.getValue())
            .message(ApiResultStatus.SUCCESS.getReasonPhrase())
            .build();

    /**
     * 默认操作失败
     */
    public final static ApiResult ERROR = new ApiResultBuilder<>()
            .code(ApiResultStatus.ERROR.getValue())
            .message(ApiResultStatus.ERROR.getReasonPhrase())
            .build();

    /**
     * 操作成功
     *
     * @param data 响应数据
     * @param <T>  响应数据的泛型
     * @return <code>ApiResult</code>
     */
    public static <T> ApiResult<T> success(T data) {
        return ApiResult.result(ApiResultStatus.SUCCESS, data);
    }

    /**
     * 自定义操作结果
     *
     * @param status <code>ApiResultStatus</code>接口响应状态
     * @param data   响应数据
     * @param <T>    响应数据的泛型
     * @return <code>ApiResult</code>
     */
    private static <T> ApiResult<T> result(ApiResultStatus status, T data) {
        return new ApiResultBuilder<T>()
                .code(status.getValue())
                .message(status.getReasonPhrase())
                .data(data)
                .build();
    }

    public static class ApiResultBuilder<T> {

        private ApiResult apiResult;

        public ApiResultBuilder() {
            apiResult = new ApiResult();
        }

        public ApiResultBuilder code(int code) {
            apiResult.code = code;
            return this;
        }

        public ApiResultBuilder message(String message) {
            apiResult.message = message;
            return this;
        }

        public ApiResultBuilder data(T data) {
            apiResult.data = data;
            return this;
        }

        public ApiResult build() {
            return apiResult;
        }

    }

}
