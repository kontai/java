class StaticCode{
    /*
    靜態代碼塊
    隨著類的加載而執行
     */

     static
     {
        System.out.println("123");
     }

     void print()
     {
         System.out.println("non-static print");
     }

}

class staticBlock{
    static
    {
        System.out.println("1st");
    }
    public static void main(String[] args) {
        new StaticCode().print();
        new StaticCode().print();
        System.out.println("2nd");
    }
}