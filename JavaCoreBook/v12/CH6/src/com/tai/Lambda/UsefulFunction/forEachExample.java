package com.tai.Lambda.UsefulFunction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Consumer;

//需求：假设有一个字符串列表，需要打印出其中所有长度大于3的字符串.

public class forEachExample {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("One", "Two", "Three"));
        //method1    非匿名內部類
        for (String str : list) {
            if (str.length() > 3) {
                System.out.println(str);
            }
        }

        //method2   匿名內部類
        list.forEach(new Consumer<String>(){
            @Override
            public void accept(String str){
                if(str.length()>3)
                    System.out.println(str);
            }
        });

        //method3   Lambda表達式
        list.forEach(str -> {
            if (str.length() > 3) {
                System.out.println(str);
            }
        });
        //method3
//        list.forEach(System.out::println);

    }
}
