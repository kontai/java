package 抽象類;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;

public class LargestNumbers {
    public static void main(String[] args) {
        ArrayList<Number> list=new ArrayList<>();
        list.add(23);
        list.add(12.6);
        list.add(new BigInteger("22292929229229292229299922229999"));
        list.add(new BigDecimal("1.39993328388283292849922229999"));
        System.out.println("The Largest number is "+getLargeNumber(list));

    }

    public static Number getLargeNumber(ArrayList<Number> list)
    {
        if(list==null || list.size()==0)
            return null;
        Number num=list.get(0);
        for(int i=0;i<list.size();i++)
        {
            if(list.get(i).doubleValue()>num.doubleValue())
                num=list.get(i);
        }
        return num;
    }
}
