public static void main(String[] args) //new String[0]

### 主函數特殊之處:
1. 格式是固定的
2. 被jvm所識別和調用
   
- public:因為權限必須是公有
- static:不需要對象,直接用主函數所屬類名調用
- void:主函數沒有具體返回值
- main:函數名,非關鍵字,只是一個jvm識別的固定名字
- String[] args:這是主函數的參數列表,是一個數組類型的參數,元素都是字符串類型