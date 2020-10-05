package com.tai.lambsaDemo;

import java.util.Arrays;
import java.util.Comparator;

public class Demo1 implements Comparator<String> {
    /*
    order=1  正向
    order=-1 反向
     */
    private int order = 0;

//    Demo1() {}

    Demo1(int order) {this.order = order;}

    public static void main(String[] args)
    {
        String[] arr = new String[]{"Mercury", "Venus", "Jupiter", "Earth", "Mars"};
        System.out.println("sort by Default=>" + Arrays.toString(arr));
        //        Arrays.sort(arr, (first, second) -> first.length() - second.length());
        Arrays.sort(arr);
        System.out.println("sort by Dictionory=>" + Arrays.toString(arr));

        Arrays.sort(arr, new Demo1(-1));
        System.out.println("sort by Length==>" + Arrays.toString(arr));
    }

    @Override
    public int compare(String o1, String o2)
    {
        if (order == 1)
        {return o1.length() - o2.length();}
        else if (order == -1)
        { return o2.length() - o1.length();}
        else
        {
            throw new RuntimeException("無法判斷錯誤");
        }
    }
}

