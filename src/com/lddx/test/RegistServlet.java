package com.lddx.test;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Enumeration;

//服务器端的一个Servlet类，处理浏览器端注册页面发送来的请求
public class RegistServlet extends HttpServlet {

    //调出service方法

    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.service(req, resp);
        System.out.println("进来啦。。。。。。。");
        PrintWriter pw = resp.getWriter();
        String qs = req.getQueryString();
        System.out.println("qs:" + qs);
        pw.println("qs:" + qs);
//        qs:username=&pwd=&nickname=&btn=%E6%8F%90%E4%BA%A4
        String ip = req.getRemoteAddr();
        pw.println(ip);
        System.out.println(ip);
        //5. 获取浏览器端发送请求的方式
        String ops = req.getMethod();
        pw.println(ops);
        System.out.println(ops);


//        //使用getParameter
        String strName = req.getParameter("username");
        String strPwd = req.getParameter("pwd");
        String strNick = req.getParameter("nickname");
        System.out.println("strName:" + strName);
        System.out.println("strPwd:" + strPwd);
        System.out.println("strNick:" + strNick);

//       使用request.getParameterValues()方法
        //name --> 多个values
        String[] vsl = req.getParameterValues("love");
        System.out.println(vsl);
        System.out.println(Arrays.toString(vsl));

        //request.getParameterNames()-->Enumertion[]
        //获取参数中所有name值，并放入Enumeration[]中存储
        Enumeration<String> emr = req.getParameterNames();
        System.out.println(emr);

//        emr.hasMoreElements() --> boolean 判断是否有数据
//        emr.nextElement() --> 从容器中取数据
//        使用while() 循环依次从容器Enumeration取数据
        while (emr.hasMoreElements()) {
            String value = emr.nextElement();
            System.out.println(value);
        }

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) {
        //重写的代码
    }


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) {
        //重写的代码
    }

}
