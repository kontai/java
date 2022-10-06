<%--
  Created by IntelliJ IDEA.
  User: kontai
  Date: 2022/5/10
  Time: 上午 10:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>

<html>
<head>
    <base href="<%=basePath%>">
    <title>ajax</title>
    <style>
        div {
            border: yellow 5px;
            width: 300px;
            height: 200px;
        }
    </style>

    <script type="text/javascript">
        var ajax;

        function jump() {
            if (window.XMLHttpRequest) {
                ajax = new XMLHttpRequest();
            } else if (window.ActiveXObject) {
                ajax = new ActiveXObject("Microsoft.XMLHTTP");
            }

            var dom = document.getElementById("aj");

            ajax.onreadystatechange = function () {
                if (ajax.readyState == 4) {

                    if (ajax.status == 200) {
                        var result = ajax.responseText;
                        dom.innerText = result
                    }
                    if (ajax.status == 404) {
                        dom.innerText = "404 - 網頁不存在"

                    }
                    if (ajax.status == 500) {
                        dom.innerText = "500 - 伺服器繁忙.."

                    }
                }
            }

            ajax.open("get", "s.text");
            ajax.send(null);
        }

    </script>
</head>
<body>
<input type="button" value="click" onclick="jump()">
<div id="aj">
    將要替換的文字.....
</div>
</body>
</html>
