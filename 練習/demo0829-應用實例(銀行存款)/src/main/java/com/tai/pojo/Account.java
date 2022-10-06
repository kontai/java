package com.tai.pojo;


/**
 * The type Account.
 * id ID
 * accNo:使用者帳戶
 * password:密碼
 * balance:帳戶餘額
 * name:姓名
 */
public class Account {
    private int id;
    private String accno;
    private int password;
    private double balance;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAccno() {
        return accno;
    }

    public void setAccno(String accno) {
        this.accno = accno;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
