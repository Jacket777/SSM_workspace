<%--
  Created by IntelliJ IDEA.
  User: 17081290
  Date: 2020/12/15
  Time: 11:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <%
    pageContext.setAttribute("ctp",request.getContextPath());
  %>
  <body>
    <form action="${ctp}/testUser" method="post">
      <div>
        编号：<input type="text" name="id">
      </div>
      <div>
        姓名：<input type="text" name="name">
      </div>
      <div>
        年龄：<input type="text" name="age">
      </div>
      <div>
        性别：<input type="text" name="gender">
      </div>
      <div>
        省份：<input type="text" name="address.province">
      </div>
      <div>
        城市：<input type="text" name="address.city">
      </div>
      <div>
        区域：<input type="text" name="address.town">
      </div>
      <div>
        <input type="submit" value="提交">
      </div>
    </form>
  </body>
</html>
