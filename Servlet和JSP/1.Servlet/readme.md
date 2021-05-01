<body style="color: white">
<ul style="font-size:20px">
<li>
  Servlet 的生命周期:<br/>
  a) 从第一次调用，到服务器关闭。<br/>
  b) 如果在web.xml 中配置了load-on-startup 则是从
  服务器开启到服务器关闭。
</li>
<hr>
<p>

Servlet的生命周期：
* 1、从第一次调用到服务器关闭。
* 2、如果Servlet在web.xml中配置了load-on-startup，生命周期为
从服务器启动到服务器关闭
* 注意：
* init方法是对Servlet进行初始化的一个方法，会在Servlet第一次
加载进行存储时执行
* destory方法是在servlet被销毁时执行，也就服务器关闭时。
</ul>

Service 方法:

<ul>
不管是get 方式还是post 方式的请求，如果Servlet 类中有
service 方法，则优先调用Service 方法。
<br>
<br>
- doGet 方法:
在没有service 方法的情况下如果是get 方式的请求所调
用的处理请求的方法
- doPost 方法:
在没有service 方法的情况下如果是post 方式的请求所调
用的处理请求的方法
</ul>


</body>
