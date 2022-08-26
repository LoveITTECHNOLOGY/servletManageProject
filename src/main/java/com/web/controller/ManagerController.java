package com.web.controller;

import com.entity.Manager;
import com.service.ManagerService;
import com.service.impl.ManagerServiceImpl;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "ManagerController", value = "/ManagerController")
public class ManagerController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
             doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       //设置统一的编码格式
        response.setContentType("text/html;charset=utf8");
        request.setCharacterEncoding("utf-8");
        //收参
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String verify = request.getParameter("verify");
        String  code = (String) request.getSession().getAttribute("verify");
        //如果用户输入的用户名不为空且密码不区分大小写则开始判断用户名和密码是否正确
        if(!verify.isEmpty()&&verify.equalsIgnoreCase(code)) {
            //调用业务逻辑
            ManagerService managerService = new ManagerServiceImpl();
            Manager login = managerService.login(username, password);
            //如果登录不为空证明用户名和密码正确
            if (login != null) {
                HttpSession session = request.getSession();
                session.setAttribute("login", login);
                response.sendRedirect("/empController");
            } else {
                response.sendRedirect("/manager.html");
            }
        }else{
            response.sendRedirect("/manager.html");
        }
    }
}
