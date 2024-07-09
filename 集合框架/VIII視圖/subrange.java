package 集合框架.VIII視圖;


import 集合框架.III泛型.III_自定義泛型.I泛型類.Student;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.IntConsumer;
import java.util.logging.Logger;

public class subrange {
    public static void main(String[] args) {

        ArrayList<Student> s = new ArrayList<>();
        s.add(new Student("abc", 30));
        s.add(new Student("abc4", 34));
        s.add(new Student("abc5", 35));
        List<Student> group = s.subList(0, 2);
        System.out.println("before:");
        System.out.println(s);
        System.out.println(group);

        //clear()清除集合中的元素(原始的集合也會清除)
        group.clear();
        System.out.println("after:");
        System.out.println(s);
        System.out.println(group);
    }
}
