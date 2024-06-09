package com.tai;

import java.time.LocalDate;

public class Program {
    public static void main(String[] args) {
        Manager m1 = new Manager(10);
        Manager[] mags=new Manager[3];
        mags[0]=new Manager(1000);
        Empoyee[] emps=mags;
//        emps[0]=new Empoyee();  //ArrayStoreException
//        System.out.println(m1.getSalary());
//        System.out.println(m1.getName());
        double salary = emps[0].getSalary();
        System.out.println(salary);


    }
}

class Empoyee {
    private String name;
    private double salary;
    private LocalDate hireday;

    public Empoyee() {
        this.name = "tai";
        this.salary = 100;
        this.hireday = LocalDate.now();
    }
//    public Empoyee(String name, double salary, LocalDate hireday) {
//        this.name = name;
//        this.salary = salary;
//        this.hireday = hireday;
//    }

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

    public LocalDate getGireKay() {
        return hireday;
    }

    public void setGireKay(LocalDate hireday) {
        this.hireday = hireday;
    }
}

class Manager extends Empoyee {
    private double bouns;

    public Manager(double bouns) {
        this.bouns = bouns;
    }

    public double getBouns() {
        return bouns;
    }

    public double getSalary() {
        return super.getSalary() + bouns;
    }
}

final class Excutive extends Manager{
    public Excutive(){
        super(100);
    };

}

