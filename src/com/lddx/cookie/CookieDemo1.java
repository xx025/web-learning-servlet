package com.lddx.cookie;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URLEncoder;

@WebServlet(name = "CookieDemo1", value = "/test/cookie1")
public class CookieDemo1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

//        System.out.println("servlet... cookiedemo1");
        //创建Cookie a=1
        Cookie cookie = new Cookie("a", "1");
        Cookie cookie1 = new Cookie("a2", "2");
        Cookie cookie2 = new Cookie("a3", URLEncoder.encode("土豆丝", "utf-8"));


        //设置cookie的存活时间 单位秒
        cookie1.setMaxAge(300);

        //设置Cookie的路径
        //servlet这个web应用下的都可以共享使用Cookie
        cookie2.setPath("/servlet");


        response.addCookie(cookie);
        response.addCookie(cookie1);
        response.addCookie(cookie2);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
