package com.lddx.request;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

//通过request对象获取浏览器端的相关信息
public class RequestDemo1 extends HttpServlet {

    //    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //System.out.printf("Hello");
        PrintWriter pw=resp.getWriter();
        //1. 返回浏览器端发送请求的完整路径
        StringBuffer buf = req.getRequestURL();
        System.out.println(buf);
        pw.println(buf);
        //2. 获取请求路径中8080后的地址(资源名部分)
        String uri=req.getRequestURI();
        System.out.println("urI"+uri);
        pw.println("urI"+uri);
        //3. 获取请求路径中的参数部分
        String qs= req.getQueryString();
        System.out.println("qs:"+qs);
        pw.println("qs:"+qs);
        //4. 获得请求路径中的ip地址
        String ip=req.getRemoteAddr();
        pw.println(ip);
        System.out.println(ip);

        //5. 获取浏览器端发送请求的方式
        String ops=req.getMethod();
        pw.println(ops);
        System.out.println(ops);

        //超链接，浏览器地址栏，表单的默认方式都是get请求
        //表单设置method="post"是post请求

        //6. 获取web应用名
        String cp=req.getContextPath();
        System.out.println(cp);
        pw.println(cp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}

