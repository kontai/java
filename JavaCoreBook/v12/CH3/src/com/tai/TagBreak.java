package com.tai;

import java.util.Scanner;

public class TagBreak {
    public static void main(String[] args) throws InterruptedException {
        int n=1000;
        read_data:
        while (n  != 0) {
            System.out.println();
            for(int i = 0 ; i < n ; i++){
                System.out.print("n");
                Thread.sleep(100);
                if(i==100)
                    break read_data;
            }
        }
        System.out.println();
        System.out.println("after the labeled break");
    }
}
