<%--
  Created by IntelliJ IDEA.
  User: kontai
  Date: 2021/7/18
  Time: 下午 01:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>查詢頁面</title>
    <script type="text/javascript">
        function chkInfo() {
            var ajax;
            var name = document.getElementById("uname").value;
            //Firefox, Opera, IE7, and other browsers will use the native object
            if (window.XMLHttpRequest) {
                ajax = new XMLHttpRequest();
                //IE 5 and 6 will use the ActiveX control
            } else if (window.ActiveXObject) {
                ajax = new ActiveXObject("Microsoft.XMLHTTP");
            }

            ajax.onreadystatechange = function () {
                if (ajax.readyState === 4 && ajax.status === 200) {
                    var result = ajax.responseText;
                    eval("var v=" + result);
                    // console.log(v);

                    var tb = document.getElementById("tble");
                    tb.innerHTML = "";
                    var tr = tb.insertRow(0);
                    var cell0 = tr.insertCell(0);
                    cell0.innerHTML = "UID";
                    var cell1 = tr.insertCell(1);
                    cell1.innerHTML = "帳號";
                    var cell2 = tr.insertCell(2);
                    cell2.innerHTML = "密碼";
                    var cell3 = tr.insertCell(3);
                    cell3.innerHTML = "性別";
                    var cell4 = tr.insertCell(4);
                    cell4.innerHTML = "年齡";


                    var tr = tb.insertRow(1);
                    var cell0 = tr.insertCell(0);
                    cell0.innerHTML = v.uid;
                    var cell1 = tr.insertCell(1);
                    cell1.innerHTML = v.uname;
                    var cell2 = tr.insertCell(2);
                    cell2.innerHTML = v.pwd;
                    var cell3 = tr.insertCell(3);
                    cell3.innerHTML = v.sex;
                    var cell4 = tr.insertCell(4);
                    cell4.innerHTML = v.age;


                } else {
                    var tb2 = document.getElementById("tble");
                    tb2.innerHTML = "<img src='img/loading.gif' width='200px' height='100px'>";
                }
            }

            // alert("name="+name);
            ajax.open("get", "sv?name=" + name);
            ajax.send(null);

        }
    </script>
    <style type="text/css">
        body{
            width: 100%;
            height: 100%;
            padding: 0;
            margin: 0;
            align-content: center;
        }

    </style>
</head>
<body >
<br>
<input type="text" name="uname" id="uname">
<input type="button" value="查詢" onclick="chkInfo()">
<hr>
<br>
<table name="tble" border="1px" id="tble" style="align-content: center">
