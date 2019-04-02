package com.von.rpc.common.entity;

import java.io.Serializable;

/**
 * @author ： fjl
 * @date ： 2019/4/1/001 16:16
 */
public class MRpcResponse implements Serializable {
    private static final long serialVersionUID = 4671234732097347795L;

    /**请求id 唯一标示每次请求,响应请求的时候要求返回对应的请求id*/
    private String requestId;

    /**返回结果(如果有)*/
    private Object data;

    /**执行异常(如果有)*/
    private Throwable throwable;

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getRequestId() {
        return requestId;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Throwable getThrowable() {
        return throwable;
    }

    public void setThrowable(Throwable throwable) {
        this.throwable = throwable;
    }
}
