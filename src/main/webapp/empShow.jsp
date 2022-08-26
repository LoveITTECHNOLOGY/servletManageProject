<%@ page import="com.entity.Manager" %>
<%@ page import="com.entity.Emp" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: weijiafu
  Date: 2022/8/25
  Time: 22:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
  <style>
    body
    {
      background-color: lightgoldenrodyellow;
    }
    table
    {
      font-family: sans-serif;
      color: red;
      border: 2px solid green;
      font-width: 20;
    }
  </style>
</head>
<body>
<table border="1" width="100%">
  <% Manager manager=(Manager) request.getSession().getAttribute("login");%>
  <p>亲爱的管理员+"<%=manager.getUsername()%>"+你好!!!!</p>
    <p align="center"><a href="add.jsp">添加用户信息</a> </p>
  <tr>
    <td>编号</td>
    <td>姓名</td>
    <td>工资</td>
    <td>年龄</td>
    <td colspan="2">操作</td>
  </tr>
 <%
    List<Emp> empList=(List<Emp>) request.getSession().getAttribute("emp");%>
  <% for (Emp emp:empList){
    %>
  <tr>
    <td><%=emp.getId()%></td>
    <td><%=emp.getName()%></td>
    <td><%=emp.getSalary()%></td>
    <td><%=emp.getAge()%></td>
    <td><a href="/delete?id=<%=emp.getId()%>">删除</a> </td>
    <td><a href="/update?id=<%=emp.getId()%>">修改</a> </td>
      <td
  </tr>
  <%}%>
</table>

</body>
</html>
