//import com.sun.org.apache.bcel.internal.generic.INSTANCEOF;
package 多態;

class Base {
    static int x;
    static int y;

    public Base(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public static void getValue() {
        System.out.println("x=" + x + ",y=" + y);
    }
}

class Der extends Base {
    int z1;

    public Der(int x, int y) {
        super(x, y);
    }

    public static void getValue() {
        System.out.println("x=" + x + ",y=" + y);
    }

}

class DerB extends Base {
    public DerB(int x, int y) {
        super(x, y);
    }

    public static void getValue() {
        System.out.println("x=" + x + ",y=" + y);
    }
}

class si1 {
    public static void main(String[] args) {
        Base a1 = new Der(3, 4);  //（多態）向上轉型:提昇類型，限制對特有功能/成員的訪問。
        a1.getValue();
        getT(a1);
    }

    public static void getT(Base t1) {
        //instanceof(t1);
        System.out.println(t1.x);
        //   System.out.println(t1.z1); 多態 無法訪問子類特有成員
        if (t1 instanceof Der)   //instanceof 判斷類別(需有繼承關係)
            System.out.println(((Der) t1).x);  //強制轉換類型
        //注意:對於轉型，自始自終都是子類對象在做著類型的變化。
        //向下轉型:使用特定功能/成員的訪問。
        // DerB b1=(DerB)t1;  //轉型失敗,向下轉型不能將原Der轉成DerB
        Der aa = (Der) t1;
        aa.z1 = 22;
        System.out.println(aa.z1);
    }
}
