<%--
  Created by IntelliJ IDEA.
  User: 17081290
  Date: 2021/5/15
  Time: 10:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.net.URLEncoder" %>
<html>
  <head>
    <title>下载页面</title>
  </head>
  <body>
  <a href="/download.jsp?filename=<%=URLEncoder.encode("壁纸.jpg","UTF-8")%>">
    中文名称文件下载
  </a>
  </body>
</html>
