package com.von.rpc.common.entity;

import java.io.Serializable;
import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * @author ： fjl
 * @date ： 2019/4/1/001 16:16
 * 封装socket请求
 */
public class MRpcRequest implements Serializable {
    private static final long serialVersionUID = 2506719191368772206L;
    /**请求id 唯一标示每次请求*/
    private String requestId;
    /**请求参数*/
    private String param;
    /**请求方法*/
    private Method method;
    /**请求参数类型Class*/
    private Class<?> paramTypes;
    /**请求参数类型String*/
    private String[] paramStringTypes;

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getParam() {
        return param;
    }

    public void setParam(String param) {
        this.param = param;
    }

    public Method getMethod() {
        return method;
    }

    public void setMethod(Method method) {
        this.method = method;
    }

    public Class<?> getParamTypes() {
        return paramTypes;
    }

    public void setParamTypes(Class<?> paramTypes) {
        this.paramTypes = paramTypes;
    }

    public String[] getParamStringTypes() {
        return paramStringTypes;
    }

    public void setParamStringTypes(String[] paramStringTypes) {
        this.paramStringTypes = paramStringTypes;
    }

    @Override
    public String toString() {
        return "MRpcRequest{" +
                "requestId='" + requestId + '\'' +
                ", param='" + param + '\'' +
                ", method=" + method +
                ", paramTypes=" + paramTypes +
                ", paramStringTypes=" + Arrays.toString(paramStringTypes) +
                '}';
    }
}
