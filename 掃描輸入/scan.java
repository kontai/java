import java.awt.print.Printable;
import java.util.Scanner;

class scan{
    public static void main(String[] args) {
        System.out.print("請輸入數字=>");
        System.out.print('\n');
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        System.out.println("The Number is"+a);
        
        
    }
}