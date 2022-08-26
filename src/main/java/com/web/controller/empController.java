package com.web.controller;

import com.entity.Emp;
import com.service.EmpService;
import com.service.impl.EmpServiceImpl;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "empController", value = "/empController")
public class empController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
   doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //设置统一的编码格式
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf8");
        //调用员工业务逻辑
        EmpService empService=new EmpServiceImpl();
        List<Emp> empList = empService.showAllEmpInfo();
        HttpSession session=request.getSession();
        session.setAttribute("emp",empList);
        response.sendRedirect("/empShow.jsp");

    }
}
