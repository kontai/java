package com.tai.testInterfaceDefault;

public class Person {
    private String name;
    private int age;

    public Person()
    {
        this.name = null;
        this.age = 0;
    }

    public Person(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString()
    {
        return "name=" + name + ",age=" + age;
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


    public int getSize()
    {
        if (name!= null)
        { return name.length() + age; }
        else
        { return 0; }
    }
}
