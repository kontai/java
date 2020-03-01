package test0301.list;

import javax.swing.plaf.IconUIResource;
import java.util.*;


public class arraylist_demo {
    public static void main(String[] args)
    {
        Collection<Object> cl = new ArrayList();

        show(cl);
    }

    private static void show(Collection<? super String> cl)
    {
        cl.add("ab");
        cl.add("ab");
        cl.add("ab");
        List list = Arrays.asList(cl);
//        cl.add(12);
        Object[] obj = cl.toArray();
        StringBuilder sb = new StringBuilder();
        for(Object  i : obj)
        {
            sb.append(i);
        }

        Set set=new TreeSet();
        int i=0;
        for(Object o:cl)
        {
            System.out.println(++i);
            set.add(o);
        }
//        System.out.println(set);
/*
        List l=new ArrayList();
        l.add("cb");
        l.add("ca");
        l.add("lo");
        l.add("bp");

        Collections.sort(l);
        System.out.println(l);
*/

/*
        System.out.println("Before sort Array::"+sb);
        list=Arrays.asList(sb);
        Collections.sort(list);
        System.out.println("Sorted Array::"+list);
*/



//        System.out.println(cl.getClass());
//
//        Iterator it = cl.iterator();
//        while (it.hasNext())
//        {
//            System.out.println(it.next());
//        }
//
//        System.out.println(cl.contains("ab"));
    }

}

class comp implements Comparable {

    public  int compareTo(Object o1)
    {
        return -1;
    }

}
