package com.tai.Demo01;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class interfaceDemo implements Comparable {
    private List<Integer> arr1 = null;

    interfaceDemo() {arr1 = new ArrayList<>();}

    public static void main(String[] args)
    {
        interfaceDemo ifd = new interfaceDemo();
        MyComparetor mc = new MyComparetor();
        int j = 0;
        Random ran = new Random();
        for (int i = 0; i < 100; i++)
        {
            j = ran.nextInt(99);
            System.out.println(j + " ");
            ifd.arr1.add(j);
        }
        //        Collections.sort(ifd.arr1, mc);
        Object[] it = ifd.arr1.toArray();
        Arrays.rsort(it);
        for (Object i : it)
        {
            System.out.print((int) i + " ");
        }

        /*
        Date time = new Date(System.currentTimeMillis());
        Date time2 = new Date();
        DateFormat df=new SimpleDateFormat("dd/MM/yyyy");
        String dd=df.format(time2);
        Date newDate= null;
        try
        {
            newDate = df.parse("12/02/2020");
        } catch (ParseException e)
        {
            e.printStackTrace();
        }
                System.out.println(time);
        System.out.println(time2);
        System.out.println(dd);
        System.out.println(newDate);

                System.out.println(ifd.arr1);
                System.out.println(ifd.arr1.size());
        */
    }

    @Override
    public int compareTo(Object i,Object o)
    {

        return Integer.compare((int)i,(int)o);
    }


    //    @Override
    //    public int compareTo(Object o)
    //    {
    //        return Integer.compare();
    //    }
}
//
//class MM implements Comparable<Y>
//{
//    @Override
//    public int compareTo(Y o)
//    {
//        System.out.println("compareTo被調用");
//        return 0;
//    }
//}


