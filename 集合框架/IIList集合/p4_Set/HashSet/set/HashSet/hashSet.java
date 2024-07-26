package 集合框架.IIList集合.p4_Set.HashSet.set.HashSet;

import org.junit.Test;

import java.util.HashSet;

/**
 * ClassName: hashSet
 * Package: com.tai.Set
 * Description:
 *
 * @Author Kontai
 * @Create 2024/7/24 上午9:00
 * @Version 1.0
 */

/*
hsahSet: 無序，不重複，無索引
 */
public class hashSet {
    @Test
    public void test() {
        Student st1 = new Student("nick", 20);
        Student st2 = new Student("jackson", 22);
        Student st3 = new Student("bill", 21);
        Student st4 = new Student("nick", 20);

        HashSet<Student> hs = new HashSet<>();

        //當加人元素時，預設是使用Objdect.equals比較是否為相同對象
        //重寫hashcode和equals方法,使用成員屬性作為比較條件。
        System.out.println(hs.add(st1));
        System.out.println(hs.add(st2));
        System.out.println(hs.add(st3));
        System.out.println(hs.add(st4));        //相同屬性

        System.out.println(hs);

    }
}
