package com.tai.Reflect.Field;

/**
 * ClassName: Student
 * Package: com.tai.Reflect.Field
 * Description:
 *
 * @Author Kontai
 * @Create 9/1/24 7:30 PM
 * @Version 1.0
 */
public class Student {
    private String name;
    private int age;
    public String gender;

    public Student(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }
}
