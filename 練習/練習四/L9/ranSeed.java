package 練習.練習四.L9;

import java.util.Random;

public class ranSeed {
    public static void main(String[] args) {
       Random r1=new Random(1000);
       for(int i=0;i<50;i++)
       {
           System.out.println(r1.nextInt(10));
       }
    }
}
