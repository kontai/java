<%--
  Created by IntelliJ IDEA.
  User: kontai
  Date: 2022/5/9
  Time: 上午 10:49
  To change this template use File | Settings | File Templates.
--%>
<%@page pageEncoding="UTF-8" %>
<html>
<head>
    <meta charset="utf-8">
    <script>
        function loadXMLDoc()
        {
            var xmlhttp;
            var txt,x,i;
            if (window.XMLHttpRequest)
            {
                // IE7+, Firefox, Chrome, Opera, Safari 浏览器执行代码
                xmlhttp=new XMLHttpRequest();
            }
            else
            {
                // IE6, IE5 浏览器执行代码
                xmlhttp=new ActiveXObject("Microsoft.XMLHTTP");
            }
            xmlhttp.onreadystatechange=function()
            {
                if (xmlhttp.readyState==4 && xmlhttp.status==200)
                {
                    xmlDoc=xmlhttp.responseXML;
                    txt="";
                    x=xmlDoc.getElementsByTagName("ARTIST");
                    for (i=0;i<x.length;i++)
                    {
                        txt=txt + x[i].childNodes[0].nodeValue + "<br>";
                    }
                    document.getElementById("myDiv").innerHTML=txt;
                }
            }
            xmlhttp.open("GET","cd_catalog.xml",true);
            xmlhttp.send();
        }
    </script>
</head>

<body>

<h2>我收藏的 CD :</h2>
<div id="myDiv"></div>
<button type="button" onclick="loadXMLDoc()">获取我的 CD</button>
666


</body>
</html>