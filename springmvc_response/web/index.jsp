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
    <p>请按照id-name-age-gender的方式输入数据</p>
    <form action = "${ctp}/converter" method="post">
      <p><input type="text" name="user"></p>
      <p><input type="submit" value="提交"></p>
    </form>
  </div>

  <%--<div>--%>
    <%--<p>请按照id-name-age-password的方式输入数据</p>--%>
    <%--<form action = "${ctp}/converter" method="post">--%>
       <%--<p><input type="text" name="user"></p>--%>
       <%--<p><input type="submit" value="提交"></p>--%>
    <%--</form>--%>
  <%--</div>--%>





  <%--<div>测试静态图片页面</div>--%>
  <%--<div>--%>
    <%--<img src="${ctp}/image/timg.jpg">--%>
  <%--</div>--%>
  </body>
</html>
