package 集合框架.VIII視圖;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class smallCollection {
    public static void main(String[] args) {
        List<String> anmes = List.of("Peter", "Paul", "Mary");
        Set<Integer> numbers = Set.of(2, 3, 5);
        Map<String, Integer> scores = Map.of("Peter", 2, "Paul", 3, "Mary", 5);


        //Error -- null elemnet
//        numbers=Set.of(12,null);

        //Error -- duplicate key
//        scores=Map.of("Peter",4,"Peter",2);
    }
}
