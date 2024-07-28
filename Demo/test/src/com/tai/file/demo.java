package com.tai.file;

import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * ClassName: demo
 * Package: com.tai.file
 * Description:
 *
 * @Author Kontai
 * @Create 2024/7/28 上午9:14
 * @Version 1.0
 */
public class demo {
    @Test
    public void test() throws IOException {
//        File file=new File("/home/kontai/圖片/us.gif");
        StringBuilder path=new StringBuilder("1");
        File file=new File(path.toString());
        file.createNewFile();

        System.out.println("Dose it exist? "+file.exists());
        System.out.println("The file has "+file.length()+" bytes");
        System.out.println("Can it be read? "+file.canRead());
        System.out.println("Can it be write? "+file.canWrite());
        System.out.println("Is it a directory? "+file.isDirectory());
        System.out.println("Is it a file? "+file.isFile());
        System.out.println("Is it a absolute? "+file.isAbsolute());
        System.out.println("Is it a hidden? "+file.isHidden());
        System.out.println("Absoulte path is "+file.getAbsolutePath());
//        System.out.println("Canonical path is "+file.getCanonicalPath());
        System.out.println("Last modifies on "+new java.util.Date(file.lastModified()));
//        file.renameTo(new File("test.gif"));

        File myfile2=new File("aaa","bbb.txt");
    }
}
