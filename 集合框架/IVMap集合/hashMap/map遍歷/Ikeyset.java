package 集合框架.IVMap集合.hashMap.map遍歷;

import org.junit.Test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * ClassName: Ikeyset
 * Package: 集合框架.IVMap集合.hashMap.map遍歷
 * Description:
 *
 * @Author Kontai
 * @Create 2024/7/24 下午4:08
 * @Version 1.0
 */
public class Ikeyset {
    @Test
    public void test(){
        //创建集合
        Map<String,String> map=new HashMap<>();

        //增加元素
        map.put("key1","value1");
        map.put("key2","value2");
        map.put("key3","value3");
        map.put("key4","value4");
        map.put("key5","value5");

        //利用keyset獲取key
        Set<String> keySet = map.keySet();

        //遍歷集合，獲取值
        for(String key:keySet){
            System.out.println(key+" : "+map.get(key));
        }
    }
}
