<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/5/22
  Time: 20:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.form.js"></script>
</head>
<body>
<form name="form1" id="form1" action="${pageContext.request.contextPath}/saveForm" method="post">
    <p>name:<input type="text" name="name" ></p>
    <p>file1:<input type="file" name="file" ></p>
    <p>file2:<input type="file" name="file" ></p>
    <p><input type="submit" name="b1" value="submit"></p>
</form>
<script>
    var options = {
        beforeSubmit: function(){
            alert("调用前加遮罩");
        },
        success:function(data) {
           var data=$.parseJSON(data);
           if(data.code==0){
               alert(data.msg);
           }
        },
        error:function(){
            alert("保存失败")
        }
    };
    $(function(){
        $('#form1').ajaxForm(options);
    });

</script>
</body>
</html>
