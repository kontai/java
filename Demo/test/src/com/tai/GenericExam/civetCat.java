package com.tai.GenericExam;

/**
 * ClassName: civetCat
 * Package: com.tai.GenericExam
 * Description:
 *
 * @Author Kontai
 * @Create 2024/7/22 上午8:52
 * @Version 1.0
 */
public class civetCat extends Cat {
    public civetCat(String name, int age) {
        super(name, age);
    }

    @Override
    public void Eat() {
        System.out.println("一只叫做"+getName()+"的，"+getAge()+"歲的狸花貓，正在吃魚");
    }
}
