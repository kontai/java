package com.tai.pojo;

public class Account {
    private String accno;
    private String name;
    private int password;
    private double balance;

    public String getAccno() {
        return accno;
    }

    public void setAccno(String accno) {
        this.accno = accno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    @Override
    public String toString() {
        return "Account{" +
                "accno='" + accno + '\'' +
                ", name='" + name + '\'' +
                ", password=" + password +
                ", balance=" + balance +
                '}';
    }
}

