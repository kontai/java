package com.tai.FuZi;

/**
 * ClassName: SuperDemo
 * Package: com.tai.FuZi
 * Description:
 *
 * @Author Kontai
 * @Create 2024/7/5 上午12:51
 * @Version 1.0
 */
public class Creature {
    //聲明屬性、方法、構造器

}

class Animal extends Creature{
    //動物類

}

class Dog extends Animal{
    //狗類
}

class DogTest{
    public static void main(String[] args) {
        Dog dog=new Dog();
    }
}