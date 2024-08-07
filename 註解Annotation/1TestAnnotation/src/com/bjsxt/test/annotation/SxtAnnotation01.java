//package com.bjsxt.test.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(value={ElementType.METHOD,ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface SxtAnnotation01 {

    //格式:
    //參數類型  參數名   預設值(如果沒有指定的話)
    String studentName() default "";
    int age() default 0;
    int id() default -1;   //String indexOf("abc")  -1

    String[] schools() default {"清华大学","北京上学堂"};

}
