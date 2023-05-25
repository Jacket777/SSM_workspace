<%--
  Created by IntelliJ IDEA.
  User: 17081290
  Date: 2020/12/15
  Time: 11:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<% pageContext.setAttribute("ctp",request.getContextPath());%>
%>
<html>
  <head>
    <title>首页</title>
  </head>
  <body>
  <h1>测试REST</h1>
  <h2>1.新增测试</h2>
  <p>
  <form action="${ctp}/user" method="post">
    <input type="submit" value="新增">
  </form>
  </p>
  <h2>2.更新测试</h2>
  <p>
  <form action="${ctp}/user" method="post">
    <input type="hidden" name="_method" value="put">
    <input type="submit" value="更新">
  </form>
  </p>
  <h2>3.删除测试</h2>
  <p>
  <form action="${ctp}/user" method="post">
    <input type="hidden" name="_method" value="delete">
    <input type="submit" value="删除">
  </form>
  </p>
  <h2>4.查询测试</h2>
  <p><a href="${ctp}/user">查询</a></p>
  </body>
</html>
