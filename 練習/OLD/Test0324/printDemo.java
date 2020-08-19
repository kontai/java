package 練習.Test0324;

import java.io.File;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.TreeSet;

public class printDemo {
    public static void main(String[] args) throws ParseException
    {
/*
        System.out.println(System.currentTimeMillis());;

        Date date=new Date();
        System.out.println(date);

//        SimpleDateFormat sdf=new SimpleDateFormat("YY/mm/DD");
//        System.out.println(sdf.format(date));

        DateFormat df=DateFormat.getDateTimeInstance(DateFormat.LONG,DateFormat.LONG);
        System.out.println(df.format(date));

        DateFormat df2=new SimpleDateFormat("YY/MM/DD HH:mm:ss");
        System.out.println(df2.format(date));
*/

        File file = new File("d:\\workspace\\JAVA");
        ShowDirectory(new File("d:\\driver"));
//        System.out.println(DateFormat.getDateTimeInstance().format(getLatestModifiedDate(file)));
        ;
        showTree();

    }

    public static void ShowDirectory(File dir)
    {
//        File dir = new File(in);
        if (dir.exists())
        {
            File[] fileList=dir.listFiles();
            for (File str : fileList)
            {
                Date date =new Date(dir.lastModified()) ;
//                System.out.println(str + "  " + DateFormat.getDateTimeInstance().format(date));
                System.out.println(str.getName()+ "  " + new SimpleDateFormat("YY/MM/dd").format(date));
            }
        }
    }

    private static long getLatestModifiedDate(File dir)
    {
        File[] files = dir.listFiles();
        String newestFile = null;
        long latestDate = 0;
        for (File file : files)
        {
            long fileModifiedDate = file.isDirectory()
                    ? getLatestModifiedDate(file) : file.lastModified();
            if (fileModifiedDate > latestDate)
            {
                latestDate = fileModifiedDate;
            }
        }
        return Math.max(latestDate, dir.lastModified());
    }

    private  static void showTree()
    {
        TreeSet ts=new TreeSet();
        ts.add("an");
        ts.add("ss");
        Iterator<String> it=ts.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
    }
}
