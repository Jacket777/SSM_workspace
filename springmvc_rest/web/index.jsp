<%--
  Created by IntelliJ IDEA.
  User: 17081290
  Date: 2020/12/23
  Time: 19:17
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
  pageContext.setAttribute("ctp",request.getContextPath());
%>
<html>
  <head>
    <title>首页</title>
  </head>
  <body>
  <P>测试</P>
  <form action="${ctp}/user" method="post">
    <input type="submit" value="新增">
  </form>
  <form action="${ctp}/user/1" method="post">
    <input type="hidden" name="_method" value="put">
    <input type="submit" value="更新">
  </form>

  <form action="${ctp}/user/1" method="post">
    <input type="hidden" name="_method" value="delete">
    <input type="submit" value="删除">
  </form>
  <a href="${ctp}/user/1">查询</a>
  </body>
</html>
