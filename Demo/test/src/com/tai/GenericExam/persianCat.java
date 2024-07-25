package com.tai.GenericExam;

/**
 * ClassName: persianCat
 * Package: com.tai.GenericExam
 * Description:
 *
 * @Author Kontai
 * @Create 2024/7/22 上午8:48
 * @Version 1.0
 */
public class persianCat extends Cat {
    @Override
    public void Eat() {
        System.out.println("一只叫做" + getName() + "的，" + getAge() + "歲的波斯貓，正在吃常");
    }

    public persianCat(String name, int age) {
        super(name, age);
    }
}
