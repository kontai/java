<%--
  Created by IntelliJ IDEA.
  User: kontai
  Date: 2021/4/4
  Time: 下午 05:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript">
        function test() {
            //創建ajax引擎對象
            var ajax;
            ajax = new XMLHttpRequest();
            ajax.onreadystatechange = function () {
                if(ajax.readyState==4){
                    var result=ajax.responseText;
                    var str = document.getElementById("bd");
                    str.innerHTML = result;
                }
            }
            ajax.open("get", "aj");
            ajax.send(null);


        }
    </script>

    <style type="text/css">
        #bd {
            border: aqua solid 1px;
            width: 200px;
            height: 100px;
        }
    </style>
</head>
<body>

<h3>都可以~隨便~</h3>
<input type="button" value="按" onclick="test()">
<div id="bd"></div>
</body>
</html>
