<%--
  Created by IntelliJ IDEA.
  User: kontai
  Date: 2021/7/11
  Time: 下午 03:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login Page</title>

    <script type="text/javascript">
        window.onload=function (){
            var date=document.getElementsByName("showDate")
            date.innerHtml=new Date().toDateString();

        }
    </script>
</head>
<body>
<h3>使用者登入</h3>
<hl>
    <div name="showDate"></div>
     <div>
         <form action="checkSession">
             名稱<input type="text" name="uname" id="">
             密碼<input type="text" name="pass" id="">
             <input type="submit" value="OK">
             <br>

         </form>
     </div>
</hl>
</body>
</html>
