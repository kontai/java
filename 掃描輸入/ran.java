import java.util.*;

class ran {
    public static void main(String[] args) {
        System.out.println("範圍:");
        Scanner in = new Scanner(System.in);
        int range = in.nextInt();

        Random rand = new Random();
        int ran = rand.nextInt(range);

        System.out.println("請輸入數字->");
        Scanner test1 = new Scanner(System.in);
        int get_num = test1.nextInt();
        if (get_num == ran) {
            System.out.println("Bingo!");

        }
        else{
            System.out.println("wrong number...");
        }
        test1.close();
        in.close();

    }
        
    }