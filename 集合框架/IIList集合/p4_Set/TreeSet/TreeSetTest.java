package 集合框架.IIList集合.p4_Set.TreeSet;

import java.util.Iterator;
import java.util.TreeSet;


/*
 * 对字符串进行长度排序。
 *
 * "20 18 -1 89 2 67"
 */

public class TreeSetTest {

    /**
     * @param args
     */
    public static void main(String[] args) {

        TreeSet ts = new TreeSet(new ComparatorByLength());

        ts.add("aaaaa");
        ts.add("zz");
        ts.add("nbaq");
        ts.add("cba");
        ts.add("abc");

        Iterator it = ts.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }
    }

}
