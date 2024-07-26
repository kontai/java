package 正則表達式.III_示例;

import org.junit.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * ClassName: RegexTest3
 * Package: 正則表達式.III_示例
 * Description:
 *
 * @Author Kontai
 * @Create 2024/7/20 下午3:35
 * @Version 1.0
 */

    /*
            需求1:爬取版本号为8，11.17的Java文本，但是只要Java，不显示版本号。
            需求2:爬取版本号为8，11，17的Java文本。正确爬取结果为:Java8 Java11 Java17 Java17
            需求3:爬取除了版本号为8，11.17的Java文本，
     */
public class RegexTest3 {
    @Test
    public void test() {
        String str = "\t Java自从95年问世以来，经历了很多版本，目前企业中用的最多的是Java8和Java11，因为这两个是长期支持版本，下一个长期支持版本是Java17，相信在未来不久Java17也会逐渐登上历史舞台。";


        String regex1 = "(?i)java(?=8|11|17)";       //正則表達式，(?i)表示不区分大小寫 (?=)表示前面的字符串必須包含後面的字符串
        String regex2 = "Java(?:8|11|17)";           //正則表達式，(?:)表示包含後面的字符串,在這裡加不加都一樣結果
        String regex3 = "((?i)java)(?!8|11|17)";      //正則表達式，(?i)表示不区分大小寫 (?!)表示前面的字符串不能包含後面的字符串
        Pattern p = Pattern.compile(regex3);
        Matcher m = p.matcher(str);
        while (m.find()) {
            String group = m.group();
            System.out.println(group);
        }
    }
}
