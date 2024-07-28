package com.tai.IO;

import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * ClassName: IFileOutpuStreamDemo
 * Package: com.tai.IO
 * Description:
 *
 * @Author Kontai
 * @Create 2024/7/28 下午3:37
 * @Version 1.0
 */
public class IFileOutpuStreamDemo {
    @Test
    public void test() throws IOException {
        FileOutputStream fos=new FileOutputStream("aaa/ddd.txt",true);
        fos.write(97);  //以ASCII碼方式寫入
        fos.close();    //闗閕文件，釋放資源
//        fos.write(98);
//        fos.write(99);
//        fos.write(100);
//        fos.write(101);
//        fos.write(102);
//        fos.write(103);
//        fos.write(104);
//        fos.write(105);

    }
}
