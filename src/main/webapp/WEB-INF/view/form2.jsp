<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/5/23
  Time: 23:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-1.8.3.js"></script>
</head>
<body>

    <p><input type="button" name="b1" value="submit" onclick="aaaa()"></p>
</body>
<script>
    function aaaa(){
        $.ajax({
            url:"${pageContext.request.contextPath}/aaaaaa",
            type: "post",
            async: false,
            dataType: "json",
            success:function(data){
               alert("成功")
            }
//            error:function(){
//                alert("失败");
//            }
        });
    }
</script>
</html>
