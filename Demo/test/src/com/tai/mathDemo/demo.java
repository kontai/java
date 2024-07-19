package com.tai.mathDemo;

import org.junit.Test;

import java.math.BigInteger;

/**
 * ClassName: demo
 * Package: com.tai.mathDemo
 * Description:
 *
 * @Author Kontai
 * @Create 2024/7/17 下午10:06
 * @Version 1.0
 */
public class demo {
    @Test

    //統計水仙花數(exp: 153 = 1*1*1 + 5*5*5 + 3*3*3)
    public void test1() {
        int a, b, c;
        int cnt = 0;
        for (int i = 100; i < 999; i++) {
            a = i / 100;    //百位
            b = i % 100 / 10;
            c = i % 10;
            if (Math.pow(a, 3) + Math.pow(b, 3) + Math.pow(c, 3) == i) {
                System.out.println("i = " + i);
                cnt++;
            }
        }
        System.out.println("cnt = " + cnt);
    }

    @Test
    public void test2() {
        /*This code snippet creates two BigInteger objects in Java.

bi1 is created by passing the string "10" to the BigInteger constructor.
bd2 is created by calling the BigInteger.valueOf() method with the argument 10 (enumTest.java).
Both bi1 and bd2 will hold the value of the number 10. The main difference is that bi1 is created using the constructor, while bd2 is created using a convenience method.
        * */
        BigInteger bi1 = new BigInteger("10");
        BigInteger bi2 = BigInteger.valueOf(10); //BigInteger.valueOf(val) 參數在0~2的4次方內，效率最高
        {
            System.out.println("bd1: " + bi1);
            System.out.println("bd2: " + bi2);

            //BigInteger.max(bi1, bi2)
            BigInteger max = bi1.max(bi2);
            System.out.println("max: " + max);

            //BigInteger.min(bi1, bi2)
            BigInteger pow = bi1.pow(3);
            System.out.println(pow);
        }
    }
}
