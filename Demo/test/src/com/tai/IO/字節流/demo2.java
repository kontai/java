package com.tai.IO.字節流;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/**
 * ClassName: demo2
 * Package: com.tai.IO.fileiostream
 * Description:
 *
 * @Author Kontai
 * @Create 2024/7/30 上午9:43
 * @Version 1.0
 */
public class demo2 {
    @Test
    public void test() throws IOException {
        FileInputStream fis=new FileInputStream("aaa/a.txt");
        byte[] buff=new byte[1000];
        int len;
        String str=null;
        while((len=fis.read(buff))>0){
            str=new String(buff,0,len,"UTF-8");
            System.out.println(str);
        }
        fis.close();
    }

    @Test
    public void test2() throws UnsupportedEncodingException {
        String str=new String("我");
        byte[] bytes = str.getBytes("UTF-8");
        System.out.println(Arrays.toString(bytes));

        byte[] bytes1 = str.getBytes("gbk");
        System.out.println(Arrays.toString(bytes1));

        byte[] bytes2 = str.getBytes("utf-16");
        System.out.println(Arrays.toString(bytes2));

    }
}
