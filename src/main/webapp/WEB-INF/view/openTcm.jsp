<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/1/3 0003
  Time: 下午 5:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <script type="text/javascript" src="../../js/jquery.min.js"></script>
    <title>Title</title>
</head>
<body>
<input type="button"  value="保存" onclick="save()">
<script>
    function save(){
//       window.opener.test("aaaa");
//       window.close();
        window.name="返回的值";
        window.location.href="http://localhost:8080/demo/tcm/list";
    }
</script>
</body>
</html>
