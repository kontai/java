package com.tai.exerice.IO;

import org.apache.commons.io.build.AbstractOrigin;

import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


/**
 * ClassName: q01
 * Package: com.tai.exeerice.IO
 * Description:
 *
 * @Author Kontai
 * @Create 2024/8/12 上午10:32
 * @Version 1.0
 */
public class q01 {
    public static void main(String[] args) throws IOException {

        String familyNameNet = "https://hanyu.baidu.com/shici/detail?pid=0b2f26d4c0ddb3ee693fdb1137ee1b0d&from=kg0";
        String boyNameNet = "http://www.haoming8.cn/baobao/10881.html";
        String girlNameNet = "http://www.haoming8.cn/baobao/7641.html";

        String familyNameStr = webCrawler(familyNameNet);
        String boyNameStr = webCrawler(boyNameNet);
        String girlNameStr = webCrawler(girlNameNet);

        //中文汉字範圍：[\u4E00-\u9FA5]
        ArrayList<String> familyNameTempList = getData(familyNameStr, "([\u4E00-\u9FA5]{4})(，|。)", 1);
        ArrayList<String> ManNameTempList = getData(boyNameStr, "([\\u4E00-\\u9FA5]{2})(、|。)", 1);
        ArrayList<String> WomanNameTempList = getData(girlNameStr, "(.. ){4}..", 0);

        ArrayList<String> familyNameList = new ArrayList<>();
        ArrayList<String> ManNameList = new ArrayList<>();
        ArrayList<String> WomanNameList = new ArrayList<>();

        //familyNameTempList（姓氏）
        //处理方案：把每一个姓氏拆开并添加到一个新的集合当中
        //赵钱孙李, 周吴郑王, 冯陈褚卫, 蒋沈韩杨, 朱秦尤许, 何吕施张,
        familyNameTempList.forEach(str -> {
            for (int i = 0; i < str.length(); i++) {
                familyNameList.add(str.charAt(i) + "");
            }
        });

        //ManNameTempList（男生的名字）
        //处理方案：去除其中的重复元素
        //大气, 美好, 特色, 大气, 美好, 特色, 月星, 弘城, 雨国, 思明, 圣恩, 浩恒, 月帆, 弘磊, 益坚, 博嘉
        ManNameTempList.forEach(str -> {
            if (!ManNameList.contains(str))
                ManNameList.add(str);
        });

        //WomanNameTempList（女生的名字）
        //彤舞 芊静 艾丝 惠蕙 语月, 依莹 瑶馨 曼珍 逸云 微婉, 芳诗 逸抒 半烟 花依 绮灵, 恬影 婉婕 紫茹 宛竹 曼蓉,
        WomanNameTempList.forEach(str->{
            String[] split = str.split(" ");
            for (String s : split) {
                WomanNameList.add(s);
            }
        });

    }

    private static ArrayList<String> getData(String familyNameStr, String regex, int groupNo) {
        //1.创建集合存放数据
        ArrayList<String> list = new ArrayList<>();

        //2.按照正则表达式的规则，去获取数据
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(familyNameStr);
        while (matcher.find()) {
            list.add(matcher.group(groupNo));
        }
        return list;
    }

    public static String webCrawler(String url) throws IOException {
        URL myurl = new URL(url);
        URLConnection conn = myurl.openConnection();
        InputStreamReader inr = new InputStreamReader(conn.getInputStream());
        int ch;
        StringBuilder sb = new StringBuilder();
        while ((ch = inr.read()) != -1) {
            sb.append((char) ch);
        }
        inr.close();
        return sb.toString();
    }

}
