package com.tai.demo1718.vo;

import java.util.Date;
import java.util.Objects;

public class User {
    private int uid;
    private String uname;
    private String pwd;
    private String sex;
    private Date birth;

    public User(String uname) {
        this.uname = uname;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return getUid() == user.getUid() && getSex() == user.getSex() && getUname().equals(user.getUname()) && getPwd().equals(user.getPwd()) && getBirth().equals(user.getBirth());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getUid(), getUname(), getPwd(), getSex(), getBirth());
    }

    @Override
    public String toString() {
        return "User{" +
                "uid=" + uid +
                ", uname='" + uname + '\'' +
                ", pwd='" + pwd + '\'' +
                ", sex=" + sex +
                ", birth=" + birth +
                '}';
    }

}
