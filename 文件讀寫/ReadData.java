package 文件讀寫;

import java.io.PrintWriter;
import java.util.Scanner;

public class ReadData {
    public static void main(String[] args)throws Exception {
        java.io.File file=new java.io.File("test.txt");
        //try-with-resources block (auto close file)
        try (Scanner input = new Scanner(new java.io.File("test.txt"))) {
            while (input.hasNext()) {
//next()會讀取用分隔符分隔開的標記(預設使用空格做標記) , 利用useDelimiter(String regex)設置新的分隔符模式
//                input.useDelimiter(" ");
                String firstaName = input.next();
                String mi = input.next();
                String lastName = input.next();
                int Score = input.nextInt();

                System.out.println(firstaName + " " + mi + " " + lastName + " " + Score);
            }
        }
//        ReadFile();
    }
    public static void ReadFile() throws Exception
    {
        //Create a File instance
        java.io.File file=new java.io.File("test.txt");

        //Read data from a file
        Scanner input=new Scanner(file);

        while(input.hasNext())
        {
            String firstaName=input.next();
            String mi=input.next();
            String lastName=input.next();
            int Score=input.nextInt();

            System.out.println(firstaName+" "+mi+" "+lastName+" "+Score);
        }
        input.close();

    }
}
