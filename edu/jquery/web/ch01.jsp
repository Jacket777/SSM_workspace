<%--
  Created by IntelliJ IDEA.
  User: 17081290
  Date: 2021/5/13
  Time: 8:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <%--从网络下载js--%>
    <%--<script src="https://code.jquery.com/jquery-3.3.1.min.js"></script>--%>
    <%--"scripts/jquery-1.9.1.min.js"--%>
    <%--<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-1.9.1.min.js"></script>--%>

    <script src="scripts/jquery-1.9.1.min.js"></script>
    <title>Furry Friends Campaign</title>
    <link rel="stylesheet" type="text/css" href="/styles/my_style.css">
      <%--<style>--%>
          <%--#clickMe {--%>
              <%--background: #D8B36E;--%>
              <%--padding: 20px;--%>
              <%--text-align: center;--%>
              <%--width: 205px;--%>
              <%--display: block;--%>
              <%--border: 2px solid #000;--%>
          <%--}--%>

          <%--#picframe {--%>
              <%--background: #D8B36E;--%>
              <%--padding: 20px;--%>
              <%--width: 205px;--%>
              <%--display: none;--%>
              <%--border: 2px solid #000;--%>
          <%--}--%>
      <%--</style>--%>
  </head>
  <body>
  <div id="clickMe">Show me the Furry Friend of the Day</div>
  <div id="picframe">
  <img src="images/furry_friend.jpg">
  </div>
  </body>
  <script type="text/javascript">
    $(document).ready(function(){
              $("#clickMe").click(function(){
                  console.log("点击起作用")
                $("img").fadeIn(1000);
                $("#picframe").slideToggle("slow");
              });//end move up
            }
    );
  </script>
</html>
