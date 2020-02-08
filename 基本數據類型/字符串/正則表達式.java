package 基本數據類型.字符串;

public class 正則表達式 {
    public static void main(String[] args) {
        System.out.println("Java".matches("Java"));;
        System.out.println("Java".equals("Java"));;

        System.out.println("Java is fun".matches("Java.*"));;
        System.out.println("440-02-4534".matches("\\d{3}-\\d{2}-\\d{4}"));  //  這裡\\d代表單個數字位

        System.out.println("a$b+*c".replaceAll("[$*+]","-"));;
        System.out.println("a$b+*c".replace("[$*+]","-"));

        String[] tokens="Java,C?C#,C++".split("[.,:;?]");
        for(String str:tokens)
            System.out.println(str);
    }
}
