<%--
  Created by IntelliJ IDEA.
  User: kontai
  Date: 2021/7/20
  Time: 上午 10:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--<%@taglib prefix="c" uri="http://java.sun.com/jstl/core" %>--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>JSTL page</title>

</head>
<body>
<%
    int a = 2;
    String str = "abc";
    request.setAttribute("a", a);
    request.setAttribute("str", str);
%>

${a}
${str}
<br>
<c:out value="${a}"/>
<c:out value="${str}"/>
<c:if test="${a==2}">
    <c:out value="true"></c:out>
</c:if>
<br>
<c:choose>
    <c:when test="${a>2}">
        <c:out value="a>2"/>
    </c:when>
    <c:when test="${a<2}">
        <c:out value="a<2"/>
    </c:when>
    <c:when test="${a==2}">
        <c:out value="a=2"/>
    </c:when>
</c:choose>

<%---------foreach-------------------%>

<table border="1px"  >

    <c:forEach begin="1" end="5" step="1">
        <tr style="padding: 20px ;margin: 2px; border-radius: 12px">
            <td>id</td>
            <td>username</td>
            <td>password</td>
            <td>salary</td>
            <td>date</td>
        </tr>
        <tr>
            <td>0</td>
            <td>kontai</td>
            <td>123</td>
            <td>1000</td>
            <td>now</td>
        </tr>
        <tr>
            <td>1</td>
            <td>jason</td>
            <td>123</td>
            <td>2200</td>
            <td>now</td>
        </tr>

    </c:forEach>
    <br>

    ${list}
    <br>

    <c:forEach items="${requestScope.list}" var="ch">
        <c:out value="${ch}"/>
    </c:forEach>

</table>

</body>
</html>
