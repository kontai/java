package 集合框架.VII其他常用對象API.Math類;

import java.util.Random;

public class MathDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		/*
		 * Math:提供了操作數學運算的方法。都是靜態的。
		 * 
		 * 常用的方法：
		 * ceil():返回大於參數的最小整數。
		 * floor():返回小於參數的最大整數。
		 * round():返回四捨五入的整數。
		 * pow(a,b):a的b次方。
		 * 
		 */
		double d1 = Math.ceil(12.56);
		double d2 = Math.floor(12.56);
		double d3 = Math.round(12.46);
		
//		sop("d1="+d1);
//		sop("d2="+d2);
//		sop("d3="+d3);
		
//		double d = Math.pow(10, 2);
//		sop("d="+d);
		
		Random r = new Random();
		for (int i = 0; i < 10; i++) {
			
//			double d = Math.ceil(Math.random()*10);
//			double d = (int)(Math.random()*6+1);
//			double d = (int)(r.nextDouble()*6+1);
			int d = r.nextInt(6)+1;
			System.out.println(d);
		}
	}

	public static void sop(String string) {
		System.out.println(string);
	}

}
