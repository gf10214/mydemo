<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/1/5 0005
  Time: 上午 10:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/messenger.js"></script>
<html>
<head>
    <title>父页面</title>
</head>
<body>
<iframe id="childFrame" src="http://10.10.12.228:8181/demo/children" ></iframe>
<input type="button" value="发送消息" onclick="sendMsg()">
<input type="text" id="parentT" >
<script>
    var messenger=new Messenger('parent','tcm');
    var childFrame=document.getElementById('childFrame');
    messenger.addTarget(childFrame.contentWindow, 'iframe1');
    messenger.listen(function(msg){
        //alert("收到消息："+msg);
        document.getElementById('parentT').value=msg;
    });
    function sendMsg(){
        messenger.send('这是来自父窗口的消息！');
    }
</script>
</body>
</html>
