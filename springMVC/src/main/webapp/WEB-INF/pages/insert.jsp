<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/4/6 0006
  Time: 9:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<html>
<head>
    <title>注册</title>
</head>
<body>
    <form action="/toinsertUser" method="post">

        用户名：<input type="text" name="name"><br>

        密码：  <input type="password" name="password"><br>

        <input type="submit" value="注册">
    </form>
</body>
</html>
