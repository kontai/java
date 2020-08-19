package test0305;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class contain01 {
    public static void main(String[] args)
    {
        HashMap<Integer, String> hm = new HashMap<>();
        Calling<Integer,String> call=new Calling(hm);
        hm.put(23, "桃園");
        hm.put(35, "台北");
        hm.put(42, "新竹");

        ConcurrentHashMap chm=new ConcurrentHashMap(hm);
        Map<Integer,String> map=Collections.synchronizedMap(hm);

         final String s=System.getProperty("user.dir");
        System.out.println(s);


    }


}

class Calling<T,E> implements Runnable {

    private HashMap<T, E> hm;


    public Calling(HashMap<T, E> hm)
    {
        this.hm = hm;
    }
    public void run()
    {
        Set<T> keySet = hm.keySet();
        Iterator<T> it = hm.keySet().iterator();

        while (it.hasNext())
        {
            T key = it.next();
            E value = hm.get(key);
            System.out.println(key + "..." + value);
        }
    }
}
