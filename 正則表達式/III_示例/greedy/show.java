package 正則表達式.III_示例.greedy;

import org.junit.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * ClassName: show
 * Package: 正則表達式.III_示例.貪
 * Description:
 *
 * @Author Kontai
 * @Create 2024/7/20 下午3:52
 * @Version 1.0
 */
public class show {
    @Test
    public void test() {

         /*
            只写+和*表示贪婪匹配

            +? 非贪婪匹配
            *? 非贪婪匹配

            贪婪爬取:在爬取数据的时候尽可能的多获取数据
            非贪婪爬取:在爬取数据的时候尽可能的少获取数据

            ab+:
            贪婪爬取:abbbbbbbbbbbb
            非贪婪爬取:ab
        */
        String s = "Java自从95年问世以来，abbbbbbbbbbbbaaaaaaaaaaaaaaaaaa" +
                "经历了很多版木，目前企业中用的最多的是]ava8和]ava11，因为这两个是长期支持版木。" +
                "下一个长期支持版本是Java17，相信在未来不久Java17也会逐渐登上历史舞台";

        String regex = "ab+";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(s);

        while (m.find()) {
            System.out.println(m.group());
        }
    }

    @Test
    public void test2() {
        String regex = "(.+).+\\1";
        System.out.println("aaa112aaa".matches(regex));
        System.out.println("abc1122abd".matches(regex));
    }

    @Test
    public void test3(){
        // 判斷一個字符中的開始部分和結尾部分是否相同
        String regex="((.)\\2).+\\1";
        System.out.println("aaa123aaa".matches(regex));
        System.out.println("aab123aab".matches(regex));
    }
}
