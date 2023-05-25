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
    <title>update</title>
  </head>
  <%
    pageContext.setAttribute("ctp",request.getContextPath());
  %>
  <body>
   <form action="${ctp}/update">
     <input type="hidden" value="1" name="id"><br>
     <!--
     <p>name:<input type="text" name="name">
     -->
     <p>name:<input type="text" name="name">
     <p>password:<input type="password" name="password"></p>
     <p>age:<input type="text" name="age"></p>
     <input type="submit" value="更新">
   </form>
  </body>
</html>
