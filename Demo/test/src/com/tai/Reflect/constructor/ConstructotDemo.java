package com.tai.Reflect.constructor;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * ClassName: ConstructotDemo
 * Package: com.tai.Reflect
 * Description:
 *
 * @Author Kontai
 * @Create 9/1/24 6:43 PM
 * @Version 1.0
 */

public class ConstructotDemo {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class aClass = Class.forName("com.tai.Reflect.constructor.Student");
        //getConstructors() 获取所有公共构造方法
/*
        Constructor[] cons = aClass.getConstructors();
        for (Constructor con : cons) {
            System.out.println(con);
        }
*/

        //getDeclaredConstructors() 获取所有构造方法(公共和私有)
/*
        Constructor[] decons = aClass.getDeclaredConstructors();
        for (Constructor decon : decons) {
            System.out.println(decon);
        }
*/
/*
        Constructor con = aClass.getConstructor(String.class);
        System.out.println(con);
*/

        Constructor decon = aClass.getDeclaredConstructor(String.class, int.class);
        System.out.println(decon);

        // 使用反射暴力破解私有构造方法
        decon.setAccessible(true);
        Student student = (Student) decon.newInstance("张三", 20);
        System.out.println(student);

    }
}
