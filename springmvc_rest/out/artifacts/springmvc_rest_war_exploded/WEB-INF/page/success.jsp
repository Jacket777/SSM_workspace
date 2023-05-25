<%--
  Created by IntelliJ IDEA.
  User: 17081290
  Date: 2020/12/23
  Time: 19:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>success</title>
  </head>
  <body>
  <p>测试页面</p>
  <p>操作成功</p>
  <p>request: ${requestScope.get("request")}</p>
  <p>session: ${sessionScope.get("session")}</p>
  </body>
</html>
