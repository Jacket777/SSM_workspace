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
    <title>测试</title>
  </head>
  <body>
  <P>测试</P>
   <form action="${ctp}/testUser" method="post">
     <p>编号:<input type="text" name="id"></p>
     <p>姓名:<input type="text" name="name"></p>
     <p>年龄:<input type="text" name="age"></p>
     <p>性别:<input type="text" name="gender"></p>
     <p>省份:<input type="text" name="address.province"></p>
     <p>城市:<input type="text" name="address.city"></p>
     <p>区域:<input type="text" name="address.town"></p>
     <p><input type="submit" value="提交"></p>
   </form>
  </body>
</html>
