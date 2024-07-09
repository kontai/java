package 集合框架.VIII視圖;

import java.util.*;

public class checklist {
    public static void main(String[] args) {
        var strings = new ArrayList<String>();
        ArrayList rawList = strings;      //warning only, not an error,
        //for compatibility with legacy code
        rawList.add(new Date());
//        List<String> safeStrings= Collections.checkedList(strings,String.class);
//        String o = (String)rawList.get(0);  //ClassCastException

        List<String> saftString = Collections.checkedList(strings, String.class);
        List rawList2 = saftString;

        //checked list throws a ClasCastException
        rawList2.add(new Date());


    }
}
