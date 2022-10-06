<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1>
<%--    <c:forEach items="${list}" var="l">--%>
<%--        <b>${l}</b><br>--%>
<%--    </c:forEach>--%>
    <c:forEach items="${sessionList}" var="l">
        <b>${l}</b><br>
    </c:forEach>
</h1>
</body>
</html>