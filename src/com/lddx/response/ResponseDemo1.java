package com.lddx.response;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ResponseDemo1", value = "/ResponseDemo1")
public class ResponseDemo1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //发送到浏览器端采用utf-8编码(传递中文参数的时候)
        response.setContentType("text/html;charset=utf-8");


        //浏览器（页面）显示中文的编码utf-8
        //response.setCharacterEncoding("utf-8");

        //使用setHeader来设置浏览器端显示中文的编码
        response.setHeader("Content-Type", "text/html;charset=utf-8");

        //获得printWirter输出流
        PrintWriter pw = response.getWriter();

        //设置向浏览器发送中文编码问题

        //pw.println("hello");


        //pw.println("你好");


        //使用setHeader设置定时刷新
        pw.println("三秒后进入百度");
        response.setHeader("Refresh", "3;url=http://baidu.com");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
