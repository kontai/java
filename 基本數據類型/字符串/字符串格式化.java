package 基本數據類型.字符串;

public class 字符串格式化 {
    public static void main(String[] args) {
        String forStr=String.format("%7.2f%6d%-4s",45.556,14,"AB");
        System.out.println(forStr);

        System.out.printf("%7.2f%6d%-4s",45.556,14,"AB");
    }

}
