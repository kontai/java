package com.tai;

import java.util.Objects;

public class equalsExample {
    public static void main(String[] args) {
        String strA = "abc";
        String strB = "a" + "b" ;
        String strC = strA;
        System.out.println(Objects.hash(strA, strB, strC));

        //"==" is used to compare two objects reference
        System.out.println("strA==strB?" + (strA == strB));
        System.out.println("strA==strC?" + (strA == strC));

        //"equals" is used to compare two objects value
        System.out.println("strA.equals(strB)?" + (strA.equals(strB)));
        System.out.println("strA.equals(strC)?" + (strA.equals(strC)));
        System.out.println();

        System.out.println("Hello".hashCode());
        System.out.println(getHash("Hello"));
    }

     static int getHash(String str){
        int hash=0;
        for (int i = 0; i < str.length(); i++) {
            hash=31*hash+str.charAt(i);
        }
        return hash;
    }

}
