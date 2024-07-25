package com.tai.GenericExam;

/**
 * ClassName: huskyDog
 * Package: com.tai.GenericExam
 * Description:
 *
 * @Author Kontai
 * @Create 2024/7/22 上午9:01
 * @Version 1.0
 */
public class huskyDog extends Dog{
    public huskyDog(String name, int age) {
        super(name, age);
    }

    @Override
    public void Eat() {
        System.out.println("一只叫做"+getName()+"的，"+getAge()+"歲的哈士奇狗，正在吃骨頭，邊吃邊拆家");
    }
}
