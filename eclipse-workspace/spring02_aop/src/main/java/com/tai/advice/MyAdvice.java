package com.tai.advice;

import org.aspectj.lang.ProceedingJoinPoint;

public class MyAdvice {
	public void mybefore(String name1,int age1) {
		System.out.println("前置通知"+name1+", "+age1);
	}
	public void mybefore1(String name1) {
		System.out.println("前置通知1"+name1);
	}
	public void myafter2() {
		System.out.println("後置通知2");
	}
	public void myafter() {
		System.out.println("後置通知(發生異常也會執行)");
	}
	
	public void mythrow() {
		System.out.println("異常");
	}
	public Object mysurround(ProceedingJoinPoint p) throws Throwable {
		System.out.println("執行環繞");
		System.out.println("還掃-前置");
		Object result = p.proceed();
		System.out.println("環繞-後置"+result);
		return result;
	}

}
