class A_Dog {
    public int age = 5;
    public static String name = "Volvo";

    //靜態代碼塊
    static{
        System.out.println("靜態代碼塊調用中...");
    }

    {
        System.out.println("建構代碼塊調用中...");
    }

    public static void run() {
        System.out.println("Dog is running..."); // 靜態函數
        System.out.println(name+"is running...");
       // System.out.println(name+"is"+age+"years old ...");  //在靜態方法內,無法直接調用non-static 成員(在對象生成前,非靜態成員是不存在的)
        A_Dog test=new A_Dog();
       System.out.println(name+"is"+test.age+"years old...");
    }

    public void sleep() {
        System.out.println("Dog is sleeping...");
        System.out.println(name+"is sleeping ...");

    }


    public A_Dog(int age, String name) {
        this.age = age;
        A_Dog.name = name;
    }

    public A_Dog(){}

}

 class 靜態static{

    public static void main(String[] args) {
        A_Dog dog1 = new A_Dog();

        A_Dog.run();  //靜態函數可通過類對象直接調用
        A_Dog.run(); //也可通過類名直接調用(不用特地新增對象,避免佔內存)

        dog1.sleep();
       // A_dog.sleep();  //non-static method 在class 為初始化時(new)不可使用;
        new A_Dog().sleep();

    }
}