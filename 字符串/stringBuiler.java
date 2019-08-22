package 字符串;

public class stringBuiler {
    public static void main(String[] args) {
        /**
         * 如果一個字符串不需要任何改變，則使用String類。
         * JAVA可以完成對Sring類的優化，例如，共享限定字符串等。
         */
        StringBuilder stringBuilder=new StringBuilder("Welcome to Java");

//        stringBuilder.delete(8,11);
//        System.out.println(stringBuilder);

//        stringBuilder.deleteCharAt(8);
//        System.out.println(stringBuilder);

//        System.out.println(stringBuilder.reverse());

//        stringBuilder.replace(11,15,"HTML");
//        System.out.println(stringBuilder);

        stringBuilder.setCharAt(0,'w');
        System.out.println(stringBuilder);



    }
}
