<%--
  Created by IntelliJ IDEA.
  User: weijiafu
  Date: 2022/8/26
  Time: 0:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>add</title>
</head>
<body>
<form action="/addPost" method="post">
    编号:<input type="text" name="id"/></br>
    用户名:<input type="text" name="name"/></br>
    工资:<input type="text" name="salary"/></br>
    年龄:<input type="text" name="age"/></br>
    <input type="submit" value="注册"></br>
</form>

</body>
</html>
