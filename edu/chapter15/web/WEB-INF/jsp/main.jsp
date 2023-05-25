<%--
  Created by IntelliJ IDEA.
  User: 17081290
  Date: 2021/5/14
  Time: 16:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>系统主页</title>
  </head>
  <body>
  当前用户:${USER_SESSION.username}
  <a href="/logout">退出</a>
  </body>
</html>
