package com.von.rpc.common.entity;

import java.util.Arrays;

/**
 * @author : vons
 * @version : 1.0
 * @date : 2019/4/3 19:34
 */
public class MRpcMethod {

    /**
     * 方法名称
     */
    private String name;
    /**
     * 方法参数
     */
    private Object[] args;
    /**
     * 参数类型
     */
    private Class<?>[] paramType;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Object[] getArgs() {
        return args;
    }

    public void setArgs(Object[] args) {
        this.args = args;
    }

    public Class<?>[] getParamType() {
        return paramType;
    }

    public void setParamType(Class<?>[] paramType) {
        this.paramType = paramType;
    }

    @Override
    public String toString() {
        return "MRpcMethod{" +
                "name='" + name + '\'' +
                ", args=" + Arrays.toString(args) +
                ", paramType=" + Arrays.toString(paramType) +
                '}';
    }
}
