JDBC報錯：java.lang.ClassNotFoundException: com.mysql.jdbc.Driver


記錄一個小問題，折騰了兩個小時，在java工程下面，寫了程式，放到Web專案下面就是報錯，排查發現是資料庫連線這裡有報錯，報錯內容如下：
```
java.lang.ClassNotFoundException: com.mysql.jdbc.Driver
```
我jdbc的驅動包已經匯入了，而且寫的測試java測試資料庫連線程式也是沒問題的，可偏偏放到tomcat當中，就報這個錯誤，debug發現是下面程式碼報錯：

    Class.forName(jdbcName);
很奇怪為什麼載入驅動會報錯，明明寫的java測試程式碼都是沒有問題的。

最後發現問題，原來是必須得要把jdbc的驅動包放在tomcat的lib目錄下，這樣再執行

    Class.forName(jdbcName);

這行程式碼就不會出錯了。

    綜上，在java專案中，只要導驅動包就行了（build path）
    在tomcat中，必須得要把驅動包放在tomcat的lib目錄下。