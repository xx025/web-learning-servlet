package com.lddx.servletconfig;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;

//演示servletConfig对象的使用
@WebServlet(name = "ServletConfigDemo1", value = "/config1")
public class ServletConfigDemo1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        //获取ServletConfig对象
        //this表示当前类，表示ServletConfigDemo1类
        //ServletConfig scf = this.getServletConfig();

        ServletConfig scf = getServletConfig();


        //获取在<sevlet>中<init-param>中配置的内容
        //根据name获得value的值

        System.out.println(scf.getInitParameter("url"));

        System.out.println(scf.getInitParameter("username"));


        //获取在<Serblet> 中配置的所有<param-name>值
        //将所有获取到的name值放入Enumeration容器中存储，时以字符串的方式存储的
        Enumeration<String> emt = scf.getInitParameterNames();

        //emt.hasMoreElements();//判断容器中是否有数据
        //emt.nextElement();从容器中取数据
        while (emt.hasMoreElements()) {
            System.out.println(emt.nextElement());
        }


    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
