package test0225;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class CollectP {
    public static void main(String[] args)
    {
        Collection c1 = new ArrayList();
        Collection c2 = new ArrayList();
//        Demo0225(c1, c2);

        List list=Demo0225(c1);
        Iterator it = list.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());

        }

    }


    public static   List Demo0225(Collection<? extends Object> c1)
    {

        List list=new ArrayList(c1);
        list.add("abdfasjd");
        list.add(233);
        list.add(3.234);

//        c2.addAll(c1);

        return list;


    }
}
