package com.lddx.request;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;


//处理中文编码问题
@WebServlet("/RequestDemo2")
public class RequestDemo2 extends HttpServlet {


    //此方法直接收get请求
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.doGet(req, resp);
        System.out.println("get...");
        String strName = req.getParameter("username");
        System.out.println(strName);

        //将字符串以iso8859-1解码，获得字节
        byte[] bs = strName.getBytes("iso8859-1");
        System.out.println(Arrays.toString(bs));

        //将字节重新以utf-8进行编码
        //参数1：将那些字节生成新的字符串
        //参数2：采用什么编码重新生成字符串
        String ss = new String(bs, "utf-8");
        System.out.println(ss);

    }

    //此方法只接受post请求
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.doPost(req, resp);
        System.out.println("post...");

        //通过request对象设置接收参数中文编码
        req.setCharacterEncoding("utf-8");
        //接收refiste.html页面传递的数据
        //username=xx
        String strName = req.getParameter("username");
        System.out.println(strName);
    }
}
