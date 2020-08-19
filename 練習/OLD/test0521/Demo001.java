package 練習.test0521;

import java.io.*;
import java.text.DateFormat;
import java.util.Date;
import java.util.regex.Matcher;

public class Demo001 {
    public static final String NewLine = System.lineSeparator();

    public static void main(String[] args) throws IOException
    {
        long now = new Date().getTime();
        String in="d:\\aa.txt";
        String out="d:\\bb.txt";

//        ReadDemo1("d:\\aa.txt");
//        ReadWithBufferedDemo1("d:\\aa.txt");  //逐字讀取
//        ReadWithBufferedDemo2("d:\\aa.txt");    //按行讀取
//        WriterDemo(in,out);
//        WriterDemoWithBufferedDemo1(in,out);
        WriterDemoWithBufferedDemo2(in,out);

        System.out.println(new Date().getTime() - now + " ms");
    }

    private static void WriterDemoWithBufferedDemo2(String in, String out)
    {
        try
        {
//            FileReader reader=new FileReader(in);
//            FileWriter writer = new FileWriter(out);
            BufferedReader bufr=new BufferedReader(new FileReader(in));
            BufferedWriter bufw=new BufferedWriter(new FileWriter(out));
            String str=null;
            int len=0;
            while((str=bufr.readLine())!=null)
            {
                bufw.write(str);
                bufw.newLine();
//                bufw.flush();
            }
            bufr.close();
            bufw.close();
        }catch(IOException e)
        {
            e.printStackTrace();
        }
    }
    private static void WriterDemoWithBufferedDemo1(String in, String out)
    {
        try
        {
//            FileReader reader=new FileReader(in);
//            FileWriter writer = new FileWriter(out);
            BufferedReader bufr=new BufferedReader(new FileReader(in));
            BufferedWriter bufw=new BufferedWriter(new FileWriter(out));
            int len=0;
            while((len=bufr.read())!=-1)
            {
                bufw.write((char)len);
            }
            bufr.close();
            bufw.close();
        }catch(IOException e)
        {
            e.printStackTrace();
        }
    }

    private static void WriterDemo(String in,String out)
    {
        try
        {
            FileReader reader=new FileReader(in);
            FileWriter writer = new FileWriter(out);
            char[] ch=new char[1024];
            int len=0;
            while((len=reader.read(ch))!=-1)
            {
                writer.write(new String(ch,0,len));
            }
            reader.close();
            writer.close();
        }catch(IOException e)
        {
            e.printStackTrace();
        }
    }


    private static void ReadWithBufferedDemo2(String s)
    {
        int FileLength = 0;
        File file = new File(s);
        FileLength = (int) new File(s).length();

        try
        {
            BufferedReader bf = new BufferedReader(new FileReader(s));
            String str = null;
            while ((str = bf.readLine()) != null)
            {
                System.out.println(str);
            }
            System.out.println(FileLength);

        } catch (IOException e)
        {
            System.out.println("file not found" + NewLine);
            e.printStackTrace();
            return;
        }
    }

    private static void ReadWithBufferedDemo1(String s)
    {
        int FileLength = 0;
        File file = new File(s);
        FileLength = (int) new File(s).length();

        try
        {
            BufferedReader bf = new BufferedReader(new FileReader(s));
            int a=0;
            while ((a = bf.read()) != -1)
            {
                System.out.printf("%c",(char)a);
            }
            System.out.println(FileLength);

        } catch (IOException e)
        {
            System.out.println("file not found" + NewLine);
            e.printStackTrace();
            return;
        }
    }

    public static void ReadDemo1(String file) throws IOException
    {
        char[] ch = new char[624];
        int len = 0;
        int lineNumber = 0;
        try
        {
            FileReader r = new FileReader(file);
            while ((len = r.read(ch)) != -1)
            {
                System.out.println(lineNumber++ + new String(ch, 0, len) + NewLine);
            }
        } catch (FileNotFoundException e)
        {
            System.out.println("file not found" + NewLine);
            e.printStackTrace();
            return;
        }

    }
}
