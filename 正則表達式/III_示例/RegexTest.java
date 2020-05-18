package 正則表達式.III_示例;

import java.util.TreeSet;

public class RegexTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		/*
		 * 1，治療口吃:我我...我我...我我我要...要要要要...要要要要..學學學學學...學學編編...編編編編..編..程程...程程...程程程
		 * 2，對ip地址排序。 
		 * 3，對郵件地址校驗。 
		 */
		test_3();
	}
	
	//對郵件地址校驗。
	public static void test_3() {
		
		String mail = "abc1@sina.com.cn";
		
		String regex = "[a-zA-Z0-9_]+@[a-zA-Z0-9]+(\\.[a-zA-Z]{1,3})+";
		
		regex = "\\w+@\\w+(\\.\\w+)+";//1@1.1
		
		
		
		boolean b = mail.matches(regex);
		
		System.out.println(mail+":"+b);
		
		
	}
	/*
	 * 1,治口吃。
	 */
	public static void test_1(){
		
		String str = "我我...我我...我我我要...要要要要...要要要要..學學學學學...學學編編...編編編編..編..程程...程程...程程程";
		
		//1，將字符串中.去掉。 用替換。
		str = str.replaceAll("\\.+", "");
		System.out.println(str);
		
		//2,替換疊詞。
		str = str.replaceAll("(.)\\1+", "$1");
		System.out.println(str);
		
		
	}
	/*
	 * ip地址排序。 
	 * 
	 * 192.168.10.34 127.0.0.1 3.3.3.3  105.70.11.55
	 */
	public static void test_2(){
		
		String ip_str = "192.168.10.34  127.0.0.1  3.3.3.3  105.70.11.55";
		
		
		//1,為了讓ip可以按照字符串順序比較，只要讓ip的每一段的位數相同。
		//所以，補零，按照每一位所需做多0進行補充。每一段都加兩個0.
		
		ip_str = ip_str.replaceAll("(\\d+)", "00$1");
		System.out.println(ip_str);
		
		//然後每一段保留數字3位。
		ip_str = ip_str.replaceAll("0*(\\d{3})", "$1");
		System.out.println(ip_str);
		
		
		//1，將ip地址切出。
		String[] ips = ip_str.split(" +");
		
		TreeSet<String> ts = new TreeSet<String>();
		
		for(String  ip : ips){
//			System.out.println(ip);
			ts.add(ip);
		}
		
		for(String ip : ts){
			System.out.println(ip.replaceAll("0*(\\d+)", "$1"));
		}
		
	}

}


