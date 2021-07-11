<%--
  Created by IntelliJ IDEA.
  User: kontai
  Date: 2021/5/1
  Time: 下午 04:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>WelCoMe My Login Page!</title>
    <script type="application/javascript">
        function checi() {
            var req;
            req = new XMLHttpRequest();
            req.open()
        }
    </script>
</head>
<body>
<form action="/main" style="align-content: center">
    <div>username<input type="text" placeholder="5-20 char" name="uname"></div>
    <div>password<input type="password" placeholder="5-20 char" name="pwd"></div>
    <input type="submit" value="登入">
</form>
</body>
</html>
