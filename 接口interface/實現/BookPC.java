
/*
筆記本電腦使用。
為了擴展筆記本的功能，但日後出現什麼功能設備不知道。

定義一個規則，只要日後出現的設備都符合這個規則就可以了。
規則在java中就是接口。

*/
interface USB// 暴露的規則。
{
	public void open();
	public void close();
}


class BookPC
{
	public static void main(String[] args)
	{
		useUSB(new UPan());//功能擴展了。
		useUSB(new UsbMouse());
	}

	//使用規則。
	public static void useUSB(USB u)//接口類型的引用，用於接收(指向)接口的子類對象。//USB u= new UPan();
	{
		if(u!=null)
		{
			u.open();
			u.close();
		}
	}
}
//一年後。------------------------------
//實現規則。

//這些設備和電腦的耦合性降低了。

class UPan implements USB
{
	public void open()
	{
		System.out.println("upan open");
	}
	public void close()
	{
		System.out.println("upan close");
	}

}


class UsbMouse implements USB
{
	public void open()
	{
		System.out.println("UsbMouse open");
	}
	public void close()
	{
		System.out.println("UsbMouse close");
	}

}








/*
class Mouse
{
}

class BookPC
{
	public static void main(String[] args)
	{
		useMouse(new Mouse());
	}
	public static void useMOuse(Mouse m)
	{
		m.open();
	}
	public static void useMOuse(Mouse m)
	{
		m.open();
	}
}
*/