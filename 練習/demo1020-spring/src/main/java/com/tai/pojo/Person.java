package com.tai.pojo;

public class Person {
    private int id;
    private String name;
    private Student student;

    public Person() {
        System.out.println("無參構造啟動");
    }

    public Person(int id, String name, Student student) {
        this.id = id;
        this.name = name;
        this.student = student;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student studnet) {
        this.student = studnet;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", studnet=" + student +
                '}';
    }
}
