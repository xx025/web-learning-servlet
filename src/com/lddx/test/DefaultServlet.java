package com.lddx.test;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;


//当无路径访问时，执行此servlet方法
public class DefaultServlet extends HttpServlet {
    //调出service方法

    protected void service(HttpServletRequest req, HttpServletResponse resp) throws IOException {

        //创建系统时间并将时间输出在系统页面上
        Date d = new Date();
        PrintWriter pw = resp.getWriter();
        pw.println(d);
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