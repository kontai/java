package 集合框架.III泛型.III_自定義泛型.III泛型接口;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class GenericDefineDemo5 {

    /**
     * @param args
     */
    public static void main(String[] args)
    {

        InterImpl in = new InterImpl();
        in.show("abc");

        InterImpl2<Integer> in2 = new InterImpl2<Integer>();
        in2.show(5);


    }

}

//泛型接口，將泛型定義在接口上。
interface Inter<T> {
    public void show(T t);
}


class InterImpl2<Q> implements Inter<Q> {
    public void show(Q q)
    {
        System.out.println("show :" + q);
    }
}


class InterImpl implements Inter<String> {
    public void show(String str)
    {
        System.out.println("show :" + str);
    }
}