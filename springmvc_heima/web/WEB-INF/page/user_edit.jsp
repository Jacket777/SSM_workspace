<%--
  Created by IntelliJ IDEA.
  User: 17081290
  Date: 2020/12/16
  Time: 10:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>修改用户</title>
    <script src="https://libs.baidu.com/jquery/2.1.4/jquery.min.js"></script>

</head>
<body>
 <form action="${pageContext.request.contextPath}/editUsers" method="post" id="formid">
     <table width="30%" border=1>
         <tr>
             <td>选择</td>
             <td>用户名</td>
         </tr>
         <tr>
             <td>
                 <input name="users[0].id" value="1" type="checkbox">
             </td>
             <td>
                 <input name="users[0].username" value="tom" type="text">
             </td>
         </tr>
         <tr>
             <td>
                 <input name="users[1].id" value="2" type="checkbox">
             </td>
             <td>
                 <input name="users[1].username" value="jack" type="text">
             </td>
         </tr>
     </table>
     <input type="submit" value="修改">

 </form>

</body>
</html>
