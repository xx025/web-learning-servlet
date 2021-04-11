package com.lddx.session;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

//Session的使用：chuangjian,存值
@WebServlet(name = "SessionDemo1", value = "/SessionDemo1")
public class SessionDemo1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //创建、获取Session对象
        HttpSession session = request.getSession();
        //使用Session存储值
        session.setAttribute("name", "张三");
        //强调Session的默认时间为30分钟
        session.setMaxInactiveInterval(30);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
