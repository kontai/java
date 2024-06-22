package com.tai;

import java.util.Arrays;

public class ForeachExample {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        for(var x :arr){
            System.out.println(x);
        }

        System.out.println(Arrays.toString(arr));

        int[] copieArr=Arrays.copyOf(arr,arr.length*2); //拷貝+擴充數組，並將新增的元素填人0
        System.out.println("Arr Length: "+copieArr.length) ;
        System.out.println("Arr: "+Arrays.toString(copieArr));

    }
}
