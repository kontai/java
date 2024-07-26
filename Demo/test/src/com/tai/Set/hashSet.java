package com.tai.Set;

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
public class hashSet {
    @Test
    public void test(){
        Student st1=new Student("nick",20);
        Student st2=new Student("jackson",22);
        Student st3 =new Student("bill",21);
        Student st4=new Student("nick",20);

        HashSet<Student> hs=new HashSet<>();

        System.out.println(hs.add(st1));
        System.out.println(hs.add(st2));
        System.out.println(hs.add(st3));
        System.out.println(hs.add(st4));        //重寫hashcode和equals方法,使用成員屬性作為比較條件。

    }
}
