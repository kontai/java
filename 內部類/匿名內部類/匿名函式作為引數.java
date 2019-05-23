interface i01{
    final int x=3;
    public static void get(){
        System.out.println("calling interface i01...");
    };
}
class 匿名函式作為引數{
    public static void main(String[] args){
        //將匿名函數體做為實參傳遞 (注意小括號)
        test(new i01(){
            public  void get(){
                System.out.println("main Func");
                }
        }
        );
    }

    //接收一個引數為interface類型的函數  
    public static void test(i01 d){
        System.out.println("calling test()...");
    }
}