package com.bjsxt.pojo;

public class User {
	private String uname;
	private String ufav;
	
	
	
	
	
	public String getUfav() {
		return ufav;
	}
	public void setUfav(String ufav) {
		this.ufav = ufav;
	}
	public User(String uname, String ufav) {
		super();
		this.uname = uname;
		this.ufav = ufav;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	
	
	//輸出用戶的愛好
	public void operFav(String fav){
		if("LOL".equals(fav)){
			ufav=fav;
			System.out.println("這個愛好真棒");
		}else if("寫代碼".equals(fav)){
			ufav=fav;
			System.out.println("這個愛好更棒");
		}else{
			System.out.println("查無此愛好");
		}	
	}
	
	//數值運算
	public int operNum(int a,int b){
		return a+b;
	}
	
	
	
	
	
	
	
}
