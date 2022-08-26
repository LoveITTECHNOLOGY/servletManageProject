package com.web.filter;

import com.entity.Manager;

import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebFilter(value = "/empController")
public class checkFilter implements Filter {
    public void init(FilterConfig config) throws ServletException {
    }

    public void destroy() {
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws ServletException, IOException {
        HttpServletRequest httpServletRequest=(HttpServletRequest) request;
        HttpServletResponse httpServletResponse=(HttpServletResponse) response;
        Manager manager =(Manager) ((HttpServletRequest) request).getSession().getAttribute("login");
        if(manager!=null){
            chain.doFilter(httpServletRequest,httpServletResponse); //保持登录状态
        }else{
            ((HttpServletResponse) response).sendRedirect("/manager.html");
        }

    }
}
