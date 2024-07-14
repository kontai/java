package com.tai;

import org.junit.Test;

/**
 * ClassName: wrapclassDemo
 * Package: com.tai
 * Description:
 *
 * @Author Kontai
 * @Create 2024/7/12 上午6:53
 * @Version 1.0
 */
public class wrapclassDemo {

    //JDK5.0後，自動將基本數據型轉換為包裝類(自動裝箱，自動拆箱)
    @Test
    public void test3(){
        Integer i01=20;
        System.out.println(i01);

        Boolean b01=true;
        System.out.println(b01);



    }

    ////////////舊厭法//////////
    /**
     * 基本數據型-->包裝類 ,,<一> 使用包裝類的構造器 <二>(建議) 調用包裝類的valueOf方法
     */
    @Test
    public void test() {
        //任何包裝類都可以使用valueOf方法
        Integer i = Integer.valueOf(20);
        System.out.println(i);

        String str = String.valueOf("23.4");
        Float f = Float.valueOf(str);
        System.out.println(f);

        Boolean booleanValue = Boolean.valueOf("tRue");
        System.out.println(booleanValue);
        //Boolean可以接收任何類型，結果是true或者false
        booleanValue = Boolean.valueOf("3,14");
        System.out.println(booleanValue);
    }


    /**
     * 包裝類-->基本數據型:intValue(),floatValue(),longValue(),byteValue()
     * shortValue(),charValue(),doubleValue(),booleanValue()
     */
    @Test
    public void test2() {
        Integer ii = Integer.valueOf(20);
        int i2 = ii.intValue();
        System.out.println(i2);
    }
}
