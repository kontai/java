package 基本運算;


public class 賦值 {
    public static void main(String[] args) {
        byte a = 3;
        byte b = 4;
        byte c;
        c = 3 + 4;     //常量運算後,經過強轉->賦值 , 沒問題
        //c = a + b;   //由於a 和 b都是變量,賦值前無法判別運算時,是否會超出byte類型大小,編譯時會判錯



        short va=2;

        //運算符 += 會自動強至轉換
        va+=3;   //等同 va=(short)(va + 3);

        //va=va+2; //做運算時,va換先轉換int類型與int常量相加 , int賦值給short會有失去精準度的問題

    }
}
