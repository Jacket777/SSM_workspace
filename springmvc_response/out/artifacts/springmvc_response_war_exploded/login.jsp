<%--
  Created by IntelliJ IDEA.
  User: 17081290
  Date: 2020/12/25
  Time: 21:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
  <head>
    <title>首页</title>
  </head>
  <%
    pageContext.setAttribute("ctp",request.getContextPath());
  %>
  <body>
  <%--<div>--%>
    <%--<p>第一种方式</p>--%>

    <%--<form action = "${ctp}/validation" method="post">--%>
       <%--<p>编码：<input type="text" name="id">${errors.id}</p>--%>
       <%--<p>姓名: <input type="text" name="name">${errors.name}</p>--%>
       <%--<p>年龄: <input type="text" name="age">${errors.age}</p>--%>
       <%--<p>性别：<input type="text" name="gender">${errors.gender}</p>--%>
       <%--<p>生日: <input type="text" name="birth">${errors.birth}</p>--%>
       <%--<p>邮箱: <input type="text" name="email">${errors.email}</p>--%>
       <%--<p><input type="submit" value="login"></p>--%>
    <%--</form>--%>
  <%--</div>--%>
  -->

  <div>
    <p>第二种方式</p>

    <form:form action="dataValidate"   method="post">
      编号:<form:input path="id"></form:input><form:errors path="id"></form:errors>--->${errorInfo.id} <br/>
      姓名:<form:input path="name"></form:input><form:errors path="name"></form:errors>--->${errorInfo.name}<br/>
      年龄:<form:input path="age"></form:input><form:errors path="age"></form:errors>--->${errorInfo.age}<br/>
      性别:<form:input path="gender"></form:input><form:errors path="gender"></form:errors>--->${errorInfo.gender}<br/>
      生日:<form:input path="birth"></form:input><form:errors path="birth"></form:errors>--->${errorInfobirth}<br/>
      邮箱:<form:input path="email"></form:input><form:errors path="email"></form:errors>--->${errorInfo.email}<br/>
      <input type="submit" value="submit">
    </form:form>


</div>
  </body>
</html>
