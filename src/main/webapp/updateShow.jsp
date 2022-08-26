<%@ page import="com.entity.Emp" %><%--
  Created by IntelliJ IDEA.
  User: weijiafu
  Date: 2022/8/25
  Time: 23:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%request.setCharacterEncoding("UTF-8");
response.setContentType("text/html;charset=UTF-8");%>
<html>
<head>
    <meta charset="UTF-8">
    <title>updateShow</title>
</head>
<body>
<%
        Emp emp =(Emp) request.getSession().getAttribute("emp");%>
        <p align="center">员工修改信息修改页面</p>
<form action="/updatePost" method="post">
    编号:<input type="text" name="id" readonly value="<%=emp.getId()%>"/></br>
    用户名:<input type="text"  name="name" value="<%=emp.getName()%>"/></br>
    工资:<input type="text"  name="salary" value="<%=emp.getSalary()%>"/></br>
    年龄:<input type="text"  name="age" value="<%=emp.getAge()%>"/></br>
    <input type="submit" value="修改"/></br>
</form>

</body>
</html>
