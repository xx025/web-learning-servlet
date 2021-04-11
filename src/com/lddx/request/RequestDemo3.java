package com.lddx.request;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "RequestDemo3", value = "/demo3")
public class RequestDemo3 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("进来啦 demo3..");
        //向页面输出内容
        PrintWriter pw = response.getWriter();
        pw.println("sevelet..demo3..");
        //使用转发技术--从当前的demo3转发到demo4去执行
        //获得请求转发器/调度器
        //()里的内容是要转发的地址(url-pattern/jsp)
        RequestDispatcher rd = request.getRequestDispatcher("demo4");
        //实现请求转发，request 和response 作为转发的参数
//        rd.forward(request, response);
        //实现请求转发--带请求包含的
        rd.include(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
