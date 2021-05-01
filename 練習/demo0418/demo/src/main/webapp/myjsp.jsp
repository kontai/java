<%--
  Created by IntelliJ IDEA.
  User: kontai
  Date: 2021/4/18
  Time: 下午 04:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8"   language="java" %>
<%@ page import="com.tai.User.User,java.util.*" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<b3><%= request.getParameter("uname")%></b3>
<br>
<b3><%=request.getAttribute("str")%></b3>
<br>
<%--<b3><%=((ArrayList<String>)request.getParameter("list")).get(0)%></b3>--%>
<%="Hello"%>
<br>
<b3>------------------</b3>
<br>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="hello" value="hello pageContext" scope="page"></c:set>
<c:out value="${hello}"></c:out>
<c:forEach begin="0" end="4" step="1" varStatus="vs">
    111---索引角標=${vs.index}---${vs.count}---${vs.last} <br>
</c:forEach>

<%--<b3><%=((User)(((HashMap)request.getParameter("map")).get("a1"))).getAddr().getCity()%></b3>--%>

<%--<b>${paramValues.uname[1]}</b>--%>
<%--<b>${list[0]}</b>--%>
<%--${paramValues.}--%>
<%--<%--%>
<%--    List<String> list=new ArrayList<>();--%>
<%--    list.add("abc");--%>
<%--    PageContext--%>

<%--%>--%>
</body>
</html>
