package com.tai.BufferedIO;

import org.junit.Test;

import java.io.*;
import java.util.Arrays;

/**
 * ClassName: demo
 * Package: com.tai.BufferedIO
 * Description:
 *
 * @Author Kontai
 * @Create 2024/8/1 上午9:12
 * @Version 1.0
 */
public class demo {
    @Test
    public void test() throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("aaa/a.txt"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("aaa/b.txt"));

        byte[] b = new byte[1024];
        int len;
        while ((len = bis.read(b)) != -1) {
            bos.write(b, 0, len);
        }
        bis.close();
        bos.close();
    }
    @Test
    public void tes2t() throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("aaa/bbb"));
//        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("aaa/b.txt"));

        byte[] b = new byte[1024];
        int len;
        len=bis.read(b);
        System.out.println("len="+len);
        System.out.println(Arrays.toString(b));

        len=bis.read(b);
        System.out.println("len="+len);
        System.out.println(Arrays.toString(b));
        bis.close();
    }
}
