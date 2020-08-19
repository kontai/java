import java.lang.annotation.Annotation;

public class Call01 {
    public static void main(String[] args)
    {


        try
        {
            Class clazz = Class.forName("Demo1");
            System.out.println(clazz.getName());
            Annotation[] annotation = clazz.getAnnotations();
            for (Annotation a : annotation)
            {
                System.out.println(a);
            }
            anno1Table aTable= (anno1Table) clazz.getAnnotation(anno1Table.class);
            System.out.println(aTable.value());
        } catch (ClassNotFoundException e)
        {
            e.printStackTrace();
        }
    }
}
