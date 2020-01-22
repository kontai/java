package 常用API.SimpleDateFormat;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * SimpleDateFormat:
 * 		格式化：
 * 			Date --- String
 * 			2049-8-26 2049年8月26日
 * 			String format(Date date)
 * 		解析：
 * 			String --- Date
 * 			"2049-8-26"
 * 			Date parse(String source)
 *
 * 构造方法：
 * 		SimpleDateFormat() ：使用默认的模式进行对象的构建
 * 		SimpleDateFormat(String pattern) ：使用的指定的模式进行对象的构建
 *
 * 注意：Exception in thread "main" java.text.ParseException: Unparseable date: "49年9月26日  下午1:29"
 * 	    解析的字符串，模式必须和构建对象的模式一样
 *
 */
public class SimpleDateFormatDemo {
    public static void main(String[] args) throws ParseException {
        //method();
        //method2();
        //使用指定的模式进行对象的构建
        //1999年9月1日 10:10:10
        //4个小姨2个大美眉和2个小弟弟
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");

        //格式化
        Date date = new Date();
        String s = sdf.format(date);
        System.out.println(s);//2049年08月26日 13:39:12


        //解析
        Date d = sdf.parse("2049年08月26日 13:39:12");
        System.out.println(d.toLocaleString());




    }

    private static void method2() throws ParseException {
        //使用指定的模式进行对象的构建
        //1999年9月1日
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
        //格式化
        Date date = new Date();
        String s = sdf.format(date);
        System.out.println(s);//2049年08月26日

        //解析
        Date d = sdf.parse("2049年08月26日");
        System.out.println(d.toLocaleString());
    }

    private static void method() throws ParseException {
        //使用默认模式进行对象的构建
        SimpleDateFormat sdf = new SimpleDateFormat();
        //创建日期对象
        Date date = new Date();

        //格式化 把日期对象转换成字符串
        String s = sdf.format(date);
        System.out.println(s);//49-8-26 下午1:29

        //解析 把字符串转换成日期对象
        Date d = sdf.parse("49年9月26日  下午1:29");
        System.out.println(d.toLocaleString());
    }

}
