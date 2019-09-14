package 接口interface.default方法;

public class InterfaceAbsB implements InterfaceDemo{

    @Override
    public void show() {
        System.out.println("show() in class B");
    }

    @Override
    public void defaultMethod() {
        System.out.println("default method in class B");
    }
}
