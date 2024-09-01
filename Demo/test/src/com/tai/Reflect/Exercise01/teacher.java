package com.tai.Reflect.Exercise01;

/**
 * ClassName: teacher
 * Package: com.tai.Reflect.Exercise01
 * Description:
 *
 * @Author Kontai
 * @Create 9/1/24 10:27 PM
 * @Version 1.0
 */
public class teacher {
    private String name;
    private double salary;

    public teacher() {
    }

    public teacher(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
