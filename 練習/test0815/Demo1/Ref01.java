//import MyMethod.MyMethod;

import java.io.PrintStream;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Type;

/**
 * @author kontai
 */
public class Ref01 {
    public static void main(String[] args) throws ClassNotFoundException
    {
        Class<?> clazz = Class.forName("MyTest");
        ShowFields(clazz);

        try
        {
            ShowMethods(clazz);
        } catch (Exception e)
        {
            e.printStackTrace();
        }

        


    }

    private static void ShowMethods(Class<?> clazz) throws InvocationTargetException, IllegalAccessException
    {
        Method[] methods = clazz.getDeclaredMethods();
        for (Method m : methods)
        {
            if (m.getName().contains("set"))
            {
                System.out.printf("\n" + m.getName() + "---->");
                Class<?>[] c=m.getParameterTypes();
                 for(Class<?> cc:c)
                 {
                     System.out.printf(cc.getSimpleName()+"\t");
                 }
                //                m.invoke(m, "1")
            }
        }
    }

    private static void ShowFields(Class<?> clazz)
    {
        Field[] fields = clazz.getDeclaredFields();
        //        Field[] fields = clazz.getFields();
        for (Field f : fields)
        {
            System.out.println(f);
        }
    }
}
