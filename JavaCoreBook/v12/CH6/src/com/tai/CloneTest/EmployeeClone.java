package com.tai.CloneTest;

import java.util.Date;
import java.util.GregorianCalendar;

public class EmployeeClone {
    public static void main(String[] args) throws CloneNotSupportedException {
        Employee emp1 = new Employee(1, "John", new Date());
        Employee emp2 = emp1.clone();
        emp1.setHireday((new GregorianCalendar(2020,01,01,12,02,34).getTime()));
        System.out.println("emp1 hireday: " + emp1.getHireday());
        System.out.println("emp2.hireday: " + emp2.getHireday());
    }
}

class Employee implements Cloneable {
    private int id;
    private String name;
    private Date hireday;

    public Employee clone() throws CloneNotSupportedException {
        Employee cloned = (Employee) super.clone();
        cloned.hireday=(Date)hireday.clone();
        return cloned;
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

    public Date getHireday() {
        return hireday;
    }

    public void setHireday(Date hireday) {
        this.hireday = hireday;
    }

    public Employee(int id, String name, Date hireday) {
        this.id = id;
        this.name = name;
        this.hireday=hireday;
    }

}
