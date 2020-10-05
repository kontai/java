package com.tai.Demo01;

import javax.management.ObjectName;
import java.util.Comparator;


public class MyComparetor implements Comparator<Object> {
    @Override
    public int  compare(Object o1, Object o2)
    {
        return o2==o1?0:(int)o2-(int)o1;
    }
}

