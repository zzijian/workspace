package com.zzj.servlet;

import com.zzj.pojo.User;
import com.zzj.service.DoLoginService;
import com.zzj.service.impl.DoLoginServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class DoLoginServlet extends HttpServlet {
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=utf-8");

        String uname = req.getParameter("uname");
        String pwd = req.getParameter("pwd");

        System.out.println(uname+":"+pwd);

        DoLoginService doLoginService = new DoLoginServiceImpl();
        User user = doLoginService.checkLoginService(uname,pwd);

        if(user!=null){
            resp.getWriter().write("登陆成功");
        }else {
            //请求转发
            req.getRequestDispatcher("page").forward(req,resp);
            return;
        }

    }

}
