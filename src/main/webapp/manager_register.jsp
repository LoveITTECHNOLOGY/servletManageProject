<%--
  Created by IntelliJ IDEA.
  User: weijiafu
  Date: 2022/8/26
  Time: 1:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>manager_register</title>
</head>
<body>
<p align="center">管理员注册页面</p>
<form action="/manager_post" method="post">
    管理员用户名:<input type="text" name="username"/></br>
    管理员密码:<input type="text" name="password"/></br>
    <input type="submit" value="管理员注册">
</form>

</body>
</html>
