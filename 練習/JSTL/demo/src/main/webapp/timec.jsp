<%--
  Created by IntelliJ IDEA.
  User: kontai
  Date: 2022/5/14
  Time: 上午 10:21
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
    <%
        out.println("你的IP位置是" + request.getRemoteAddr());
    %>
    <base href="<%=basePath%>">
    <title>檢查使用時間</title>
</head>
<body>
<%!
    public void jpsInit() {
        System.out.println("This is jspInit function.");
    }

    void show() {
        System.out.println("show");
    }
%>
<%
    long t1 = session.getLastAccessedTime();
    long t2 = session.getCreationTime();
    request.setAttribute("name", "tai");
%>
<br>
<%= "使用時間" + (t1 - t2) / 1000 + "秒"%> <br>
<%=request.getAttribute("name")%>
<%--<c:out value="c:out"></c:out>--%>
<p>
    今天的日期是: <%= (new java.util.Date()).toString()%>
</p>
<\% %>
<%
    out.println("a");
    out.flush();
    application.setAttribute("name", "get application attribute");
%>

<%=
application.getAttribute("name")
%>

<%--pageContext包含九大對象--%>
<p>
    <%=
    pageContext.getServletContext().getAttribute("name")
    %>
</p>
<p>
    <%=
    pageContext.getAttributesScope("name")
    %>
</p>



</body>
</html>
