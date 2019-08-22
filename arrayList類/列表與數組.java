package arrayList類;

import java.util.Arrays;
import java.util.ArrayList;

public class 列表與數組 {
    public static void main(String[] oargs) {
        //數組轉換成列表
        String[] str={"red","green","blue"};
        ArrayList<String> list=new ArrayList<>(Arrays.asList(str));

        //列表轉換成數組
        String[] str2=new String[list.size()];
        list.toArray(str2);

    }
}
