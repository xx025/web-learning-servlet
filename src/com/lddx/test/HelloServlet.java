package com.lddx.test;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

//服务器端的一个servlet类，需要继承httpServlet才可以
public class HelloServlet extends HttpServlet {

    //调出service方法

    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        super.service(request, response);
        //向控制台输出
        System.out.println("Hello");
        //向页面返回内容
        //通过response获得输出流，向浏览器端输出内容
        PrintWriter pw = response.getWriter();
        pw.println("<div style='color:red;font-size:50px'>servlet</div> ");
    }
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) {
        //重写的代码
    }


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) {
        //重写的代码
    }


}

