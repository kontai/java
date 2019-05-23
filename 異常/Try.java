class Try {
    public static void main(String[] args) {
        int[] arr = null;
        div(3, 0, arr);
    }

    public static void div(int a, int b, int[] ar) {
        int c = 0;
        if (b == 0)
            /*
             * try{ 可能出現異常的代碼.... }catch(){ 當出現異常,處理異常的代碼... }
             */
            try {
                c = a / b;
                System.out.println(ar[1]);
            } catch (ArithmeticException e) { // ArithmeticExcoptin(運算異常)
                System.out.println("異常發生 !!");
                System.out.println("toString 輸出:\n" + e.toString());
                System.out.println("getMessage 輸出:\n" + e.getMessage());
                System.out.println("printStackTrace() 輸出:\n");
                e.printStackTrace();
            }
        try {
            ar[2] = 33;
        } catch (NullPointerException e2) { // 空指針
            System.out.println("getMessage 輸出:\n" + e2.getMessage());
            e2.printStackTrace();
        }

        System.out.println("c=" + c);
    }
}