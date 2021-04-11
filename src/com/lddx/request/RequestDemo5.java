package com.lddx.request;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

//使用request作为域对象存储数据
@WebServlet(name = "RequestDemo5", value = "/demo5")
public class RequestDemo5 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("servlet ...demo5...");

        request.setAttribute("message","今天是周二");

        //使用转发技术由demo5转发到demo6,就是一次请求下来的，可以在一次请求中，也就是demo5和demo6中可以实现资源的共享

        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
