package com.tai.Demo0710.User;

import java.util.Date;
import java.util.Objects;

public class User {

    private int uid;
    private String username;
    private String password;
    private char set;
    private short age;
    private Date birth;


    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }
    public User(int  uid){
       this.uid = uid;
    }

    public int  getUid() {
        return uid;
    }
    public void setUid(int  uid) {
        this.uid = uid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public char getSet() {
        return set;
    }

    public void setSet(char set) {
        this.set = set;
    }

    public short getAge() {
        return age;
    }

    public void setAge(short age) {
        this.age = age;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", set=" + set +
                ", age=" + age +
                ", birth=" + birth +
                '}';
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
        return set == user.set && age == user.age && Objects.equals(username, user.username) && Objects.equals(password, user.password) && Objects.equals(birth, user.birth);
    }

    @Override
    public int hashCode() {
        return Objects.hash(username, password, set, age, birth);
    }

}
