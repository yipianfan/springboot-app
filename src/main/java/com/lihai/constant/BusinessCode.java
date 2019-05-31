package com.lihai.constant;

public enum BusinessCode {
    PARAMETER_ERROR(100_400_000, "传参错误");

    private int code;
    private String msg;

    BusinessCode(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int code() {return code;}

    public String msg() {return msg;}
}