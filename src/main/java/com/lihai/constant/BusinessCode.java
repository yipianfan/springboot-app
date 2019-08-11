package com.lihai.constant;

public enum BusinessCode {
    PARAMETER_ERROR(400, "传参错误"),
    SUCCESS(200, "操作成功");

    private int code;
    private String msg;

    BusinessCode(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int code() {return code;}

    public String msg() {return msg;}
}