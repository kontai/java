package com.tai.advice;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class MyBeforeAdvice implements MethodBeforeAdvice{

	@Override
	public void before(Method arg0, Object[] arg1, Object arg2) throws Throwable {
		System.out.println("執行前置通知");
		System.out.println("arh0:"+arg0.getName()+" ,arg1:"+arg1+" ,arg2:"+arg2);
	}
	

}
