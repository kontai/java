<%@ page import="java.util.Date" %><%--
  Created by IntelliJ IDEA.
  User: kontai
  Date: 2021/7/11
  Time: 下午 04:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
    <%--<h3>Welcome , <%=request.getParameter("uname")%>--%>
    <h3>Welcome,<%=session.getAttribute("uname")%></h3>
    <br>
    <h2><%=new Date()%>
    </h2>
    <br>
    session 創建時間: <%=session.getAttribute("createTime")%>
    <br>
    seesion 最後一次訪問時間: <%=session.getAttribute("lastAccessTime")%>
    <br>
    <br>
    </h3>

    <% if(String.valueOf(this.getServletConfig().getServletContext().getAttribute("number"))!=null)
        {response.getWriter().write("number:"+(this.getServletConfig().getServletContext().getAttribute("number"))
        );} %>
</body>
</html>
