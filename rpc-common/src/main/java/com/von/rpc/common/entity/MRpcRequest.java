package com.von.rpc.common.entity;

import java.io.Serializable;

/**
 * @author ： fjl
 * @date ： 2019/4/1/001 16:16
 * 封装socket请求
 */
public class MRpcRequest implements Serializable {
    private static final long serialVersionUID = 2506719191368772206L;
    /**
     * 请求id 唯一标示每次请求
     */
    private String requestId;
    /**
     * 请求的类的全限定名
     */
    private String requestUrl;
    /**
     * 请求的方法
     */
    private MRpcMethod mRpcMethod;

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getRequestUrl() {
        return requestUrl;
    }

    public void setRequestUrl(String requestUrl) {
        this.requestUrl = requestUrl;
    }

    public MRpcMethod getmRpcMethod() {
        return mRpcMethod;
    }

    public void setmRpcMethod(MRpcMethod mRpcMethod) {
        this.mRpcMethod = mRpcMethod;
    }

    @Override
    public String toString() {
        return "MRpcRequest{" +
                "requestId='" + requestId + '\'' +
                ", requestUrl='" + requestUrl + '\'' +
                ", mRpcMethod=" + mRpcMethod +
                '}';
    }
}
