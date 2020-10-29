package com.kontai.reflection1;

public class Person {
    private String name;
    private int age;

    public Person()
    {
        this.name=null;
        this.age=1;
//        System.out.println("Person無參構造被調用");
    }

    ;

    public Person(String name, int age)
    {
        super();
        this.name = name;
        this.age = age;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }


}
