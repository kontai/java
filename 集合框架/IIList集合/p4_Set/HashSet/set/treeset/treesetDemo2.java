package 集合框架.IIList集合.p4_Set.HashSet.set.treeset;

import org.junit.Test;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * ClassName: treesetDemo2
 * Package: 集合框架.IIList集合.p4_Set.HashSet.set.treeset
 * Description:
 *
 * @Author Kontai
 * @Create 2024/7/24 下午2:46
 * @Version 1.0
 */
public class treesetDemo2 {
    @Test
    public void test(){
        Student2 st1=new Student2("tai",12);
        Student2 st2=new Student2("john",22);
        Student2 st3=new Student2("kerrrrr",18);
        Student2 st4=new Student2("smith",23);

        //method 1
        TreeSet<Student2> ts=new TreeSet<>();

        ts.add(st1);
        ts.add(st2);
        ts.add(st3);
        ts.add(st4);
        System.out.println("-----sort by name length-----");
        System.out.println(ts);

        //method 2 自定義Comparator比較器對象

        TreeSet<Student2> ts2=new TreeSet<>(new Comparator<Student2>() {
            @Override
            public int compare(Student2 o1, Student2 o2) {
                return o1.getAge()-o2.getAge();
            }
        });

        ts2.add((st1));
        ts2.add((st2));
        ts2.add((st3));
        ts2.add((st4));
        System.out.println("-----sort by age-----");
        System.out.println(ts2);

//        System.out.println();

    }
}
