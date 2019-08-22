package 練習.練習四.L10;

public class 練習10_24 {
    public static void main(String[] args) {
        System.out.println("Hi, ABC,good".matches("ABC "));
        System.out.println("Hi, ABC,good".matches(".*ABC.*"));
        System.out.println("A,B,C".replaceAll(",;","#"));
        System.out.println("A,B,C".replaceAll("[,;]","#"));
        String s="Hi, Good Morning".toUpperCase();
        System.out.println(s.toCharArray()[0]);
        String[] tokens="A,B,C".split("[,;]");
        for(String i:tokens)
        {
            System.out.print(i+" ");
        }
    }
}
