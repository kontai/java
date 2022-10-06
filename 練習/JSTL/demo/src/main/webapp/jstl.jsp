<%--
  Created by IntelliJ IDEA.
  User: kontai
  Date: 2022/5/12
  Time: 上午 10:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>

<html>
<head>
    <base href="<%=basePath%>">
    <title>JSTL學習</title>
    <script type="text/javascript">
        var el=document.getElementById("d");
        el.childNodes[0];



    </script>
</head>
<body>

<%
    request.setAttribute("str", "heyhey");
%>

<%--out--%>
<c:out value="${str}" default="haha"></c:out> <br>
<c:out value="${str2}" default="haha"></c:out> <br>

<%--set--%>
<c:set value="hello" var="hello pageContext"></c:set>
<c:out value="${hello}" default="null?"></c:out> <br>

<c:choose>
    <c:when test="${score>=50}">

    </c:when>
</c:choose>
</body>
</html>
