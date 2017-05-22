<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/1/5 0005
  Time: 上午 10:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<script type="text/javascript" src="./webapp/js/jquery.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/messenger.js"></script>
<html>
<head>
    <title>子页面</title>
</head>
<body>
<input type="button" value="从后台获取分数" onclick="getScore()">
<input type="text" id="childrenT" readonly="readonly">
<input type="button" value="保存分数" onclick="sendMsg()">
<script>
    var messenger = new Messenger('iframe1', 'tcm');
    messenger.addTarget(window.parent, 'parent');
    messenger.listen(function(msg){
       // alert("收到消息："+msg);
        document.getElementById('childrenT').value=msg;
    });
    function sendMsg(){
        var socre=document.getElementById('childrenT').value;
        messenger.send(socre);
    }

    function getScore(){
        $.ajax({
            url:"${pageContext.request.contextPath}/score",
            type: "post",
            async: false,
            dataType: "json",
            success:function(data){
                document.getElementById('childrenT').value=data;
            }
        });

    }
</script>
</body>
</html>
