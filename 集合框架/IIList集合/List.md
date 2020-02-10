collection
- List: 有序（存入和取出的順序一致），元素都有索引（角標），元素可以重複。
- Set: 無序，元素不能重複。

List:特有的常見方法:有一個共性特點->都可以操作角標。

1 添加
- void add(index,element);
- void add(index,collection);

2 刪除
- Object remove(index);

3 修改
- Object set(index,element);

4 獲取
- Object get(index);
- int indexOf(Object);
- int lastIndexOf(Object);
- List SubList(feom,to);

list集合是可以完成對元素的增刪改查。

List:
- Vector:內部是數組數據結構，是同步的。
- ArrayList:內部是數組數據結構，是不同步的。替代了Vector。
- LinkedList:



