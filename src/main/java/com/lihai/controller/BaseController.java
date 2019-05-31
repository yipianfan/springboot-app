package com.lihai.controller;

import com.lihai.entity.ResponseResult;

public class BaseController {

    /** 请求成功且业务正常 */
    protected <T> ResponseResult<T> ok(int code, String msg, T data) {
        return new ResponseResult<>(code, 1, msg, data);
    }

    /** 请求成功 */
    protected <T> ResponseResult<T> business(int code, String msg, T data) {
        return new ResponseResult<>(code, 0, msg, data);
    }

    /** 服务出现异常 */
    protected <T> ResponseResult<T> error(int code, String msg, T data) {
        return new ResponseResult<>(code, 0, msg, data);
    }

    /** 前台传参错误，如类型匹配，数据超出规定范围 */
    protected <T> ResponseResult<T> parameterError(int code, String msg) {
        return new ResponseResult<>(code, 0, msg, null);
    }
}