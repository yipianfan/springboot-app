package com.lihai.entity;

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
}