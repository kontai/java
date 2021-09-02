<%--
  Created by IntelliJ IDEA.
  User: kontai
  Date: 2021/7/14
  Time: 下午 06:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Ajax 測試業面</title>

    <script type="text/javascript">
        function  show(){

        var ajax;
        if (window.XMLHttpRequest) {
            ajax = new XMLHttpRequest();
        } else if (window.ActiveXObject) {
            ajax = new ActiveXObject("Msxm12.XMLHTTP");
        }
        //複寫onreadystatement對象
        ajax.onreadystatechange = function () {
            var result=ajax.responseText;

            var showDiv = document.getElementById("showDiv");
            showDiv.style.width="400px";
            showDiv.style.height="200px";
            // alert("0");
            if(ajax.readyState==4 && ajax.status==200)
            {
                // showDiv.innerHTML = result;
                showDiv.innerHTML="hello";
            }else
            {
                showDiv.innerHTML="<img src='img/02.gif' width='400px' height='200px'>";

                // showDiv.innerHTML="wait.....";
            }




        }


        //發送請求1 (Get)
        ajax.open("get","ajax",true);
        //獲取元素對象
        ajax.send(null);
        // alert("haha");




        }

    </script>

    <style type="text/css">
        #showDiv {
            border: solid 1px;
            width: 200px;
            height: 100px;
        }


    </style>
</head>
<body>
<h3>AJAX測試</h3>
<hr>
<input type="button" value="press me" onclick="show()">
<div id="showDiv"></div>
</body>
</html>
