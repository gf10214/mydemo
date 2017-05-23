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
</head>
<body>
<form name="form1" id="form1" action="${pageContext.request.contextPath}/saveForm" enctype="multipart/form-data" method="post">
    <p>name:<input type="text" name="name" ></p>
    <p>file1:<input type="file" name="file" ></p>
    <p>file2:<input type="file" name="file" ></p>
    <p><input type="submit" name="b1" value="submit"></p>
</form>
<iframe name="uploadIframe" id="uploadIframe" style="display:none"></iframe>
</body>
</html>
