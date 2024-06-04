package com.tai;

import java.io.Console;
import java.util.Scanner;

public class getInput {
    public static void main(String[] args) {
        /*
        Scanner in=new Scanner(System.in);

        System.out.println("loaction?");
        String loc = in.nextLine();

        System.out.println("Your location is "+loc);

         */

        Console cons = System.console();
        String username = cons.readLine("User name");
        char[] password = cons.readPassword("Password");
        System.out.println(password);


    }
}
