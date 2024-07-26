package 集合框架.IVMap集合.WeakHashMap;


import java.util.*;

public class WeakHashMapExample {
    public static void main(String[] args) throws InterruptedException {
        String key1 = new String("k1");
        String key2 = new String("K2");
        //hashmap strong reference
        Map<String, String> hmap = new HashMap<>();
        hmap.put(key1, "hval1");
        hmap.put(key2, "hval2");
        key1 = null;
        key2 = null;
        System.gc();
        System.out.println("///////////////hashmap");
        System.out.println("first  access: " + hmap.get("k1"));
        System.out.println("second access: " + hmap.get("k2"));

        //weakhashmap weak reference
        Map<String, String> wmap = new WeakHashMap<String, String>();
        wmap.put(key1, "wval1");
        wmap.put(key2, "wval2");
        key2 = null;
        key1 = null;
        System.gc();
        System.out.println("///////////////weakhashmap");
        System.out.println("first  access: " + wmap.get("k1"));
        System.out.println("second access: " + wmap.get("k2"));



    }
}
