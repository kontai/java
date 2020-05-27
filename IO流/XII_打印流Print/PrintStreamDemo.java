package IO流.XII_打印流Print;

import java.io.*;

public class PrintStreamDemo {

    /**
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException
    {

        /*
         * PrintStream:
         * 1,提供了打印方法可以對多種數據類型值進行打印。並保持數據的表示形式。
         * 2，它不拋IOException.
         *
         * 構造函數，接收三種類型的值：
         * 1，字符串路徑。
         * 2，File對象。
         * 3，字節輸出流。
         */
        //PrintDemo1();
        //PrintDemo2();
        PrintDemo3();   //重定向


    }

    private static void PrintDemo3() throws FileNotFoundException
    {
        //重定向
        PrintStream redir = new PrintStream(new BufferedOutputStream(new FileOutputStream("print.txt")), true);
        System.setOut(redir);
        System.out.println("change");

        //恢復重定向
        System.setOut(new PrintStream(new BufferedOutputStream(new FileOutputStream(FileDescriptor.out)), true));
        System.out.println("I am back!");
    }

    private static void PrintDemo2() throws FileNotFoundException
    {
        PrintStream redir = new PrintStream(new BufferedOutputStream(new FileOutputStream("print.txt")), true);

/*
        redir.write(610);//只寫最低8位，
        redir.print(97);//將97先變成字符保持原樣將數據打印到目的地。
*/
        redir.println("打印流");
        redir.println(true);
        redir.close();
    }

    private static void PrintDemo1()
    {
        PrintStream newPrint = System.out;
        newPrint.println("簡化輸出");
        newPrint.write(610);
        newPrint.println();
        newPrint.print(610);
        newPrint.flush();
        newPrint.close();
    }

}
