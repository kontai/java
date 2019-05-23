interface Calc {
    /*
     * 在接口裡,成員變量都預設為public final (即使沒明確聲明,編譯器也會幫你加上) , 常量變量需要先初始化
     *  所以在接口不可以,也不需要建構式
     */
    int cx = 2;
    double cy = 3;

    /*
     * 在接口裡,成員變量預設為public static abstractic (抽象類) (即使沒明確聲明,編譯器
     * 會幫你加上)
     */
    void calc();

}

class Num {
    public int x;
    public int y;
    // 靜態成員變量
    public static int sx=5;
    public static int sy=6;

    public Num() {
    };

    public Num(int x, int y) {
        this.x=x;
        this.y=y;
        System.out.println("Num建構式調用中");
    };

    public  void calc() {
        System.out.println("Num void calc()被調用");};
    

}

//
class Add extends Num implements Calc {
    public static int sx=9;
    public static int sy=10;
    public Add(int a, int b) {
        super(a, b);
        x = a;
        y = b;
    }

    public  void calc() {
        System.out.println("a+b=" + (x + y));
    };
}

class Sub extends Num implements Calc {
    public Sub(int a, int b) {
        super(a, b);
        x = a;
        y = b;
    }

    public  void calc() {
        System.out.println("a-b=" + (x - y));
    }

}

class showNumber {
    public static void main(String[] args) {
        Add a1 = new Add(22, 333);
        a1.calc();
        // a1=new Sub(222,33);
        System.out.println("x of a1 = " + a1.x);

        Num b1 = new Sub(333, 22);
        b1.calc();
        System.out.println("x of a1 = " + a1.x);
        System.out.println("x of b1 = " + b1.x);
        System.out.println("sx of a1 = " + a1.sx);
        System.out.println("sy of a1 = " + a1.sy);
        System.out.println("sx of b1 = " + b1.sx);
        System.out.println("sy of b1 = " + b1.sy);

    }
}