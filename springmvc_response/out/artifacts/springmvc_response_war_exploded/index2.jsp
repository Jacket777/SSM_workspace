<%--
  Created by IntelliJ IDEA.
  User: 17081290
  Date: 2020/12/25
  Time: 21:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>首页</title>
  </head>
  <%
    pageContext.setAttribute("ctp",request.getContextPath());
  %>
  <body>
  <div>
    <p>测试日期格式转换器</p>
    <form action = "${ctp}/testDateConverter" method="post">
      <p>id:<input type="text" name="id"></p>
      <p>name:<input type="text" name="name"></p>
      <p>age:<input type="text" name="age"></p>
      <p>password:<input type="password" name="password"></p>
      <p>birth:<input type="text" name="birth"></p>
      <p><input type="submit" value="提交"></p>
    </form>
  </div>
  </body>
</html>
