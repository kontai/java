<%--
  Created by IntelliJ IDEA.
  User: kontai
  Date: 2022/1/8
  Time: 下午 06:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>add</title>
</head>
<body>
<form action="insert" method="post">
    <table border="1" align="center">
        <tr>
            <td colspan="2" style="text-align:center;font-size:30px;font-weight:bold;"></td>
            花卉信息
        </tr>
        <tr>
            <td><b>花卉名稱</b></td>
            <td><input type="text" name="name"/></td>
        </tr>
        <tr>
            <td><b>花卉價格</b></td>
            <td><input type="text" name="price"/></td>
        </tr>
        <tr>
            <td><b>原產地</b></td>
            <td><input type="text" name="production"/></td>
        </tr>
        <tr>
            <td colspan="2" align="center">
                <input type="submit" value="提交"/><input type="reset" value="重置">
            </td>

        </tr>
    </table>
</form>
</body>
</html>
