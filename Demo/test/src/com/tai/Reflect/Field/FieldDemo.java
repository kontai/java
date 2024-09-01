package com.tai.Reflect.Field;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/**
 * ClassName: FieldDemo
 * Package: com.tai.Reflect.Field
 * Description:
 *
 * @Author Kontai
 * @Create 9/1/24 7:33 PM
 * @Version 1.0
 */
public class FieldDemo {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException {
        Class<?> aClass = Class.forName("com.tai.Reflect.Field.Student");

        //getFields() 获取所有公共字段
/*
        Field[] fields = aClass.getFields();
        for (Field field : fields) {
            System.out.println(field);
        }
*/

        //getDeclaredFields() 获取所有字段(公共和私有)
/*
        Field[] declaredFields = aClass.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println(declaredField);
        }
*/
        //getField() 获取指定的公共字段
/*
        Field gender = aClass.getField("gender");
        System.out.println(gender);
*/
        Field name = aClass.getDeclaredField("name");
        System.out.println(name);
        System.out.println(Modifier.toString(name.getModifiers()));

        // 获取字段的名字
        System.out.println(name.getName());

        // 获取字段的类型
        System.out.println(name.getType());


    }
}
