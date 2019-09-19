package com.lihai.constant;

public enum BusinessCode {
    PARAMETER_ERROR(400, "parameter error"),
    OK(200, "ok");

    private int code;
    private String msg;

    BusinessCode(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int code() {return code;}

    public String msg() {return msg;}
}