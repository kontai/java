package com.tai;

import org.junit.Test;

/**
 * ClassName: junit
 * Package: com.tai
 * Description:
 *
 * @Author Kontai
 * @Create 2024/7/10 上午10:31
 * @Version 1.0
 */

/*
 * 要使用JUnit，必须在项目的编译路径中`引入JUnit的库`，即相关的.class文件组成的jar包。
 * jar就是一个压缩包，压缩包都是开发好的第三方（Oracle公司第一方，我们自己第二方，其他都是第三方）工具类，都是以class文件形式存在的。
 *
 *****************************************
 * 使用JUnit的第一步就是在项目的编译路径中引入JUnit的jar包，然后就可以在项目中使用JUnit了。
 * 導人hamcrest-core 和 junit jar包
 *******************************************
 * JUnit4版本，要求@Test标记的方法必须满足如下要求：
 *
 *   所在的类必须是public的，非抽象的，包含唯一的无参构造器。
 *   @Test标记的方法本身必须是public，非抽象的，非静态的，void无返回值，()无参数的。
 ***************************************************************************
 * 设置执行JUnit用例时支持控制台输入
 * 默认情况下，在单元测试方法中使用Scanner时，并不能实现控制台数据的输入。需要做如下设置：
 *  在`idea64.exe.vmoptions配置文件`中加入下面一行设置，重启idea后生效。
 *
 * 如果上述位置设置不成功，需要继续修改如下位置**
 *      修改位置1：IDEA安装目录的bin目录（例如：`D:\develop_tools\IDEA\IntelliJ IDEA 2022.1.2\bin`）下的idea64.exe.vmoptions文件。
 *      修改位置2：C盘的用户目录`C:\Users\用户名\AppData\Roaming\JetBrains\IntelliJIdea2022.1` 下的idea64.exe.vmoptions`件。
 * */
public class junit {
    @Test
    public void test01() {
        System.out.println("TstJUnit.test01");
    }

    @Test
    public void test02() {
        System.out.println("TestJUnit.test02");
    }

    @Test
    public void test03() {
        System.out.println("TestJUnit.test03");
    }
}
