package com.web.controller;

import com.entity.Manager;
import com.service.ManagerService;
import com.service.impl.ManagerServiceImpl;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "manager_post", value = "/manager_post")
public class manager_post extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
  doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //设置统一的编码格式
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        String username=String.valueOf(request.getParameter("username"));
        String password=String.valueOf(request.getParameter("password"));
        //创建插入对象
        Manager manager=new Manager(username,password);
        //调用业务逻辑
        ManagerService managerService=new ManagerServiceImpl();
        managerService.managerRegister_show(manager);
        response.sendRedirect("/manager_success_post.jsp");
    }
}
