class AA { // 外部類
    int out_a;
    int x = 100;

    public AA() {
        out_a = 3;
        System.out.println("外部類");
    }

    class B { // 內部類
        int x = 50;
        int in_a = 4;
        // static int y=55; //由於靜態變量於類被載入就存在於記憶體中,但class B必須要創建對象才會分配空
        // 
        //
        //
        // ,所以class B必須要用static修飾
        final static int y = 55;

        public B() {
            System.out.println("內部類");
            System.out.println("in a=" + out_a);
            System.out.println("in x=" + x);
            System.out.println("out x=" + AA.this.x); // 存在同名變量,訪問外部類變量方式: 類名.this.變量名
        }

    }

    static class C {
        static int i = -3;    //成員內部類一旦出現了靜態的成員,那麼該類也要使用static修飾

        C() {
            System.out.println("calling AA.C constractor...");
        };
    }
}

class inin {
    public static void main(String[] args) {
        AA.B a1 = new AA().new B(); // 內部類創建方式
        System.out.println("static int y of class B=" + a1.y);

        AA.C c1=new AA.C(); //內部類為static 對象創建方式
    }
}
