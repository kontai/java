package com.tai.file.exercise;

import org.junit.Test;

import java.io.*;
import java.util.*;

/**
 * ClassName: SortLine
 * Package: com.tai.file.exercise
 * Description:
 *
 * @Author Kontai
 * @Create 2024/8/6 上午1:18
 * @Version 1.0
 */
public class SortLine {
    @Test
    public void test() throws IOException {
        BufferedReader brd = new BufferedReader(new FileReader("bbb/csb.txt"));
        ArrayList<String> list = new ArrayList<>();
        String line;
        while ((line = brd.readLine()) != null) {
            //跳過空行
            if (line.length() > 0)
                list.add(line);
        }
        brd.close();    //關閉輸入流

        list.sort((o1, o2) -> {
            int i1 = Integer.parseInt(o1.split("\\.")[0]);
            int i2 = Integer.parseInt(o2.split("\\.")[0]);
            return i1 - i2;
        });
        for (String s : list) {
            System.out.println(s);
        }
    }
    @Test
    public void test2() throws IOException {
        BufferedReader bfd=new BufferedReader(new FileReader("bbb/csb.txt"));
        TreeMap<Integer,String> map=new TreeMap<>();;
        String line;
        String[] arr;
        while((line=bfd.readLine())!=null){
            arr=null;
            if(line.length()>0)
            {
                arr=line.split("\\.");
                map.put(Integer.parseInt(arr[0]),arr[1]);
            }
        }
        bfd.close();
//        map.forEach((k,v)-> System.out.println(k+"."+v));
        Set<Map.Entry<Integer, String>> set = map.entrySet();
        for (Map.Entry<Integer, String> entry : set) {
            System.out.println(entry.getKey()+"."+entry.getValue());
        }
        File f=new File("ccc2");

    }
}
