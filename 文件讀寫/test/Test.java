package 文件讀寫.test;

public class Test {
    public static void main(String[] args)throws Exception {
        try(
        java.io.PrintWriter output=new java.io.PrintWriter("temp.txt");
        ) {
            output.printf("amout is %f %e\n", 32.32, 32.32);
            output.printf("amout is %5.4f %5.4e\n", 32.32, 32.32);
            output.printf("%6b\n", (1 > 2));
            output.printf("%6s\n", "Java");
        }
    }
}
