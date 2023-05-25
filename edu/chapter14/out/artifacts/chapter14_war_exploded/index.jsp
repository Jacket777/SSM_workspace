<%--
  Created by IntelliJ IDEA.
  User: 17081290
  Date: 2021/5/11
  Time: 15:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>测试JSON交互</title>
    <script type="text/javascript" src="js/jquery-1.9.1.min.js">
    </script>
  </head>
 <form>
  用户名:<input type="text" name="username" id="username"><br/>
  密&nbsp;&nbsp;&nbsp;码:
  <input type="password" name="password" id="password"><br/>
  <input type="button" value="测试JSON交互" onclick="testJson()"/>
  </form>
  <script type="text/javascript">
    function testJson(){

      //获取输入的用户名和密码
      var username = $("#username").val();
        console.log("username = "+username)
      var password = $("#password").val();
      $.ajax({
                url : "${pageContext.request.contextPath}/testJson",
                type : "POST",
                //data表示发送的数据
                data:JSON.stringify({username:username,password:password}),
                //定义发送请求的数据格式为JSON
                contentType: "application/json",
                //定义回调响应的数据格式为JSON字符串，该属性可以不写
                //dataType : 'json',
                //成功响应的结果
                success:function(data){
                  if(data !=null){
                    alert("你输入的用户名为: "+data.username+" 密码为: "+data.password);
                  }
                }
              }
      );

    }
  </script>
  </body>
</html>
