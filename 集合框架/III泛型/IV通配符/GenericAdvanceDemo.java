package 集合框架.III泛型.IV通配符;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class GenericAdvanceDemo {

    /**
     * @param args
     */
    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<String>();

        al.add("abc");
        al.add("hehe");

        ArrayList<Integer> al2 = new ArrayList<Integer>();

        al2.add(5);
        al2.add(67);

        printCollection(al);
        printCollection2(al2);
    }

    /**
     * 迭代並打印集合中元素。
     * 當傳遞對象不確定時,且對象無任何操作,可以使用通配符<?>
     *
     * @param al
     */

    public static  void printCollection(Collection<?> al) {

        Iterator<?> it = al.iterator();

        while (it.hasNext()) {
//			String  str = it.next();
//            System.out.println(str);
            System.out.println(it.next().toString());
        }
    }

    /**
     * 當傳遞對象不確定時,且要對所傳遞對象有操作,可以使用自定義泛型
     *
     * @param al
     * @param <T>
     * @return
     */
    public static <T> void printCollection2(Collection<T> al) {

        Iterator<T> it = al.iterator();


        while (it.hasNext()) {
            T str = it.next();
            System.out.println(str);
//            System.out.println(it.next().toString());
        }
    }

}
