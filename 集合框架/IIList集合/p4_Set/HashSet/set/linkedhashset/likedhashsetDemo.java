package 集合框架.IIList集合.p4_Set.HashSet.set.linkedhashset;

import org.junit.Test;
import 集合框架.IIList集合.p4_Set.HashSet.set.HashSet.Student;

import java.util.LinkedHashSet;
import java.util.LinkedList;

/**
 * ClassName: likedhashsetDemo
 * Package: 集合框架.IIList集合.p4_Set.HashSet.set.linkedhashset
 * Description:
 *
 * @Author Kontai
 * @Create 2024/7/24 上午9:28
 * @Version 1.0
 */
/*
LinkedHashSet
    有序，不重複，無索引
    底層使用哈希表，使用雙向鏈表記ㄊ錄添加順序
 */
public class likedhashsetDemo {
    @Test
    public void test(){
        Student st1 = new Student("nick", 20);
        Student st2 = new Student("jackson", 22);
        Student st3 = new Student("bill", 21);
        Student st4 = new Student("nick", 20);

        LinkedHashSet<Student> lhs=new LinkedHashSet<>();

        System.out.println(lhs.add(st1));
        System.out.println(lhs.add(st2));
        System.out.println(lhs.add(st3));
        System.out.println(lhs.add(st4));
        System.out.println(lhs);


    }
}
