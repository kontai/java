package com.tai.dao;

import java.util.Objects;

public class User {
    private String aid = null;
    private String uname;
    private String pwd;

    public User(String uname, String pwd) {
        this.uname = uname;
        this.pwd = pwd;
    }

    public String getAid() {
        return aid;
    }

    public void setAid(String aid) {
        this.aid = aid;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        User user = (User) o;
        return getAid().equals(user.getAid()) && getPwd().equals(user.getPwd()) && getUname().equals(user.getUname());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getAid(), getUname(), getPwd());
    }
}
