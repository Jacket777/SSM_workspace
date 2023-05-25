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
    <title>RESTFUL 测试</title>
    <script type="text/javascript" src="js/jquery-1.9.1.min.js">
    </script>
  </head>
  <body>
  <form>
      编号:<input type="text" name="number" id="number">
      <input type="button" value="搜索" onclick="search()">
  </form>



  <script type="text/javascript">
    function search(){

      //获取输入的查询编号
      var id = $("#number").val();
      $.ajax({
                url : "${pageContext.request.contextPath}/user/"+id,
                type : "GET",
                //定义回调响应的数据格式为JSON字符串，该属性可以不写
                dataType : 'json',
               //data表示发送的数据
               //data:JSON.stringify({username:username}),

                //成功响应的结果
                success:function(data){
                  if(data.username !=null){

                    alert("你查询的用户名为: "+data.username);
                  }else{
                     alert("没有找到id为："+id+"的用户")
                  }
                }
              }
      );
    }
  </script>
  </body>
</html>
