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
    <script src="https://code.jquery.com/jquery-3.3.1.min.js"></script>
    <%--"scripts/jquery-1.9.1.min.js"--%>
    <%--<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-1.9.1.min.js"></script>--%>

    <%--<script src="${pageContext.request.contextPath}/scripts/jquery-1.9.1.min.js"></script>--%>
    <title>jquery goes to DOM-ville</title>
    <style>
      #change_me {
        position:absolute;
        top:100px;
        left:400px;
        font:24px arial;}

      #move_up #move_down #color #disappear {
        padding: 5px;
      }
    </style>


  </head>
  <body>
  <button id="move_up">Move Up</button>
  <button id="move_down">Move Down</button>
  <button id="color">Change Color</button>
  <button id="disappear">Disappear/Re-appear</button>
  <div id="change_me">Make me Do Stuff!</div>

  </body>
  <script type="text/javascript">
    $(document).ready(function(){
              $("#move_up").click(function(){
                $("#change_me").animate({top:30},200);
              });//end move up

              $("#move_down").click(function(){
                $("#change_me").animate({top:500},2000);
              });//end move down

              $("#color").click(function(){
                $("#change_me").css("color","purple");
              });//end color


              $("#disappear").click(function(){
                $("#change_me").toggle("slow");
              });//end color

            }
    );
  </script>
</html>
