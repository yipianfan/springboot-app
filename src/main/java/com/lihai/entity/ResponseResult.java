package com.lihai.entity;

import static com.lihai.constant.BusinessCode.SUCCESS;

public class ResponseResult<T> {
    private int code;
    private int businessCode;
    private String msg;
    private T data;

    public ResponseResult(int code, int businessCode, String msg, T data) {
        this.code = code;
        this.businessCode = businessCode;
        this.msg = msg;
        this.data = data;
    }

    public static <T> ResponseResult<T> ok(T data) {
        return new ResponseResult<>(SUCCESS.code(), 0, SUCCESS.msg(), data);
    }
}