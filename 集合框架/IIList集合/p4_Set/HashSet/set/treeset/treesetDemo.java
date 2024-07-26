package 集合框架.IIList集合.p4_Set.HashSet.set.treeset;

import org.junit.Test;

import java.util.Iterator;
import java.util.TreeSet;

/**
 * ClassName: treesetDemo
 * Package: 集合框架.IIList集合.p4_Set.HashSet.set.treeset
 * Description:
 *
 * @Author Kontai
 * @Create 2024/7/24 上午10:51
 * @Version 1.0
 */

/*
TreeSet
    可排序，不重複，無索引
    對於數值類型:Integer,Double,默認按照從小到大的順序進行排序
    對於字符、字符串類型:按照字符在ASCII碼表中的數字升序進行排序
 */
public class treesetDemo {
    @Test
    public void test(){
        TreeSet<Integer> ts=new TreeSet<>();
        ts.add(3);
        ts.add(1);
        ts.add(7);
        ts.add(5);

        System.out.println(ts);

        System.out.println("-----------------------");

        //method 1
        Iterator<Integer> it = ts.iterator();
        while(it.hasNext()){
            Integer next = it.next();
            System.out.println(next);
        }
        System.out.println("-----------------------");

        //method 2
        for (Integer t : ts) {
            System.out.println(t);
        }
        System.out.println("-----------------------");

        //method 3
        ts.forEach(e-> System.out.println(e));
        
    }
}
