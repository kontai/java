package 內部類.匿名內部類.陷阱;

class Outer {
    void method() {
         new Object() {
            public void show() {
                System.out.println("show run");
            };
        };
//		obj.show();//因為匿名內部類這個子類對像被向上轉型為了Object類型。
        //這樣就不能在使用子類特有的方法了。
    }
}

class InnerClassDemo6 {
    public static void main(String[] args) {
        new Outer().method();
    }
}
