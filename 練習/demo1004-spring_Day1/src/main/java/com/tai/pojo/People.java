package com.tai.pojo;

public class People {
    private String name;
    private short age;

    public People() {
        System.out.println(" 無參構造");
    }

    public People(String name, short age) {
        this.name = name;
        this.age = age;
        System.out.println("構造函數I");
    }

    public People( short age,String name) {
        this.name = name;
        this.age = age;
        System.out.println("構造函數II");
    }

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public short getAge() {
        return age;
    }

    public void setAge(short age) {
        this.age = age;
    }


}
