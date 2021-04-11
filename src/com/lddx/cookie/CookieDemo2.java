package com.lddx.cookie;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URLDecoder;


//当浏览器再次访问服务器的时候，在服务器端获取浏览器发送过来的cookie
@WebServlet(name = "CookieDemo2", value = "/test/cookie2")
public class CookieDemo2 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        Cookie[] sc = request.getCookies();

        for (Cookie cok : sc) {
            System.out.println(cok.getName() +":"+ URLDecoder.decode(cok.getValue(),"utf-8"));
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
