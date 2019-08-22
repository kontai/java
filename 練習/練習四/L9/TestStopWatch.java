package 練習.練習四.L9;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Random;
import java.util.Scanner;

public class TestStopWatch {
    final static int MAX = 100000;

    public static void main(String[] args) throws FileNotFoundException {

        int[] num = new int[MAX];
        Random ran = new Random();
        StopWatch sw = new StopWatch();
        for (int i = 0; i < MAX; i++) {
            num[i] = ran.nextInt(100);
        }
        sw.start();
        for (int i = 0; i < num.length; i++) {
            for (int j = i; j < num.length; j++) {
                if (num[j] < num[i]) {
                    int temp = num[i];
                    num[i] = num[j];
                    num[j] = temp;
                }

            }

        }


        sw.stop();
        PrintStream a = new PrintStream("1.txt");
        for (int i = 0; i < num.length; i++) {
            a.print(num[i]);
            if (i % 20 == 0)
                a.print('\n');
        }
        System.out.println("\n\n" + sw.getElapsedTime() + " mill second");

    }
}
