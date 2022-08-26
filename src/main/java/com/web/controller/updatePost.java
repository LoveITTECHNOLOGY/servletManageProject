package com.web.controller;

import com.entity.Emp;
import com.service.EmpService;
import com.service.impl.EmpServiceImpl;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "updatePost", value = "/updatePost")
public class updatePost extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
      //设置统一的编码格式
        //收参
        Integer id=Integer.valueOf(request.getParameter("id"));
        String name=String.valueOf(request.getParameter("name"));
        Double salary=Double.valueOf(request.getParameter("salary"));
        Integer age=Integer.valueOf(request.getParameter("age"));


        //创建emp对象
        Emp emp=new Emp(id,name,salary,age);
        System.out.println(emp);
        //调用业务逻辑
        EmpService empService=new EmpServiceImpl();
        int updateEmp = empService.showUpdateEmp(emp);
        System.out.println(updateEmp);

        //修改完之后返回员工显示页面
        response.sendRedirect("/empController");
    }
}
