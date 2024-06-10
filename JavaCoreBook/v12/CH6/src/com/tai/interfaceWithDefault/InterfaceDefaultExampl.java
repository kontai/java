package com.tai.interfaceWithDefault;

public class InterfaceDefaultExampl implements Collection {
    public  void show() {
        System.out.println("Hello");
    }

    public void stream(){   //使用了父類的方法(覆蓋了接口方法)
        System.out.println("override Collection default method");
    }

    public static void main(String[] args) {
        var id=new InterfaceDefaultExampl();
        id.show();
        id.stream();
    }



}


