package com.tai;

/**
 * ClassName: test
 * Package: com.tai
 * Description:
 *
 * @Author Kontai
 * @Create 2024/7/3 下午5:50
 * @Version 1.0
 */

public class test {
    public static void main(String[] args) {
        test t = new test();
        System.out.println(t.rec(100));
        System.out.println(t.regular(100));
        System.out.println(t.j1(5));
    }

    public int rec(int i) {
        if (i == 1) {
            return 1;
        } else {
            return rec(i - 1) + i;
        }
    }

    public int regular(int i) {
        int sum = 0;
        for (int j = 1; j <= i; j++) {
            sum += j;
        }
        return sum;
    }

    public int j1(int i1) {
        if (i1 == 1) {
            return 1;
        } else {
            return i1 * rec(i1 - 1);
        }
    }
}
