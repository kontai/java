package com.tai.Reflect.constructor;

/**
 * ClassName: Student
 * Package: com.tai.Reflect
 * Description:
 *
 * @Author Kontai
 * @Create 9/1/24 6:34 PM
 * @Version 1.0
 */
public class Student {

    private String name;
    private int age;

    public Student() {
        this.name = null;
        this.age = 20;
    }

    public Student(String name) {
        this.name = name;
        this.age = 20;
    }

    protected Student(int age) {
        this.age = age;
        this.name = null;
    }

    private Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
