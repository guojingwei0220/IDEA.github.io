<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/4/5 0005
  Time: 12:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--<h1 align="center">欢迎来到注解</h1>--%>
<%--<h2>这是您的第一个注解项目</h2>--%>
<%--<h3>您已成功运行第一个springmvc项目</h3>--%>
<%--<a href="/index.jsp">回到主页</a>--%>
    ${msg }<br>
<a href="/goto/userlist">点击进入</a><br>
用户名：${name}
密码：${password}
<a href="/tologin">登录页面</a>
</body>
</html>
