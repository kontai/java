package com.tai.advice;

import org.springframework.aop.ThrowsAdvice;

public class MythrowSchema implements ThrowsAdvice{
	public void AfterThrowing(Exception e1){
		System.out.println("執行異常通知-Schema-base方式");
	}

}
