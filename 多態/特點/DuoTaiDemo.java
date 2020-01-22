package 特點;
/*

對象的多態性。

class 動物
{}

class 貓 extends 動物
{}

class 狗 extends 動物
{}



貓 x = new 貓();

動物 x = new 貓();//一個對象，兩種形態。



貓這類事物即具備者貓的形態，又具備著動物的形態。
這就是對象的多態性。 

簡單說：就是一個對像對應著不同類型. 

多態在代碼中的體現：
	父類或者接口的引用指向其子類的對象。


多態的好處：
	提高了代碼的擴展性，前期定義的代碼可以使用後期的內容。

多態的弊端：
	前期定義的內容不能使用(調用)後期子類的特有內容。

多態的前提：
	1，必須有關係，繼承，實現。
	2，要有覆蓋。 



*/

abstract class Animal
{
	abstract void eat();

}

class Dog extends Animal
{
	void eat()
	{
		System.out.println("啃骨頭");
	}
	void lookHome()
	{
		System.out.println("看家");
	}
}

class Cat extends Animal
{
	void eat()
	{
		System.out.println("吃魚");
	}
	void catchMouse()
	{
		System.out.println("抓老鼠");
	}
}

class Pig extends Animal
{
	void eat()
	{
		System.out.println("飼料");
	}
	void gongDi()
	{
		System.out.println("拱地");
	}
}



class DuoTaiDemo 
{
	public static void main(String[] args) 
	{
		
//		Cat c = new Cat();
//		c.eat();
//		c.catchMouse();

		Animal a = new Cat(); //自動類型提升，貓對像提升了動物類型。但是特有功能無法s訪問。
							//作用就是限制對特有功能的訪問。
							//專業講：向上轉型。將子類型隱藏。就不用使用子類的特有方法。


//		a.eat();

		//如果還想用具體動物貓的特有功能。 
		//你可以將該對像進行向下轉型。
//		Cat c = (Cat)a;//向下轉型的目的是為了使用子類中的特有方法。
//		c.eat();
//		c.catchMouse();

//		注意：對於轉型，自始自終都是子類對像在做著類型的變化。
//		Animal a1 = new Dog();
//		Cat c1 = (Cat)a1;//ClassCastException


		/*
		Cat c = new Cat();

//		Dog d = new Dog();

//		c.eat();
		method(c);
//		method(d);
//		method(new Pig());
		*/

		method(new  Dog());

	}

	public static void method(Animal a)//Animal a = new Dog();
	{
		a.eat();

		if(a instanceof Cat)//instanceof：用於判斷對象的具體類型。只能用於引用數據類型判斷
//						//通常在向下轉型前用於健壯性的判斷。

		{
			Cat c = (Cat)a;
			c.catchMouse();
		}
		else if(a instanceof Dog)
		{
			Dog d = (Dog)a;
			d.lookHome();
		}
		else
		{
		
		}
		
	}
	/*
	public static void method(Cat c)
	{
		c.eat();
	}
	public static void method(Dog d)
	{	
		
	}
	*/	
}
