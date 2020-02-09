package 數組;

class arr {
    public static void main(String[] args) {
        // 動態初始化 : 類型 [] 變數名 = new 類型名[數組長度]
        int[] arr = new int[20];
        int[] a = new int[3];
        // 將數組a內存位置賦予b (address of)
        // 在c語言,此語句會報錯
        int[] b = a;
        a[0] = 23;
        b[0] = 50;

        System.out.println(a[0]);

        // 靜態初始化 : 類型 [] 變數名 = {元素1,元素2,....}

        // 初始化数组，必须将声明，创建，初始化都放在一条语句中个，分开会产生语法错误。
        // int[] c;
        // c={0,1,2,3,4,5};
        
        int[] c = { 0, 1, 2, 3, 4, 5 };
        for (int index = 0; index < c.length; index++)  //數組名.lenth  返回數組長度
            System.out.println(c[index]);

    }

}