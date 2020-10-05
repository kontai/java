package com.tai.testInterfaceDefault;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo1 extends Person implements defaulTest, Num {
    private static Pattern pattern = null;
    private static Matcher matcher = null;

    public static void main(String[] args)
    {
        String testString3 = "0911-111111, 02-22222222, 0922-222222, 03-33333333";

        pattern = Pattern.compile("\\d{4}-\\d{6}");

        matcher = pattern.matcher(testString3);

        while (matcher.find())
        {

            System.out.println("matcher.group():\t" + matcher.group());
            System.out.println(matcher.start());
            System.out.println(matcher.end());

        }

        System.out.println(new Demo1().getSize());


    }

    @Override
    public int size()
    {
//        int size = Num.super.getSize();
        return 0;
    }

}