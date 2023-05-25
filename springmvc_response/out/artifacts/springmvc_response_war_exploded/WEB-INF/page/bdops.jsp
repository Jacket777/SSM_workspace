<%--
  Created by IntelliJ IDEA.
  User: 17081290
  Date: 2020/12/25
  Time: 21:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>测试BDOPS回调页面</title>
</head>
<body>
<h6>1.回调操作</h6>
<div>
    <p>request:${requestScope.msg}</p>
    <p>session:${sessionScope.msg}</p>
    <p>application:${applicationScope.msg}</p>
</div>
</body>
</html>
