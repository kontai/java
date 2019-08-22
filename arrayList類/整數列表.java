package arrayList類;

import java.util.ArrayList;
import java.util.Arrays;

public class 整數列表 {
    public static void main(String[] args) {
        Integer[] array={3,5,39,2,93,12,32};
        ArrayList<Integer> l=new ArrayList<>(Arrays.asList(array));

        //最大&最小值
        System.out.println("max: "+java.util.Collections.max(l));
        System.out.println("min: "+java.util.Collections.min(l));

        //排列
        java.util.Collections.sort(l);
        System.out.println("sort: "+l);

        //亂序
        java.util.Collections.shuffle(l);
        System.out.println("shuffle: "+l);

        Integer[] arr={3,5,39,2,93,12,32};
        ArrayList<Integer> II=new ArrayList<>(Arrays.asList(arr));
        System.out.println(java.util.Collections.max(II));
    }
}
