package Test1116.com.tai.reflaect01;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class Demo1 {


    public static void main(String[] args) throws Exception {
        //創建Class類對象
        Class clazz = Class.forName("Test1116.com.tai.reflaect01.Student");

        //獲取所有公有屬性
        Field[] fds = clazz.getFields();
        for (Field fs : fds) {
            System.out.println("屬性名稱(public)" + fs.getName());

        }

        //獲取所有(含非公有)屬性
        Field[] fdsDc = clazz.getDeclaredFields();
        System.out.println("****************");
        for (Field fs : fdsDc) {
            System.out.println("屬性名稱(All)" + fs.getName());
            System.out.println("類型"+fs.getType());
        }

        Field f=clazz.getDeclaredField("sname");
        Object o=clazz.getConstructor().newInstance();
        //修改非靜態屬性
        f.set(o,"jj");
        //獲取非靜態屬性值
        System.out.println(f.get(o));


    }
}
