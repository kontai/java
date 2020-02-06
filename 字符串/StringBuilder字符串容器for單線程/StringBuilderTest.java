package StringBuilder字符串容器for單線程;

public class StringBuilderTest {

	/**
	 * @param args
	 */

	public static void main(String[] args) {

		int[] arr = {3,1,5,3,8};
		String s = arrayToString_2(arr);
		
		System.out.println(s);
	}

	public static String arrayToString_2(int[] arr){
		
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		for (int i = 0; i < arr.length; i++) {
			if(i!=arr.length-1)
				sb.append(arr[i]).append(", ");
			else
				sb.append(arr[i]).append("]");
		}
		return sb.toString();
	}
	/**
	 * 將一個int數組變成字符串。
	 */
	public static String arrayToString(int[] arr){
		
		String str = "[";
		for (int i = 0; i < arr.length; i++) {
			if(i!=arr.length-1)
				str+=arr[i]+", ";
			else
				str+=arr[i]+"]";
		}
		
		return str;
	}

}
