package com.tai.IO.字符流;

import org.junit.Test;

import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Arrays;

/**
 * ClassName: demo
 * Package: com.tai.IO.字符流
 * Description:
 *
 * @Author Kontai
 * @Create 2024/7/30 上午10:08
 * @Version 1.0
 */
public class FileReadWriteDemo {
    @Test
    public void test() throws IOException {
        FileReader fr = new FileReader("aaa/a.txt");
        int i = -1;
        while ((i = fr.read()) != -1) {
            System.out.print((char) i);
        }
        fr.close(); //闗閕流
    }

    @Test
    public void test2() {
        String[] arr = {"abc", "def", "ghi"};
        String newArr = String.join("-", arr);
        System.out.println(newArr);
    }
}
