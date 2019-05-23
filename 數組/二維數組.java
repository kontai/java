import java.util.Arrays;

class 二維數組 {
    public static void main(String[] args) {
        // 動態初始化
        int a[][] = new int[2][3];
        System.out.println(Arrays.toString(a[0]));
        System.out.println(a.length+"\n");

        // 靜態初始化
 int b[][]={{0,2,3,4,5,6},{33, 4, 55, 6, 77 }, { 44, 5, 66, 7, 88 } };
        System.out.println(Arrays.toString(b[0]));
        System.out.println(b.length);
        System.out.println(b[0].length);
    }

}