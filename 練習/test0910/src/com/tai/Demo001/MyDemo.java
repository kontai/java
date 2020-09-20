package com.tai.Demo001;

public class MyDemo {
    public static void main(String[] args)
    {
        String str1="abc";
        String str2="abc";
        String str3=new String("abc");
        Compare(str1,str3);
    }

    /**
     *
     * @param a Stirng
     * @param b String
     */
    static void Compare(String a,String b){
        System.out.println(a==b);
        System.out.println(a.equals(b));
    }
}

