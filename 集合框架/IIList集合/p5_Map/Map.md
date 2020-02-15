###Map: 一次添加一對元素。Collection一次添加一個元素。
    Map也稱為雙列集合,Collection集合稱為單列集合。
    其實map集合中存儲的就是鍵值對。
    map集合中必須保證鍵的唯一性。
    
###常用方法：
```
1.添加
    value put(key,value):返回前一個和key關聯的值,如果沒有~返回null.

2.刪除
    void clear():清空map集合
    void remove(key):根據指定的key翻出這個鍵值對。

3.判斷
    boolean containKey(key):
    boolean containValue(value):
    boolean isEmpty();

4.獲取
    value get(key):通過鍵獲取值,如果沒有該鍵,返回null。
                    當然,可以通過返回null,來判斷是否包含指定鍵。
    int size():獲取鍵值對的個數。
```
