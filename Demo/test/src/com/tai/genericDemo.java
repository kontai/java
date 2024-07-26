package com.tai;

import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

/**
 * ClassName: genericDemo
 * Package: com.tai
 * Description:
 *
 * @Author Kontai
 * @Create 2024/7/21 下午10:09
 * @Version 1.0
 */
public class genericDemo<T> implements MyInterface<T> {
    public static <E> void addAll(Collection<E> list, E... e) {
        for (E e1 : e) {
            list.add(e1);
        }
    }

    @Override
    public T get() {
        return null;
    }

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        genericDemo.addAll(list, "1", "2", "3", "4", "5");
        System.out.println(list);

        genericDemo<Integer> gd2 = new genericDemo<>();
        Integer i = gd2.get();
        System.out.println("i:" + i);
    }

}

interface MyInterface<T> {
    T get();
}
