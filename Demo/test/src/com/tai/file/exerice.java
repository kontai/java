package com.tai.file;

import org.junit.Test;

import java.io.File;
import java.io.IOException;

/**
 * ClassName: exerice
 * Package: com.tai.file
 * Description:
 *
 * @Author Kontai
 * @Create 2024/7/28 上午10:36
 * @Version 1.0
 */
public class exerice {
    @Test
    public void test() throws IOException {
        //在當前模塊下,aaa創建文件a.txt
        File dirname = new File("aaa");
        boolean mkdirred = dirname.mkdir();
        if (mkdirred) {
            System.out.println("創建成功");
        }

        File newFile = new File(dirname, "a.txt");
        System.out.println(newFile.getAbsolutePath());
        boolean newFile1 = newFile.createNewFile();
        if (newFile1) {
            System.out.println(newFile.getName() + "創建成功");
        } else {
            System.exit(0);
        }
    }

    @Test
    public void test2() {
        File dirname = new File("aaa");
        File[] files = dirname.listFiles();
        for (File file : files) {
            if (file.getName().endsWith("txt"))
                System.out.println(file.getName());
        }
    }

    @Test
    public void test3() {
        File[] roots = File.listRoots();
        for (File root : roots) {
            File[] files = root.listFiles();
            findFile(root);
        }
    }

    private static void findFile(File file) {
        if (file.isDirectory()) {
            File[] dir = file.listFiles();
            if (dir != null) {
                for (File file1 : dir) {
                    if (file1.isFile()) {
                        if (file1.getName().endsWith("avi"))
                            System.out.println(file1.getName());
                    } else {
                        findFile(file1);
                    }

                }
            }
        }
    }
}
