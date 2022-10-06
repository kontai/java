<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>TESt</title>
    <style type="text/css">

        table,tr,td{
         alignment: center;

        }

    </style>
</head>
<body>
<div width="500px" height="300px" align="center">

    <table width="30%" border="0" cellspacing="0" cellpadding="0" >
        <caption>人員名單 </caption>
        <tr>
            <th>ID</th>
            <th>姓名</th>
            <th>年齡</th>
        </tr>
        <c:forEach items="${mylist }" var="pi">
            <tr>
                <td>${pi.id }</td>
                <td>${pi.name }</td>
                <td>${pi.age }</td>
            </tr>
        </c:forEach>
    </table>

    <a href="">上一頁</a>
    <a href="">下一頁</a>
</div>
</body>
</html>