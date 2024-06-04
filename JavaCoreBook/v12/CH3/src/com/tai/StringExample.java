package com.tai;

public class StringExample {
    public static void main(String[] args) {
        int num=11;
        String rating="PG"+num;
        System.out.println(rating);
        String repeated="JAVA".repeat(num);
        System.out.println(repeated);

        String isNull=null;

        //先判斷是否為null,因為null值上調用方法會出現錯誤
        if(isNull==null || isNull.isEmpty()){}

        String greeting="Hello";
        System.out.println(greeting.charAt(1));

    }
}
