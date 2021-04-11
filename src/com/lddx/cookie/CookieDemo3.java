package com.lddx.cookie;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

//删除Cookie
@WebServlet(name = "CookieDemo3", value = "/cookie3")
public class CookieDemo3 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //同名，同Path,设置存活时间为0 --> 删除Cookie

        //创建Cookie
        /*
         * 创建Cookie,名字要和删除的Cookie名字一致
         * */
        Cookie cookie = new Cookie("a3", "");

        /*
         * 设置Cookie的path路径，要和删除的Cookie的path一致
         * */
        cookie.setPath("/servlet");

        //设置Cookie的存活时间为0
        cookie.setMaxAge(0);

        /*
         * 添加Cookie
         * */

        response.addCookie(cookie);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
