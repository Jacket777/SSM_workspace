<%--
  Created by IntelliJ IDEA.
  User: 17081290
  Date: 2021/1/7
  Time: 8:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>Title</title>
</head>
<%
    pageContext.setAttribute("ctp",request.getContextPath());
%>
<body>
<h1><fmt:message key="welcomeinfo"></fmt:message></h1>
<form action="${ctp}/login" method="post">
    <fmt:message key="username"></fmt:message>:<input type="text" name="username"><br>
    <fmt:message key="password"></fmt:message>:<input type="text" name="password"><br>
    <input type="submit" value="<fmt:message key="btn"/>"/>
</form>
<a href="${ctp}/i18n?locale=zh_CN">中文</a><br>
<a href="${ctp}/i18n?locale=en_US">英文</a>
</body>
</html>