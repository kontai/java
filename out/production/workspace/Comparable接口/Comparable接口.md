> ####Comparable接口定義了compaareTo方法，用於比較對象。

> ####兩對象必須是可以比較的。

---
> ####定義:
```java
//Interface for comparing objects,define in java.lang
    package java.lang;
    
    public interface Comparable<E>{
        public int compareTo(E o);
     }
```
     
> #### 返回值:

   小於|等於|大於
   -----|-----|-----
   -1|0|1
   
> #### 將 n 賦值為一個Integer對象,s 為一個string對象,d為一個Date對象。下面所有表達式都為true。

n instanceof Ineger|s instanceof String|d instanceof java.util.Data|
---|---|---
n instanceof Obdect|s instanceof Obhect|d instanceof Object|
n instanceof Comparable|s instanceof Comparable|d instanceof Comparable|
   
   
