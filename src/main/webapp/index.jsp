<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="utf-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
<head>
<title>登录</title>
</head>
<body>
<form name="form1" action="/Login.do" method="post" >
    <table width="300" border="1" align="center">
        <tr>
            <td colspan="2">登陆窗口</td>
        </tr>
        <tr>
            <td>用户名/手机:</td>
            <td>
                <input type="text" name="username">
            </td>
        </tr>
        <tr>
            <td>密码:</td>
            <td>
                <input  type="password" name="password"/>
            </td>
        </tr>
        <tr>
            <td colspan="2">
                <input type="submit" name="submit" value="登录"/>
            </td>
        </tr>
    </table>
</form>

<form name="form2" action="/register.do" method="post" >
    <table width="300" border="1" align="center">
        <tr>
            <td colspan="2">注册窗口</td>
        </tr>
        <tr>
            <td>用户名:</td>
            <td>
                <input type="text" name="username">
            </td>
        </tr>
        <tr>
            <td>手机:</td>
            <td>
                <input type="text" name="mobile">
            </td>
        </tr>
        <tr>
            <td>密码:</td>
            <td>
                <input  type="password" name="password"/>
            </td>
        </tr>
        <tr>
            <td colspan="2">
                <input type="submit" name="submit" value="注册"/>
            </td>
        </tr>
    </table>
</form>
</body>
</html>

