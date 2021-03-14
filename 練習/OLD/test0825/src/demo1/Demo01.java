package demo1;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.URL;

public class Demo01 {
    public static void main(String[] args)
    {
        Class clazz= null;
        try
        {
            clazz = Class.forName("java.lang.Integer");

        } catch (Exception e)
        {
            e.printStackTrace();
        }
        System.out.println(clazz.getSimpleName());
    }
}
