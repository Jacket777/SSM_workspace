<%--
  Created by IntelliJ IDEA.
  User: 17081290
  Date: 2021/1/3
  Time: 20:02
  Time: 20:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>国际化测试页面</title>
  </head>
  <%
    pageContext.setAttribute("ctp",request.getContextPath());
  %>
  <body>
  <a href="${ctp}/i18n">国际化页面</a>
  </body>
</html>
