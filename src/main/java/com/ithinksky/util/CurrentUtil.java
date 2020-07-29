package com.ithinksky.util;

/**
 * 获取当前生效配置/属性相关（类似于监控）
 *
 * @author tengpeng.gao
 */
public class CurrentUtil {

    /**
     * 获取当前执行方法的简要名称
     *
     * @return
     */
    public static String getMethodSimpleName() {
        StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[2];
        String methodName = stackTraceElement.getMethodName();
        return methodName;
    }

    /**
     * 获取当前执行方法的全名称
     *
     * @return
     */
    public static String getClassMethodName() {
        StringBuilder result = new StringBuilder();
        StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[2];
        String className = stackTraceElement.getClassName();
        String methodName = stackTraceElement.getMethodName();
        result.append(className).append(".").append(methodName);
        return result.toString();
    }

}
