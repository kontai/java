package 字符串;

public class 數值與字符串 {
    public static void main(String[] args) {
        Integer num=23;
        String str=String.valueOf(num);
        String str2=num+"";
        int num2=Integer.parseInt(str,16);
        int num3=Integer.valueOf(str);
        System.out.println(str.equals(str2));
        System.out.println(str==str2);
        System.out.println(num2);
    }

}
