<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/4/5 0005
  Time: 12:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>第一个界面</title>
</head>
<body>
<c:forEach var="eachUser" items="${list}">
    ${eachUser}
</c:forEach>
${success}
</body>
</html>