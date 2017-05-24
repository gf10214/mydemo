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
    <meta charset="utf-8">
    <meta name="renderer" content="webkit|ie-comp|ie-stand">
    <meta http-equiv="X-UA-Compatible" content="IE=8">
    <meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1.0,maximum-scale=1.0,user-scalable=no" />
    <meta http-equiv="Cache-Control" content="no-siteapp" />
    <!--[if lt IE 9]>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/html5.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/respond.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/PIE-2.0beta1/PIE_IE678.js"></script>
    <![endif]-->
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/json2.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-1.8.3.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.form.js"></script>

</head>
<body>
<form name="form1" id="form1" action="${pageContext.request.contextPath}/saveForm" enctype="multipart/form-data" method="post">
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
        success:function(responseText,statusText,xhr,form) {
//            alert(responseText);
//            alert(statusText);
//            alert(xhr);
//            alert(form);
            try{
                var data=$.parseJSON(responseText);
            }catch (e){
                alert("文件过长");
            }
            //var data=$.parseJSON(data);
//           if(data.code==0){
//               alert(data.msg);
//           }else{
//               alert(data.msg);
//           }
        },
        error:function(){
            alert("失败");
        }
    };
    $(function(){
        try{
            $('#form1').ajaxForm(options);
        } catch (e) {
            alert("文件过长");
        }
    });

</script>
</body>
</html>
