package com.tai.Reflect.classDemo;

import com.tai.Reflect.constructor.Student;

/**
 * ClassName: inrto
 * Package: com.tai.Reflect
 * Description:
 *
 * @Author Kontai
 * @Create 9/1/24 6:33 PM
 * @Version 1.0
 */
public class ClassDemo {
    public static void main(String[] args) throws ClassNotFoundException {
        // 1
        Class claz1 = Class.forName("com.tai.Reflect.constructor.Student");
        System.out.println(claz1);


        Class claz2 = Student.class;
        System.out.println(claz2);

        Student student = new Student();
        Class Claz3 = student.getClass();
        System.out.println(Claz3);

        System.out.println(claz1 == claz2);
        System.out.println(claz2 == Claz3);
    }
}
