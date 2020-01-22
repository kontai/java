package 繼承;

import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
        Integer[] list1={1,2,3,4};
        Double[] list2={1.2,3.4,5.6,7.8};
        int[] list3={11,22,33,44};
        printArray(list1);
        printArray(list2);
//        printArray(list3);
    }

    public static void printArray(Object[] oj)
    {
        for(Object j:oj)
        {
            System.out.println(j+" ");
        }
        System.out.println();
    }
}
