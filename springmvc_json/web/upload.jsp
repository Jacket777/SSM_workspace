<%--
  Created by IntelliJ IDEA.
  User: 17081290
  Date: 2021/1/4
  Time: 10:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<script src="scripts/jquery-1.9.1.min.js"></script>
<head>
    <title>Title</title>
</head>
<%
    pageContext.setAttribute("ctp",request.getContextPath());
%>
<body>
<h1>测试上传功能</h1>
<form action="${ctp}/upload" method="post" enctype="multipart/form-data">
    描述:<input type="text" name="desc"><br>
    文件:<input type="file" name="file"><br>
    文件:<input type="file" name="file"><br>
    文件:<input type="file" name="file"><br>
    <input type="submit" value="提交">
</form>

</body>
</html>
