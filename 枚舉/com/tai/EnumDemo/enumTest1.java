package 枚舉.com.tai.EnumDemo;

/**
 * ClassName: enumTest1
 * Package: 枚舉.com.tai.EnumDemo
 * Description:
 *
 * @Author Kontai
 * @Create 2024/7/8 上午10:12
 * @Version 1.0
 */

//定义枚举类（JDK5.0 之前）
//在 JDK5.0 之前如何声明枚举类呢？
//        • 私有化类的构造器，保证不能在类的外部创建其对象
//• 在类的内部创建枚举类的实例。声明为：public static final ，对外暴露这些
//        常量对象
//• 对象如果有实例变量，应该声明为 private final（建议，不是必须），并在构造
//        器中初始化

public class enumTest1 {
    public static void main(String[] args) {
        System.out.println(Season.SPRING);
    }
}

class Season {
    private final String SEASONNAME;//季节的名称
    private final String SEASONDESC;//季节的描述

    private Season(String seasonName, String seasonDesc) {
        this.SEASONNAME = seasonName;
        this.SEASONDESC = seasonDesc;
    }

    public static final Season SPRING = new Season("春天", "春暖花开 ");
    public static final Season SUMMER = new Season("夏天", "夏日炎炎 ");
    public static final Season AUTUMN = new Season("秋天", "秋高气爽 ");
    public static final Season WINTER = new Season("冬天", "白雪皑皑 ");

    @Override
    public String toString() {
        return "Season{" +
                "SEASONNAME='" + SEASONNAME + '\'' +
                ", SEASONDESC='" + SEASONDESC + '\'' +
                '}';
    }
}

