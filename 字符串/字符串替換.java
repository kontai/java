package 字符串;


public class 字符串替換 {
    public static void main(String[] args) {
        System.out.println("welcome".replace('e', 'A'));
        ;
        System.out.println("welcome".replaceFirst("e", "A"));
        ;
        System.out.println("welcome".replace("e", "AB"));
        ;
        System.out.println("welcome".replace("el", "AB"));
        ;

        String[] tokens = "Java#HTML#Perl".split("#");
        String str1=tokens[0]+' '+tokens[1];
        for (String i : tokens) {
            System.out.print(i);
            System.out.print(' ');
        }
        System.out.println("\n"+str1);

        String s=new String();
        System.out.println(s.length());
    }
}
