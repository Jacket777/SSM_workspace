<%--
  Created by IntelliJ IDEA.
  User: 17081290
  Date: 2021/5/10
  Time: 19:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>注册页面</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/registerUser" method="post">
    用户名：<input type="text" name="username"/><br/>
    密&nbsp;&nbsp;码:<input type="text" name="passwd"><br/>
    <input type="submit" value="注册">
</form>
</body>
</html>
