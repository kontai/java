<%--
  Created by IntelliJ IDEA.
  User: kontai
  Date: 2022/5/9
  Time: 上午 09:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>

<html>
<head>
    <meta http-equiv="Content-Type" content="text/html" ; charset="utf-8">
    <base href="<%=basePath%>">
    <title>AJAX test page</title>
    <style type="text/css">
        div {
            border: yellow 1px;
            width: 300px;
            height: 150px;
        }
    </style>

    <script type="text/javascript">
        function getAjax() {
            var ele = document.getElementById("ajax");
            var ajax;
            if (window.XMLHttpRequest) {
                ajax = new XMLHttpRequest();
            } else if (window.ActiveXObject) {
                ajax = new ActiveXObject("Msxml2.XMLHTTP");
            }

            ajax.onreadystatechange = function () {
                if (ajax.readyState == 4) {
                    if (ajax.status == 200) {
                        var result = ajax.responseText;
                        ele.innerText = result;
                    } else if (ajax.status == 404) {
                        ele.innerText = "伺服器繁忙404."
                    } else if (ajax.status == 500) {
                        ele.innerText = "伺服器繁忙500."
                    }
                }
            }
            // ajax.open("get", "/s.text");
            // ajax.open("get", "page")
            ajax.open("POST","page")
            ajax.setRequestHeader("Content-type","application/x-www-form-urlencoded")
            ajax.send("name=kontai&pwd=123");


        }
    </script>

</head>
<body>
<input type="button" value="測試" onclick="getAjax()">
<div id="ajax">使用ajax改變內容</div>

</body>
</html>
