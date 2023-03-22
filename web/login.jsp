<%--
  Created by IntelliJ IDEA.
  User: 韩顺平
  Version: 1.0
  Filename: login
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录</title>
</head>
<body>
<h3>登录页面</h3>
<%--后面我们再填写action
这里需要小伙伴们回顾一下javaweb web工程路径专题
1. action="login" 表示的url 是 http://localhost:8080/springmvc/login
2. action="/login" 表示的url 是 http://localhost:8080/login
--%>

<form action="login">
    u:<input name="username" type="text"> <br/>
    p:<input name="password" type="password"><br/>
    <input type="submit" value="登录">
</form>
</body>
</html>