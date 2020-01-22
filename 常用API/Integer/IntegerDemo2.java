package 常用API.Integer;

import java.util.ArrayList;

/*
 * JDK1.5特性：自动装箱和拆箱
 *
 */
public class IntegerDemo2 {
    public static void main(String[] args) {
        //Integer i = new Integer(10);

        //自动装箱
        //相当于： Integer i = new Integer(10);
        //Integer i = 10;

        //自动拆箱
        //相当于 int a = i.intValue();
        //Integer i = 10;
        //int a = i;

        Integer i = 10;
        Integer i2 = 20;
        Integer i3 = i + i2;
        /*
         * Integer i3 = new Integer(i.intValue() + i2.intValue());
         *
         */

        ArrayList list = new ArrayList();
        list.add(1);//自动装箱，list.add(new Integer(1));
    }
}

