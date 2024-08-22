package com.tai.CommonIo;

import org.apache.commons.io.FileUtils;
import org.junit.Test;

import java.io.File;
import java.io.IOException;

/**
 * ClassName: Demo
 * Package: com.tai.CommonIo
 * Description:
 *
 * @Author Kontai
 * @Create 2024/8/8 上午10:16
 * @Version 1.0
 */
public class Demo {
    @Test
    public void test() throws IOException {
        FileUtils.copyFile(new File("aaa/a.txt"), new File("bbb/a.txt"));
    }
}
