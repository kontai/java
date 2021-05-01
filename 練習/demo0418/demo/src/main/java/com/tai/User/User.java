package com.tai.User;

import com.tai.Address.Address;

import java.util.Objects;

/**
 * @author kontai
 */
public class User {
    private String uname;
    private int age;
    private int height;
    private Address addr;

    public User(String uname, int age, int height, Address addr) {
        this.uname = uname;
        this.age = age;
        this.height = height;
        this.addr = addr;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Address getAddr() {
        return addr;
    }

    public void setAddr(Address addr) {
        this.addr = addr;
    }

    @Override
    public String toString() {
        return "User{" +
                "uname='" + uname + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", addr=" + addr +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return age == user.age && height == user.height && Objects.equals(uname, user.uname) && Objects.equals(addr, user.addr);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uname, age, height, addr);
    }
}
