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
<form name="form1" action="">
    <input type="button" value="返回值" onclick="return a('1111这是弹出的子窗口,返回给父窗口的字符串。。。')">
</form>
<script type="text/javascript">
    function a(wname)
    {
        parent.window.returnValue=wname;  //父窗口就是上一个页面
        window.close();
    }
</script>
</body>
</html>
