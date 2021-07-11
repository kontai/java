package com.tai.MyWeb.User;

import java.util.Date;
import java.util.Objects;

public class User {
    private int uid;
    private String uname;
    private String pwd;
    private Date date;

    public User(String uname, String pwd) {
//        this.uid = uid;
        this.uname = uname;
        this.pwd = pwd;
        this.date = new Date();
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public User() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return uid == user.uid && Objects.equals(uname, user.uname) && Objects.equals(pwd, user.pwd) && Objects.equals(date, user.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uid, uname, pwd, date);
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }
}
