package 接口interface.default方法;

public class InterfaceMain {
    public static void main(String[] args) {
        InterfaceAbsA a=new InterfaceAbsA();
        InterfaceAbsB b=new InterfaceAbsB();

        a.show();
        b.show();

        System.out.println("-----------");

        a.defaultMethod();
        b.defaultMethod();
    }
}
