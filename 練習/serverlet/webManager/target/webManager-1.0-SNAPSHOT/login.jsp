<%--
  Created by IntelliJ IDEA.
  User: kontai
  Date: 2021/2/21
  Time: 上午 10:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title>欢迎登录后台管理系统</title>
    <link href="css/style.css" rel="stylesheet" type="text/css" />
    <script language="JavaScript" src="js/jquery.js"></script>
    <script src="js/cloud.js" type="text/javascript"></script>

    <script language="javascript">
        $(function(){
            $('.loginbox').css({'position':'absolute','left':($(window).width()-692)/2});
            $(window).resize(function(){
                $('.loginbox').css({'position':'absolute','left':($(window).width()-692)/2});
            })
        });
    </script>

</head>

<body style="background-color:#df7611; background-image:url(images/light.png); background-repeat:no-repeat; background-position:center top; overflow:hidden;">



<div id="mainBody">
    <div id="cloud1" class="cloud"></div>
    <div id="cloud2" class="cloud"></div>
</div>


<div class="logintop">
    <span>欢迎登录后台管理界面平台</span>
</div>

<div class="loginbody">

    <span class="systemlogo"></span>

    <div class="loginbox loginbox1">
<form action="login" method="post">
        <ul>
            <li><input name="uname" type="text" class="loginuser" value="" placeholder="帳號"/></li>
            <li><input name="pwd" type="password" class="loginpwd" value="" placeholder="密碼"/></li>
            <li class="yzm">
                <span><input name="" type="text" value="" placeholder="驗證碼"></span><cite>X3D5S</cite>
            </li>
            <li><input name="" type="submit" class="loginbtn" value="登陸"  onclick="javascript:window.location='main.html'"  /><label><input name="" type="checkbox" value="" checked="checked" />记住密码</label><label><a href="#">忘记密码？</a></label></li>
        </ul>
</form>

    </div>

</div>


<div class="loginbm"> <a href="http://www.uimaker.com"></a>  版權所有 2021 勿使用於商業用途</div>


</body>

</html>

