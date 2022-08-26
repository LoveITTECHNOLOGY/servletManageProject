package com.web.controller;

import com.entity.Emp;
import com.service.EmpService;
import com.service.impl.EmpServiceImpl;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "addPost", value = "/addPost")
public class addPost extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
             //设置统一的编码格式
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");
        //接收参数
        Integer id=Integer.valueOf(request.getParameter("id"));
        String name=String.valueOf(request.getParameter("name"));
        Double salary=Double.valueOf(request.getParameter("salary"));
        Integer age=Integer.valueOf(request.getParameter("age"));
        //插入到对象中
        Emp emp=new Emp(id,name,salary,age);
        //调用业务逻辑
        EmpService empServic=new EmpServiceImpl();
        empServic.showInsertEmp(emp);
        response.sendRedirect("/register_success.jsp");
    }
}
