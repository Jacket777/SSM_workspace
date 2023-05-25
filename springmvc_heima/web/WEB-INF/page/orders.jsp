<%--
  Created by IntelliJ IDEA.
  User: 17081290
  Date: 2020/12/14
  Time: 15:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>订单查询</title>
</head>
<body>
  <form action="${pageContext.request.contextPath}/findOrdersWithUser" method="post">
      订单编号:<input type="text" name="OrdersId"><br/>
      所属用户:<input type="text" name="user.username"><br/>
      <input type="submit" value="查询">
  </form>
</body>
</html>
