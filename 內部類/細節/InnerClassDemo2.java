package 細節;


/*
為什麼內部類能直接訪問外部類中成員呢？
那是因為內部類持有了外部類的引用。  外部類名.this

*/
class Outer {
    int num = 3;

    class Inner {
        int num = 4;

        void show()
        {
            int num = 5;
            System.out.println(num);
            System.out.println(this.num);
            System.out.println(Outer.this.num);
        }
    }

    void method()
    {
        new Inner().show();
    }
}


class InnerClassDemo2 {
    public static void main(String[] args)
    {
        new Outer().method();
    }
}
