<%--
  Created by IntelliJ IDEA.
  User: d&c
  Date: 2018/7/6
  Time: 14:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
<head>
    <title>Title</title>
</head>
<body>

登陆成功!
<br>
您好!${user.username}
<br>
<a href="/index.jsp">首页</a>

</body>
</html>
