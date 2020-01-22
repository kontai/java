//package arrayList類;
import java.util.ArrayList;
import java.util.Arrays;

public class C1131 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        String[] str = {"Dallas", "Dallas", "Houston", "Dallas"};
//        for (String s : str) {
//            list.add(s);
//        }
        ArrayList<String> list2=new ArrayList<>(Arrays.asList(str));
        for(int i=0;i<list2.size();i++)
            list2.remove("Dallas");


    }
}
