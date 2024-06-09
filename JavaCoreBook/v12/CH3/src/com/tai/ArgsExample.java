package com.tai;

public class ArgsExample {
    public static void main(String[] args) {
        if (args.length == 0 || args[0].equals("-n")) {
            System.out.println("Hello");
        } else if (args[0].equals("-g")) {
            System.out.println("Goodbye");
        }

        for (String arg : args)     //java ArgsExample -g cruel world
            System.out.println(arg);
    }
}
