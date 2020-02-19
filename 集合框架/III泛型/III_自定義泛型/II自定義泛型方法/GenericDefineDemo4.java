package 集合框架.III泛型.III_自定義泛型.II自定義泛型方法;

import 集合框架.III泛型.III_自定義泛型.I泛型類.Tool;

public class GenericDefineDemo4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		
		Tool<String> tool = new Tool<String>();
		
		tool.show(new Integer(4));
		tool.show("abc");
		tool.print("hahah");
//		tool.print(new Integer(8));	//類型限制
		Tool.method("haha");
		Tool.method(new Integer(9));
	}
	

}
