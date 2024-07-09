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

    //实现接口,各個枚舉成員都實現了自己的show()方法
public class enumImpInterface {

    public static void main(String[] args) {
        SeasonEnum2 spring = SeasonEnum2.AUTUMN;
        System.out.println(spring);


        for (SeasonEnum2 value : SeasonEnum2.values()) {
            value.show();
        }
    }
}

//m
enum SeasonEnum2 implements MyInterface {
    SPRING("春天", "春风又绿江南岸") {
        public void show() {
            System.out.println("春天show");
        }
    },
    SUMMER("夏天", "映日荷花别样红") {
        public void show() {
            System.out.println("夏天show");
        }
    },
    AUTUMN("秋天", "秋水共长天一色") {
        public void show() {
            System.out.println("秋天show");
        }
    },
    WINTER("冬天", "窗含西岭千秋雪") {
        public void show() {
            System.out.println("冬天show");
        }
    };


    private final String seasonName;
    private final String seasonDesc;

    private SeasonEnum2(String seasonName, String seasonDesc) {
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


