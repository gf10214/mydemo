<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/1/4 0004
  Time: 上午 10:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>无标题页</title>
</head>
<body>
<form name="form1" action="#">
    <input type="text" name="p1t">
    <input type="button" value="打开对话框" onclick="opendialog1()">
</form>
<script type="text/javascript">
    window.name='我是a页面';
    function opendialog1(){
        var someValue=window.showModalDialog("http://localhost:8080/demo/openTcm","","dialogWidth=500px;dialogHeight=500px;status=no;help=no;scrollbars=no");
        document.form1.p1t.value=someValue;
    }
</script>
</body>
</html>