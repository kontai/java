<%--
  Created by IntelliJ IDEA.
  User: kontai
  Date: 2021/5/30
  Time: 下午 06:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="utf-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<%--動態引入--%>
<jsp:include page="index.jsp"></jsp:include>

<%--靜態引入--%>
<%@include file="index.jsp"%>
<% if (2 > 3) { %>
今天的天氣不錯
<% } else { %>
天氣不錯
<% } %>
</body>
</html>
