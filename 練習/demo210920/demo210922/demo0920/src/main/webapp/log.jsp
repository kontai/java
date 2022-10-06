<%--
  Created by IntelliJ IDEA.
  User: kontai
  Date: 2021/9/18
  Time: 下午 06:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Log page</title>
</head>
<body>
<table border="1">
    <tr>
        <th>轉帳帳號</th>
        <th>收款帳號</th>
        <th>轉帳金額</th>
    </tr>
    <c:forEach items="${page.list}" var="pi">
        <tr>
            <td>${pi.accOut}</td>
            <td>${pi.accIn}</td>
            <td>${pi.money}</td>
        </tr>
    </c:forEach>
</table>
<a href="page?pageSize=${page.pageSize}&pageNumber=${page.pageNumber-1}" <c:if test="${page.pageNumber<=1}"> onclick="javascript:return false;" </c:if> >上一頁</a>
<a href="page?pageSize=${page.pageSize}&pageNumber=${page.pageNumber+1}" <c:if test="${page.pageNumber>=page.total}"> onclick="javascript:return false;" </c:if> >下一頁</a>
</body>
</html>
