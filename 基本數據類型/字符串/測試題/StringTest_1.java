package 基本數據類型.字符串.測試題;

/*
 * 1，給定一個字符串數組。按照字典順序進行從小到大的排序。
 * {"nba","abc","cba","zz","qq","haha"}
 * 
 * 思路：
 * 1,對數組排序。可以用選擇，冒泡都行。
 * 2,for嵌套和比較以及換位。
 * 3,問題：以前排的是整數，比較用的比較運算符，可是現在是字符串對象。
 *   字符串對像怎麼比較呢？爽了，對像中提供了用於字符串對像比較的功能。
 * 
 * 
 */
public class StringTest_1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String[] arr = { "nba", "abc", "cba", "zz", "qq", "haha" };

		printArray(arr);

		sortString(arr);

		printArray(arr);

	}

	public static void sortString(String[] arr) {

		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {

				if(arr[i].compareTo(arr[j])>0)//字符串比較用compareTo方法
					swap(arr,i,j);
			}
		}
	}

	private static void swap(String[] arr, int i, int j) {
		String temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public static void printArray(String[] arr) {
		System.out.print("[");
		for (int i = 0; i < arr.length; i++) {
			if (i != arr.length - 1)
				System.out.print(arr[i] + ", ");
			else
				System.out.println(arr[i] + "]");
		}
	}

}
