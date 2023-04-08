package com.tai.advice;

import java.lang.reflect.Method;

import org.springframework.aop.AfterAdvice;
import org.springframework.aop.AfterReturningAdvice;

public class MyAfterAdvice implements AfterReturningAdvice{

	@Override
	public void afterReturning(Object arg0, Method arg1, Object[] arg2, Object arg3) throws Throwable {
		System.out.println("執行後置通知");
		System.out.println("arg0:"+arg0+" ,arg1:"+arg1+" ,arg2:"+arg2+" ,arg3"+arg3);
	}
	
	

}
