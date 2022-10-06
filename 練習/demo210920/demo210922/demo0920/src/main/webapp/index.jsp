<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>轉帳練習</title>
</head>
<body>
<%--<h1><%= "Hello World!" %>--%>
<%--</h1>--%>
<br/>
<form action="trans" method="post">
    轉帳帳戶:<input type="text" name="accOutaccNo"><br>
    密碼:<input type="password" name="accOutPassword"><br>
    金額:<input type="text" name="balance"><br>
    收款帳號: <input type="text" name="accInaccNo"><br>
    收款人姓名:<input type="password" name="accInName"><br>
    <input type="submit" value="轉帳">

</form>
<a href="hello-servlet">Hello Servlet</a>
</body>
</html>