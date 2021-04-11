package com.lddx.servletcontext;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;

@WebServlet(name = "ServletContextDemo2", value = "/context2")
public class ServletContextDemo2 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //request域对象
        //必须是由ServletContextDemo1转发过来
//        int i = (Integer) request.getAttribute("a");
//        System.out.println(i);

        //ServletContext域对象——取
        ServletContext sct = getServletContext();
        Integer msg1 = (Integer) sct.getAttribute("b");
        System.out.println(msg1);


        Date date = (Date) sct.getAttribute("time");
        System.out.println("获取的时间是:" + date);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
