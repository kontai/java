package 字符串;
import java.util.Scanner;

public class String判斷 {
    public static void main(String[] args) {
        String a1 = "Abcd";
        String a2 = "ABcD";
        System.out.println(a1.equals(a2)); //比較的是內容
        System.out.println(a1.equals("Abcd") + "\n");

        System.out.println(a1.equalsIgnoreCase(a2));
        System.out.println(a1.startsWith("A"));
        System.out.println(a2.endsWith("a"));

        q1();
    }

    //模擬登入,有三次嘗試機會
    public static void q1()
    {
        String username = "Admin";
        String password = "Admin";

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.println("請輸入使用者名稱:");
            String user = sc.nextLine();
            System.out.println("請輸入使用者密碼:");
            String pass = sc.nextLine();

            if (user.equals(username) && pass.equals(password)) {
                System.out.println("登入成功!");
                break;
            } else if (i < 2) {
                System.out.println("輸入有誤,還有" + (2-i) + "次機會");
            } else  {
                System.out.println("登入失敗,請稍後再試..");
                //System.exit(1); 直接結束程式
            }
        }

    }
}
