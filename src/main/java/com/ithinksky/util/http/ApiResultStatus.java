package com.ithinksky.util.http;

/**
 * @author tengpeng.gao
 */
public enum ApiResultStatus {

    /**
     * 成功
     */
    SUCCESS(100200, "成功"),

    /**
     * 服务器内部错误
     */
    ERROR(100500, "服务器内部错误"),

    /**
     * 请求参数错误
     */
    PARAM_ERROR(100600, "参数错误"),

    // add other

    ;

    /**
     * 状态码
     */
    private final int value;

    /**
     * 描述
     */
    private final String reasonPhrase;

    ApiResultStatus(int value, String reasonPhrase) {
        this.value = value;
        this.reasonPhrase = reasonPhrase;
    }

    public int getValue() {
        return value;
    }

    public String getReasonPhrase() {
        return reasonPhrase;
    }

    public static ApiResultStatus valueOf(int value) {
        for (ApiResultStatus status : values()) {
            if (status.value == value) {
                return status;
            }
        }
        throw new IllegalArgumentException("No matching constant for [" + value + "]");
    }

    public static ApiResultStatus resolve(int value) {
        for (ApiResultStatus status : values()) {
            if (status.value == value) {
                return status;
            }
        }
        return null;
    }

}
