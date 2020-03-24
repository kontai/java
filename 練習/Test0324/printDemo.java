package Test0324;

import java.io.File;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

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
//        ShowDirectory("d:\\driver");
        System.out.println(DateFormat.getDateTimeInstance().format(getLatestModifiedDate(file)));
        ;

    }

    public static void ShowDirectory(File dir)
    {
//        File dir = new File(in);
        if (dir.exists())
        {
            for (String str : dir.list())
            {
                System.out.println(str + "  " + new File(str).lastModified());
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
}
