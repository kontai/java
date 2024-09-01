package com.tai.Reflect.Exercise01;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Field;

/**
 * ClassName: reflectDemo
 * Package: com.tai.Reflect.Exercise01
 * Description:
 *
 * @Author Kontai
 * @Create 9/1/24 10:28 PM
 * @Version 1.0
 */
public class reflectDemo {
    public static void main(String[] args) {
        Student student = new Student("Jack", 19, "male");
        teacher teacher = new teacher("Mary", 3000);
        reflectMethod(teacher);
    }

    static void reflectMethod(Object x) {
        Class aClass = x.getClass();
        Field[] dfileds = aClass.getDeclaredFields();
        BufferedWriter bw;
        try {
            bw = new BufferedWriter(new FileWriter("src/com/tai/Reflect/Exercise01/reflect.txt"));

            for (Field dfiled : dfileds) {
                String name = dfiled.getName();
                //設置權限
                dfiled.setAccessible(true);

                bw.write(name + " = " + dfiled.get(x));
                bw.newLine();
                bw.flush();

            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
        try {
            bw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
