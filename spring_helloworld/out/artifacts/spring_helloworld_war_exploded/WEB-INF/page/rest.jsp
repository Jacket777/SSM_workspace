<%--
  Created by IntelliJ IDEA.
  User: 17081290
  Date: 2020/12/14
  Time: 14:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>测试REST</title>
</head>
<body>
<p>测试REST</p>
<p>
<form action="/user" method="post">
    <input type="submit" value="增加">
</form>
</p>

<p>
 <form action="/user/1" method="post">
    <input name="_method" value="delete" type="hidden">
    <input type="submit" value="删除">
 </form>
</p>

<p>
<form action="/user/1" method="post">
    <input name="_method" value="put" type="hidden">
    <input type="submit" value="修改">
</form>
</p>

<a href="/user/1">查询</a>

</body>
</html>
