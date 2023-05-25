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
    <title>测试页面</title>
</head>
<body>
<h6>1.页面数据回显示操作</h6>
<p>${msg}</p>
<h6>2.页面数据回显示操作--Model</h6>
<p>${msg1}</p>
<h6>3.页面数据回显示操作--ModelMap</h6>
<p>${msg2}</p>
<h6>4.测试回显数据的作用域</h6>
<div>
    <p>page:${pageScope.msg}</p>
    <p>request:${requestScope.msg}</p>
    <p>session:${sessionScope.msg}</p>
    <p>application:${applicationScope.msg}</p>
</div>

<h6>5.页面数据回显示操作--ModelAndView</h6>
<p>${msg3}</p>
<h6>6.测试回显数据的作用域---MV</h6>
<div>
    <p>page:${pageScope.msg3}</p>
    <p>request:${requestScope.msg3}</p>
    <p>session:${sessionScope.msg3}</p>
    <p>application:${applicationScope.msg3}</p>
</div>
<h6>7.测试session作用域</h6>
<div>
    <p>session:${sessionScope.username}</p>
    <p>request:${requestScope.username}</p>
</div>
</body>
</html>
