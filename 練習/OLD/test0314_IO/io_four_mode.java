package test0314_IO;

import java.io.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;

public class io_four_mode {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     * @throws IOException the io exception
     */
    public static void main(String[] args) throws IOException
    {
        //kb in , kb out
//        mode_1();

        //kb in , file out
//        mode_2();

        //file in , kb out
        mode_3();

        //file in , file out
        mode_4();


    }


    private static void mode_1() throws IOException
    {
        InputStream in = System.in;
        OutputStream out = System.out;
//        BufferedInputStream bfi=new BufferedInputStream(in);
//        BufferedInputStream bfo=new BufferedInputStream(in);

        int i;
        while ((i = in.read()) != -1)
        {
            out.write(i);
//            out.flush();
        }
    }

    private static void mode_2() throws IOException
    {
        InputStream in = System.in;
//        FileWriter rd=new FileWriter("buf_Out.txt");
        BufferedInputStream br = new BufferedInputStream(in);
        BufferedWriter buf = new BufferedWriter(new FileWriter("buf_key.txt"), 1);
        int i = 0;
        while ((i = br.read()) != -1)
        {
            System.out.println(i);
            buf.write(i);
            buf.flush();
        }
        buf.close();
    }

    private static void mode_3() throws IOException
    {
        long time = System.currentTimeMillis();
/*
        DateFormat df=new SimpleDateFormat();
        df.format(time);
        System.out.println(time);
        System.out.println(df);
*/
        FileReader rd = new FileReader("buf.txt");
        BufferedReader buf = new BufferedReader(rd);

        OutputStream out = System.out;
        BufferedOutputStream bout = new BufferedOutputStream(out);

        int i = 0;
        while((i=buf.read())!=-1)
        {
            bout.write(i);
//            bout.flush();
        }

/*
        while ((i = rd.read()) != -1)
        {
            out.write(i);
            out.flush();
        }
*/

        buf.close();
        System.out.printf("\n\n");
        System.out.printf("run time:" + (System.currentTimeMillis() - time));
    }

    private static void mode_4() throws IOException
    {
    }
}
