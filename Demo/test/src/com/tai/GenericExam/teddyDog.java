package com.tai.GenericExam;

/**
 * ClassName: teddyDog
 * Package: com.tai.GenericExam
 * Description:
 *
 * @Author Kontai
 * @Create 2024/7/22 上午8:55
 * @Version 1.0
 */
public class teddyDog extends Dog{
    public teddyDog(String name, int age) {
        super(name, age);
    }

    @Override
    public void Eat() {
        System.out.println("一只叫做"+getName()+"的，"+getAge()+"歲的泰迪狗，正在吃骨頭，邊吃邊蹭");
    }
}
