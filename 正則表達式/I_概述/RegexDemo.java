package 正則表達式.I_概述;


/*
 * 正則表達式。
 * 
 * 正則表達式用於操作字符串數據。
 * 通過一些特定的符號來體現的。
 * 所以我們為了掌握正則表達式，必須要學習一些符號。
 * 
 * 雖然簡化了，但是閱讀性差。 
 *  
 * 
 * 
 */
public class RegexDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		
		String qq = "123k4567";
//		checkQQ(qq);
		
		String regex = "[1-9][0-9]{4,14}";//正則表達式。
		
//		boolean b = qq.matches(regex);		
//		System.out.println(qq+":"+b);
		
		
//		String str = "aoooooooob";
//		String reg = "ao{4,6}b";
//		boolean b = str.matches(reg);
//		System.out.println(str+":"+b);
		
		
	}
	
	/*
	 * 需求：定義一個功能對QQ號進行校驗。
	 * 要求：長度5~15. 只能是數字， 0不能開頭
	 */
	public static void checkQQ(String qq){
		
		int len = qq.length();
		
		if(len>=5 && len<=15){
			
			if(!qq.startsWith("0")){
				try {
				long l = Long.parseLong(qq);
				
				System.out.println(l+":正確");
				}catch(NumberFormatException e){
					System.out.println(qq+":含有非法字符");
				}
				
			}else{
				System.out.println(qq+":不能0開頭");
			}
		}else{
			System.out.println(qq+":長度錯誤");
		}
		
		
		
	}

}
