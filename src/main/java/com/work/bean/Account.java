package com.work.bean;

/**
 * @author peacoke
 * @date 2021/8/11
 */
public class Account {

    private int no;
    private String account;
    private String name;
    private String password;
    private String accountType;
    private String tel;

    public Account() {
    }

    public Account(String account, String name, String password, String accountType, String tel) {
        this.account = account;
        this.name = name;
        this.password = password;
        this.accountType = accountType;
        this.tel = tel;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }
}
