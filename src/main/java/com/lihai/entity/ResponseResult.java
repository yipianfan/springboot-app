package com.lihai.entity;

import java.io.Serializable;

public class ResponseResult<T> implements Serializable {
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