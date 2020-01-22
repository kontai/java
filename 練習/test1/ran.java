package 練習.test1;

import java.util.Random;
import java.util.Scanner;
/*




 */

public class ran {
    public static void main(String[] args)
    {
        Random r = new Random();
        int number = r.nextInt(100) + 1;
        System.out.println(number);

        System.out.print("please input value=>");
        int j=0;
        while (j<3)
        {
            Scanner sc = new Scanner(System.in);
            int i = sc.nextInt();
            if (i == number)
            {
                System.out.println("Bingo!");
                break;
            }
            else
            {
                System.out.println("NO...");
                System.out.println(String.format("你還有%d次機會",3-j));
            }
            j++;
        }
    }
}
