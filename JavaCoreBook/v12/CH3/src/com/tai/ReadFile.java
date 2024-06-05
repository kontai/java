package com.tai;


import java.io.IOException;
import java.nio.file.Path;
import java.util.Properties;
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args) throws IOException {
        System.out.println("啟動目錄是:"+System.getProperty("user.dir"));
        Scanner read=new Scanner(Path.of("test.txt") ); //會從啟動目錄尋找
        String str=read.nextLine();
        String[] s = str.split(" ");
        for(int i=0;i<s.length;i++){
            System.out.printf("%-4s %d\n",s[i],s[i].length());
        }
//        System.out.println(read.nextLine());

    }
}
