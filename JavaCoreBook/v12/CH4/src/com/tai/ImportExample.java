package com.tai;

import static java.lang.System.*;

public class ImportExample {
    public static void main(String[] args) {
        out.println("this is static import example");
        exit(0);

        AnotherClass ac=new AnotherClass();
        ac.number=10;
        ac.name="tai";
    }
}

class AnotherClass{
     int number;
     String name;
}
