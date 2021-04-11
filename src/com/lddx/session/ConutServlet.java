package com.lddx.session;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

//使用Session技术，记录浏览器访问的次数
@WebServlet(name = "ConutServlet", value = "/count")
public class ConutServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html;charset=utf-8");

        //获取Session对象

        HttpSession session = request.getSession();

        Integer num = (Integer) session.getAttribute("count");

        if (num == null) {//num为null的情况，浏览器第一次访问服务器
            session.setAttribute("count", 1);
            num = (Integer) session.getAttribute("count");
        } else {//num不为null的情况，浏览器第2-n次访问服务器
            //从session中根据count取值 count=2
            session.setAttribute("count", ++num);
        }
        PrintWriter pw = response.getWriter();
        pw.println("你是第" + num + "次访问");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
