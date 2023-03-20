<%--
  Created by IntelliJ IDEA.
  User: liushuaibiao
  Date: 2023/3/20
  Time: 15:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head> <title>购买商品</title>
</head>
<body> <h1>购买商品</h1> <form action="user/buy" method="?">
    购买人:<input type="text" name="username"><br>
    够买量:<input type="text" name="nums"><br> <input type="submit" value="购买">
</form>

<hr><h1>演示param的使用</h1>
<a href="user/find?bookId=100">查询书籍</a>

<hr><h1>演示Ant风格的请求资源方式</h1>
<a href="user/message/aa">发送消息1</a><br>
<a href="user/message/aa/bb/cc">发送消息2</a><br>

<hr><h1>演示路径变量@PathVariable</h1>
<a href="user/reg/kristina/300">访问占位符演示</a>
</body>
</html>
