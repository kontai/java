interface IA {
    int x = 3;

    abstract public void print();
}

interface B {
    // int x = 4; //變量重名衝突

    abstract public void print();
}

abstract class C {
   abstract public void print();
   public void print(int x){};
}

// class Complex extends IA,B{ // 可實現多接口
class Complex extends C {
    public static void main(String[] args) {
        Complex a1 = new Complex();
        a1.print();
        //a1.print(22);
    }

    public void print() {
        System.out.println("test");
    }
}