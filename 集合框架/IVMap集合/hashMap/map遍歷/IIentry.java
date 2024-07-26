package 集合框架.IVMap集合.hashMap.map遍歷;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * ClassName: IIentry
 * Package: 集合框架.IVMap集合.hashMap.map遍歷
 * Description:
 *
 * @Author Kontai
 * @Create 2024/7/24 下午4:16
 * @Version 1.0
 */
public class IIentry {
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


        //嵌套泛型 Entry是Map中的内部接口 (也可以直接導包)
        Set<Map.Entry<String, String>> entries = map.entrySet();
        for (Map.Entry<String,String> entry:entries){
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + " : " + value);
        }

    }
}
