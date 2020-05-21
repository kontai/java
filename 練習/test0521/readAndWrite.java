package 練習.test0521;

import java.io.*;

public class readAndWrite {
    public static void main(String[] args) throws IOException
    {
        File file = new File("d:\\123.txt");
        InputStream in = System.in;
        OutputStream out = System.out;
        int len = 0;
//        byte[] b = new byte[1024];
        byte[] b = new byte[1024];
        while ((len = in.read(b)) != -1)
        {
            out.write(b, 0, len);
            out.flush();
        }
        out.close();
        in.close();

    }

    private static void ReadFile()
    {
    }

    private static void demo1(File file)
    {

    }
}
