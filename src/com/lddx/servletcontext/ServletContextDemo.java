package com.lddx.servletcontext;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;

@WebServlet(name = "ServletContextDemo", value = "/ServletContextDemo")
public class ServletContextDemo extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        //获取ServletContext对象
//      ServletContext sct = this.getServletContext();
        ServletContext sct = getServletContext();
        //通过sct获得web.xml文件中的初始化参数
        String s1 = sct.getInitParameter("data1");
        System.out.println(s1);

        System.out.println(sct.getInitParameter("data2"));


        //获取初始化参数中所有的param-name
        Enumeration<String> pss = sct.getInitParameterNames();
        while (pss.hasMoreElements()) {
            System.out.println(pss.nextElement());
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
