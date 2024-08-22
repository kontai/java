package com.tai.IO.HuTool;

import cn.hutool.core.io.FileUtil;
import org.junit.Test;

import java.io.File;
import java.io.IOException;


/**
 * ClassName: demo
 * Package: com.tai.IO.HuTool
 * Description:
 *
 * @Author Kontai
 * @Create 2024/8/12 上午9:30
 * @Version 1.0
 */
public class demo {
    @Test
    public void test() throws IOException {
        File file = FileUtil.file("ddd/aaa.txt", "ddd/bbb.txt");
        file.createNewFile();

    }
}
