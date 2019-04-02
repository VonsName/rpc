package com.von.rpc.common.exception;

/**
 * @author ： fjl
 * @date ： 2019/4/1/001 17:13
 */
public class RegisException extends RuntimeException {
    private static final long serialVersionUID = 12929365962374391L;

    private String message;

    public RegisException(String message) {
        super(message);
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
