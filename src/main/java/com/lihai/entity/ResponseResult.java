package com.lihai.entity;

import java.io.Serializable;

import static com.lihai.constant.BusinessCode.OK;
import static com.lihai.constant.BusinessCode.PARAMETER_ERROR;

public class ResponseResult<T> implements Serializable {
    private int businessCode;
    private String msg;
    private T data;

    public ResponseResult(int businessCode, String msg, T data) {
        this.businessCode = businessCode;
        this.msg = msg;
        this.data = data;
    }

    public static <T> ResponseResult<T> ok(T data) {return new ResponseResult<>(OK.code(), OK.msg(), data);}

    public static <T> ResponseResult<T> client(T data) {return new ResponseResult<>(PARAMETER_ERROR.code(), PARAMETER_ERROR.msg(), data);}

    public static <T> ResponseResult<T> custom(int bCode, String msg, T data) {return new ResponseResult<>(bCode, msg, data);}
}