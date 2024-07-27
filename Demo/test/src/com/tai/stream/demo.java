package com.tai.stream;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * ClassName: demo
 * Package: com.tai.stream
 * Description:
 *
 * @Author Kontai
 * @Create 2024/7/26 上午8:58
 * @Version 1.0
 */
public class demo {
    @Test
    public void test() {
        List<String> list = new ArrayList<>();
        list.add("张无忌");
        list.add("周芷若");
        list.add("赵敏");
        list.add("张强");
        list.add("张三丰");

        list.stream().filter(name -> name.startsWith("张")).filter(name -> name.length() == 3).forEach(name -> System.out.println(name));


    }
}
