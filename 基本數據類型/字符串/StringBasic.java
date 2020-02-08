package 基本數據類型.字符串;

public class StringBasic {
    public static void main(String[] args) {
        String s1 = new String("Hello");
        System.out.println("s1: " + s1);
        System.out.println("------");

        char[] ch = {'h', 'e', 'l', 'l', 'o'};
        String s2 = new String(ch);
        System.out.println("s2: " + s2);
        System.out.println("------");

        //String(char[],offset,count) :  從字符數組offeset位置開始,取出coumt個字符作為新String
        String s3 = new String(ch, 0, 2);
        System.out.println("s3: " + s3);
        System.out.println("------");

        //通過構造方法創建字符串對象史在堆內存
        //直接賦值方式創建對象是在方法區的常量池

        String a1=new String("abc");
        String a2="abc";
        String a3="abc";
        String a4=new String("abc");
        System.out.println("a1==a2? "+(a1==a2));
        System.out.println("a2==a3? "+(a2==a3)); //一樣位於方法區常量池
        System.out.println("a1==a4? "+(a1==a4));  //地址不同

    }
}
