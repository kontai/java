package 實例;

/*
多態時，
成員的特點：
1，成員變量。
	編譯時：參考引用型變量所屬的類中的是否有調用的成員變量，有，編譯通過，沒有，編譯失敗。
	運行時：參考引用型變量所屬的類中的是否有調用的成員變量，並運行該所屬類中的成員變量。
	簡單說：編譯和運行都參考等號的左邊。哦了。
	作為瞭解。



2，成員函數(非靜態)。
	編譯時：參考引用型變量所屬的類中的是否有調用的函數。有，編譯通過，沒有，編譯失敗。
	運行時：參考的是對像所屬的類中是否有調用的函數。
	簡單說：編譯看左邊，運行看右邊。

	因為成員函數存在覆蓋特性。




3，靜態函數。
		編譯時：參考引用型變量所屬的類中的是否有調用的靜態方法。
		運行時：參考引用型變量所屬的類中的是否有調用的靜態方法。
		簡單說，編譯和運行都看左邊。

		其實對於靜態方法，是不需要對象的。直接用類名調用即可。


		

*/

class Fu {
    int num = 3;

    void show()
    {
        System.out.println("fu show");
    }

    static void method()
    {
        System.out.println("fu static method");
    }
}

class Zi extends Fu {
    int num = 4;

    void show()
    {
        System.out.println("zi show");
    }

    static void method()
    {
        System.out.println("zi static method");
    }
}


class DuoTaiDemo3 {
    public static void main(String[] args)
    {
        Fu.method();
        Zi.method();
        Fu f = new Zi();//
//		f.method();
//		f.show();
//		System.out.println(f.num);


//		Zi z = new Zi();
//		System.out.println(z.num);
    }
}

