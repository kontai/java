 <html lang="zh">
<body style="background-color: darkgray; color:white;font-size: 26px">
<ol style="list-style:none;">
<h2>
JDBC新增學習
</h2>
<li>導入jdbc驅動包</li>
<ul><li>無論oracle,mysql 都導入<u>java.sql</u>內的connection和DriverManager包</li></ul>
<li>加載驅動</li>
<sub style="color: yellow;font-size: 16px"><code><code>Class.forName("oracle.jdbc.driver.OracleDriver");</sub>
<ul><li>
</li></ul>
<li>
獲取數據庫連接對象<br/>
<sub style="color: yellow;font-size: 16px"><code>Connection conn=DriverManager.getConnection("url","username","password");</code></sub>
<ul>
<li>
<strong>獲取url</strong><br/>
方式:Oracle JDBC Thin using an SID:<br/>
格式:jdbc:oracle:thin:@host:port:SID<br/>
Example: <br/>jdbc:oracle:thin:@localhost:1521:orcl
这种格式是最简单也是用得最多的<br/>
<hr>
你的oracle的sid可以通过一下指令获得：<br/>
sqlplus / as sysdba<br/>
select value from v$parameter where name=‘instance_name’;
</li>
</ul>
</li>
<li>
創建sql命令對象            <br/>
<sub style="color: yellow;font-size: 16px"><code>Statement stmt=conn.createStatement;</code></sub>
<ul><li>
作用:<br/>
編譯,發送SQL命令
</li></ul>
</li>
<li>
創建命令<br/>
 <sub style="color: yellow;font-size: 16px"><code>String sql="insert into dept values(55,".")"</code></sub>
</li>
<li>
執行SQL命令:<br/>
<ul><li>
新增命令:<br/>
 <sub style="color: yellow;font-size: 16px"><code>int i=stmt.executeUpdate(sql);</code></sub>
</li>
<li>
返回值:<br/>
返回值如果小於0,表示未執行成功<br/>
返回值如果大於0,返回成功修改數量<br/>
</li></ul>
</li>
<li>
關閉資源<br/>
 <sub style="color: yellow;font-size: 16px"><code>stmt.close()</code></sub><br/>
 <sub style="color: yellow;font-size: 16px"><code>conn.close();</code></sub><br/>
</li>
        </ol>
    </body>
</html>
