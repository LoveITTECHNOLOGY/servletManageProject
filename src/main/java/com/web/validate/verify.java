package com.web.validate;

import cn.dsna.util.images.ValidateCode;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "verify", value = "/verify")
public class verify extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
          doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    //创建验证码
        ValidateCode validateCode=new ValidateCode(70,25,4,10);
        String code = validateCode.getCode();
        System.out.println(code);
        HttpSession session=request.getSession();
        session.setAttribute("verify",code);
        validateCode.write(response.getOutputStream());
    }
}
