package com.tai.IO.字節流;

import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


/**
 * ClassName: demo
 * Package: com.tai.IO.fileiostream
 * Description:
 *
 * @Author Kontai
 * @Create 2024/7/29 上午8:44
 * @Version 1.0
 */
public class demo {
    @Test
    public void test() throws IOException {
        FileInputStream fis = new FileInputStream("aaa/C#图解教程第5版 中文PDF完整版.pdf");

        File dirname=new File("bbb");
        dirname.mkdir();
        FileOutputStream fos = new FileOutputStream("bbb/backup.pdf");
        int i;
        long start = System.currentTimeMillis();
        while ((i = fis.read()) != -1) {
            fos.write(i);
        }
        System.out.println("拷貝完成，耗時" + (System.currentTimeMillis() - start) + "毫秒");
        fos.close();
        fis.close();
    }
}
