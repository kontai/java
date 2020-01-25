//import packa.DemoA;//導入了packa包中的DemoA類。
//import packa.DemoAA;
//import packa.DemoAAA;
import packa.*;//導入了packa包中所有的類。
/*
import packa.abc.*;

packa\DemoA.class 
packa\abc\DemoAbc.class

*/
//導包的原則：用到哪個類，就導入哪個類。

//import 幹嘛用的啊？為了簡化類名書寫。
class  PackageDemo
{
	public static void main(String[] args) 
	{

		//packa.DemoA d = new packa.DemoA();
		DemoA d = new DemoA();
		d.show();

		packb.DemoB b = new packb.DemoB();
//		b.method();	//protected只允許子類調用
		System.out.println("Hello Package!");
	}
}


/*

PackageDemo.java:8: 找不到符號
符號： 類 DemoA
位置： 類 mypack.PackageDemo
                DemoA d = new DemoA();
                ^
PackageDemo.java:8: 找不到符號
符號： 類 DemoA
位置： 類 mypack.PackageDemo
                DemoA d = new DemoA();
                              ^
2 錯誤

原因：類名寫錯。

因為DemoA類已經有包的所屬，所以必須要明確其報名。
記住：DemoA這個名詞錯的。 正確名稱是報名.類名  packa.DemoA

--------------------------------------


PackageDemo.java:8: 軟件包 packa 不存在
                packa.DemoA d = new packa.DemoA();
                     ^
PackageDemo.java:8: 軟件包 packa 不存在
                packa.DemoA d = new packa.DemoA();
                                         ^
2 錯誤


原因是在當前目錄下沒找到，因為packa存放在其他目錄下，
應該配置一個classpath。


-------------------------------------

PackageDemo.java:8: packa.DemoA 在 packa 中不是公共的；無法從外部軟件包中對其進
行訪問
                packa.DemoA d = new packa.DemoA();
                     ^
PackageDemo.java:8: packa.DemoA 在 packa 中不是公共的；無法從外部軟件包中對其進
行訪問
                packa.DemoA d = new packa.DemoA();
                                         ^
2 錯誤
--------------------------------------



PackageDemo.java:9: show() 在 packa.DemoA 中不是公共的；無法從外部軟件包中對其進
行訪問
                d.show();
                 ^
1 錯誤




總結：
包與包之間的類進行訪問，被訪問的包中的類必須是public的，被訪問的包中的類的方法也必須是public的。




          public		protected		default		  private
同一類中    ok             ok              ok           ok
同一包中    ok             ok              ok           
子類中      ok             ok              
不同包中    ok


*/