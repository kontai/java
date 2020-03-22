package test0322;

import java.io.*;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;

public class fileDeepScanFilter {
    public static void main(String[] args) throws IOException
    {
        File dir = new File("D:\\workspace");
        List<File> list = new ArrayList<>();
        FilenameFilter filter = new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name)
            {
                return name.endsWith(".java");
            }
        };
        if (dir.exists())
        {
            getProperties(dir, list, filter);
        }
        else
        {
            System.out.println(String.format("File Name %s Not Exist!", dir));
        }
    }

    static void getProperties(File dir, List<File> list, FilenameFilter filter) throws IOException
    {
        for (File file : dir.listFiles())
        {
//            System.out.println(file);
            if (file.isDirectory())
            {
                System.out.println(file);
                getProperties(file, list, filter);
            }else
            {
                if(filter.accept(file,file.getName()))
                    list.add(file);

            }

        }

        BufferedWriter bw = new BufferedWriter(new FileWriter("d:\\aa.txt"));

        Iterator<File> iter = list.iterator();
        while (iter.hasNext())
        {
            bw.write(String.valueOf(iter.next()));
            bw.newLine();
            bw.flush();
        }

        bw.close();


    }
}
