<%--
  Created by IntelliJ IDEA.
  User: kontai
  Date: 2022/5/14
  Time: 下午 07:22
  To change this template use File | Settings | File Templates.
--%>
<html>
<head>
  <title>Setting HTTP Status Code</title>
</head>
<body>
<%
  // 设置错误代码，并说明原因
  response.sendError(407,"Need authentication!!!" );
%>
</body>
</html>