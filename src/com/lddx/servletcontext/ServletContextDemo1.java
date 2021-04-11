package com.lddx.servletcontext;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;

/*演示域对象request，域对象ServletContext的使用
 * 往域对象中存值
 * */
@WebServlet(name = "ServletContextDemo1", value = "/context1")
public class ServletContextDemo1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //request域对象
//        request.setAttribute("a", 1);
        //同一次Servlet上下执行一次是一次请求
//        int i = (Integer) request.getAttribute("a");
//        System.out.println(i);

        /*
         * 通过转发技术，可以通过当前Servlet跳转到ServletCOntextDemo2中，
         * 转发一次请求完成的，可以借助于转发实现request域对象的资源共享
         * */
//        request.getRequestDispatcher("context2").forward(request, response);


        //ServletContext域对象

        ServletContext sct = getServletContext();
        sct.setAttribute("b", 2);

        Date time = new Date();
        sct.setAttribute("b", time.getTime());
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
