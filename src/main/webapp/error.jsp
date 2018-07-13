<%--
  Created by IntelliJ IDEA.
  User: d&c
  Date: 2018/7/6
  Time: 14:03
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

失败!
${message}
<br>
<a href="<%=path%>/index.jsp">返回</a>

</body>
</html>
