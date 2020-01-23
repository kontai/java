package 六異常的注意事項;
/*
異常的注意事項：

1，子類在覆蓋父類方法時，父類的方法如果拋出了異常，
那麼子類的方法只能拋出父類的異常或者該異常的子類。

2，如果父類拋出多個異常，那麼子類只能拋出父類異常的子集。



簡單說：子類覆蓋父類只能拋出父類的異常或者子類或者子集。 

注意：如果父類的方法沒有拋出異常，那麼子類覆蓋時絕對不能拋，就只能try .
*/


interface Inter {
    void function();
}

class D implements Inter {
    public void function()//throws Exception
    {
    }
}


class A extends Exception {
}

class B extends A {
}

class C extends Exception {
}


//        Exception
//        |--A
//        |--B
//        |--C


class Fu {
    void show() throws A
    {
    }
}


class Test {
    void method(Fu f)//Fu f  = new Zi();
    {
        try
        {
            f.show();

        } catch (A a)
        {
        }
    }
}


class Zi extends Fu {
    void show() throws C
    {
    }
}


class ExceptionDemo6 {
    public static void main(String[] args)
    {
        Test t = new Test();
        t.show(new Zi());
    }
}
