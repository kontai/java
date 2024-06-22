package com.tai.Lambda;

import java.math.BigInteger;
import java.util.Random;
import java.util.function.Consumer;

public class FuncInterface {
    public static void main(String[] args) {
        repeat(10,i-> System.out.println("Countdown: "+(9-i)));
        IntConsumer ic=i-> System.out.println(i);
        ic.accept(20);


        String str="9239402958102900 ";
        boolean prob = str.strip().transform(BigInteger::new).isProbablePrime(20);
        System.out.println(prob);

    }

    static void repeat(int n,IntConsumer action){
        for(int i=0;i<n;i++){
            action.accept(i);
        }
    }
}


