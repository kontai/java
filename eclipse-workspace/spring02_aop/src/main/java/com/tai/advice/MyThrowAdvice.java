package com.tai.advice;

public class MyThrowAdvice {
	public void myexception(Exception e1) {
		System.out.println("執行異常通知"+e1.getMessage());
	}

}
