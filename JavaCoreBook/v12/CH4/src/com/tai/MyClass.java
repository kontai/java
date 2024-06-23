package com.tai;

import java.util.Random;
import java.util.random.RandomGenerator;

public class MyClass {
    private static int nextId;
    private int id = advanceId();
    private int number;
    private String name;

    static Random generator = new Random();

    static {
        RandomGenerator g = RandomGenerator.of("L64X128MixRandom");
        nextId = generator.nextInt(1000);
    }

    public static void main(String[] args) {
        MyClass mc = new MyClass(23);
        MyClass mc2 = new MyClass(24);
        MyClass mc3 = new MyClass();
    }

    MyClass() {
        System.out.println("無參構造函數執行");
    }

    MyClass(int number) {
        this("ID: " + nextId);
        System.out.println("MyClass constructor int");
        this.number = number;
    }

    MyClass(String name) {
        System.out.println("MyClass constructor String");
        this.name = name;

    }


    private static int advanceId() {
        int r = nextId;
        nextId++;
        System.out.println("Method advanceID() is called");
        System.out.println("nextId: " + nextId);
        return r;
    }
}

class SubClass {

}

