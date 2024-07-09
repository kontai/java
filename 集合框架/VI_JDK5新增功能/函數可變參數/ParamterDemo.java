package VI_JDK5新增功能.函數可變參數;

public class ParamterDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

//		int sum = add(4,5);
//		System.out.println("sum="+sum);
//		int sum1 = add(4,5,6);
//		System.out.println("sum1="+sum1);
		
		
//		int[] arr = {5,1,4,7,3};
//		int sum = add(arr);
//		System.out.println("sum="+sum);
//		int[] arr1 = {5,1,4,7,3,9,8,7,6};
//		int sum1 = add(arr1);
//		System.out.println("sum1="+sum1);
		
		int sum = newAdd(5,1,4,7,3);
		System.out.println("sum="+sum);
		int sum1 = newAdd(5,1,2,7,3,9,8,7,6);
		System.out.println("sum1="+sum1);
		
	}
	/*
	 * 函數的可變參數。
	 * 其實就是一個數組，但是接收的是數組的元素。
	 * 自動將這些元素封裝成數組。簡化了調用者的書寫。
	 * 
	 * 注意：可變參數類型，必須定義在參數列表的結尾。
	 * 
	 */
	public static int newAdd(int a,int...  arr){
		
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum+=arr[i];
		}
		return sum;
		
//		System.out.println(arr);		
//		return 0;
	}
	
	public static int add(int[] arr){
		
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum+=arr[i];
		}
		return sum;
		
	}
	
	
	
	public static int add(int a,int b){
		return a+b;
	}
	
	public static int add(int a,int b,int c){
		return a+b+c;
	}

}
