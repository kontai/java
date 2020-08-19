package 練習.test0521;

import java.io.*;

/**
 *
 */
public class Demo2 {

    public static void main(String[] args) throws IOException
    {
//        KeyIn();
        KeyIn2();
    }

    private static void KeyIn2() throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        String str=null;
        while((str=br.readLine())!=null)
        {
            if(str.equals("over"))
                break;
            bw.write(str);
            bw.newLine();
            bw.flush();
        }
        bw.close();
        br.close();
    }

    public static void KeyIn() throws IOException
    {
        InputStream in = System.in;
        byte[] tmp = new byte[1024];
        int len = 0;

        System.out.println("大寫輸出,over結束)\n=>");
        while ((len = in.read(tmp)) != -1)
        {
            String out = new String(tmp, 0, len-1);
            if (out.equals("over"))
            {
                break;
            }
                System.out.println(out.toUpperCase());
        }
        in.close();
    }
}
