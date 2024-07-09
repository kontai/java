package 枚舉.com.tai.EnumDemo;

/**
 * ClassName: enumTest2
 * Package: 枚舉.com.tai.EnumDemo
 * Description:
 *
 * @Author Kontai
 * @Create 2024/7/8 上午10:15
 * @Version 1.0
 */
//定义枚举类（JDK5.0 之后）
/// enum 关键字声明枚举
//【修饰符】 enum 枚举类名{
//    常量对象列表
//}
//【修饰符】 enum 枚举类名{
//    常量对象列表;
//
//    对象的实例变量列表;
//}
// enum默認父類是java.lang.Enum

public class enumTest2 {

    public static void main(String[] args) {
        SeasonEnum spring = SeasonEnum.AUTUMN;

        //toString-->(無重寫)返回对象的字符串表示
        System.out.println("---toString---");
        System.out.println(spring);

        //values()-->返回枚举对象的数组
        SeasonEnum[] values = SeasonEnum.values();
        System.out.println("---values---");
        for (SeasonEnum value : values) {
            System.out.println(value);
        }

        //valuesof()-->返回指定名称的枚举对象
        System.out.println("---valuesof---");
        SeasonEnum winter = SeasonEnum.valueOf("WINTER");
        System.out.println(winter);

        //name()-->返回枚举对象的名称
        System.out.println("---name---");
        System.out.println(winter.name());

        //ordinal()-->返回枚举对象的索引
        System.out.println("---ordinal---");
        System.out.println(winter.ordinal());

    }
}

enum SeasonEnum {
    SPRING("春天", "春风又绿江南岸"),
    SUMMER("夏天", "映日荷花别样红"),
    AUTUMN("秋天", "秋水共长天一色"),
    WINTER("冬天", "窗含西岭千秋雪");


    private final String seasonName;
    private final String seasonDesc;

    private SeasonEnum(String seasonName, String seasonDesc) {
        this.seasonName = seasonName;
        this.seasonDesc = seasonDesc;
    }

    public String getSeasonName() {
        return seasonName;
    }

    public String getSeasonDesc() {
        return seasonDesc;
    }
}


