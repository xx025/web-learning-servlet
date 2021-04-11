package com.lddx.session;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ResourceBundle;

@WebServlet(name = "SessionDemo2", value = "/SessionDemo2")
public class SessionDemo2 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //设置页面显示中文的编码
        response.setContentType("text/html;charset=utf-8");

        //获取Session对象
        HttpSession session = request.getSession();
        //从Session对象中取数据
        String strName = (String) session.getAttribute("name");
        //将获取的数据输出到页面上
        PrintWriter pw = response.getWriter();
        pw.println("Session中取出的内容是：" + strName);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


    }
}
