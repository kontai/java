package com.tai;

import java.util.Arrays;

public class VArargsExample {
    public static void main(String[] args) {
        double m=max(3.1,40.3,-5);
        System.out.println("max: "+m);
    }

    static double max(double... obj){
//        double[] dar=obj.clone();
//        Arrays.sort(dar);
//        return dar[dar.length-1];

        double largest=Double.NEGATIVE_INFINITY;
        for(var i:obj)
            if(i>largest)
                largest=i;
        return largest;
    }
}
