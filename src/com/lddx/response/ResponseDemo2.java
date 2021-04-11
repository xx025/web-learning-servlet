package com.lddx.response;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


//重定向技术

@WebServlet(name = "ResponseDemo2", value = "/ResponseDemo2")
public class ResponseDemo2 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        /*
         * 同一web应用中的资源跳转（servlet应用中)
         * ()里写url-pattern地址，写xx.html,写xx.jsp
         * */

        //response.sendRedirect("ResponseDemo1");

        //response.sendRedirect("registe.html");
        //localhost:8080/servlet/ResponseDemo1

        //转发
        //请求转发器
        //RequestDispatcher rd = request.getRequestDispatcher("registe.html");
        //请求转发
        //rd.forward(request, response);

        /*
         * 2.不同ｗｅｂ应用之间的资源跳转
         * */
        //response.sendRedirect("http://www.baidu.com/");

        //转发
        //request.getRequestDispatcher("http://www.baidu.com").forward(request, response);

        //重定向到ems_servlet应用list首页
        //localhost:8080/ems_list/list

        //访问另外一个web应用的url-pattern地址
        response.sendRedirect("/ems_servlet/list");


    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
