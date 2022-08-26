package com.web.controller;

import com.entity.Emp;
import com.service.EmpService;
import com.service.impl.EmpServiceImpl;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "update", value = "/update")
public class update extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
   doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
          //查询id
        Integer id=Integer.valueOf(request.getParameter("id"));
        //调用业务逻辑
        EmpService empService=new EmpServiceImpl();
        Emp emp = empService.showId(id);
        //传值id防止id被修改
        HttpSession session=request.getSession();
        session.setAttribute("emp",emp);
        response.sendRedirect("/updateShow.jsp");
    }
}
