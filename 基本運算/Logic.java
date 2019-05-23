package 基本運算;
public class Logic {
    public static void main(String[] args) {
        // & 與 && 差別
        // & 可作位元運算 與 邏輯運算(符號兩邊都會做運算）
        // && 當第一運算為 false,將不做第二運算
        int a = 3;
        int b = 4;
        int c = 5;
        System.out.println(a & b);
        System.out.println(a & c);

        if (((a += 2) == 4) & ((b += 2) == 5)) ;
        System.out.println("a=" + a);
        System.out.println("b=" + b);

        a = 3;
        b = 4;
        if (((a += 2) == 4) && ((b += 2) == 5)) ;
        System.out.println("a=" + a);
        System.out.println("b=" + b);
    }
}
