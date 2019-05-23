class A {
    int number;
    int id;
    String name;
    // 構造代碼塊
    // 在一對大括號裡,只要當建構式被喚起,就會先執行代碼塊,然後才做建構
    {
        System.out.println("建構代碼塊執行中....\n");
    }

    {
        System.out.println("另一個代碼塊\n");
    }

    A() { // 無參建構式
        System.out.println("無參構造函數被調用\n");
    }

    A(String c) {
        name = c;
        System.out.println(this + "\n");
    }

    A(int a, int b) {
        this.number = a;
        this.id = b;
    }

    A(int a, int b, String c) {
        // this(c); //呼叫單引數的構造函數
        this(a, b);
        // this.number = a;
        // this.id = b;
        name = c;
        System.out.println("構造函數被調用");
        System.out.println(this + "\n");
    }

    /*
     * void A(){ //普通函數 System.out.println("test"); }
     */

    public void get() {
        System.out.println("number=" + number + '\n');
    }

}

class Struct {
    public static void main(String[] args) {

        A a = new A();
        a.number = 3;
        a.id = 23;
        a.name = "kontai";
        A b = a;
        b.get();

        A c = new A(3, 4, "tai");
        c.get();

        //c.A();

    }
}
