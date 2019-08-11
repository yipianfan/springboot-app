package com.lihai.entity;

public class Account {
    private Integer uid;
    private String phone;
    private String account;
    private String password;

    public Integer getUid() {return uid;}

    public void setUid(Integer uid) {this.uid = uid;}

    public String getPhone() {return phone;}

    public void setPhone(String phone) {this.phone = phone;}

    public String getAccount() {return account;}

    public void setAccount(String account) {this.account = account;}

    public String getPassword() {return password;}

    public void setPassword(String password) {this.password = password;}

    @Override
    public String toString() {
        return "Account{" +
                "uid=" + uid +
                ", phone='" + phone + '\'' +
                ", account='" + account + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}