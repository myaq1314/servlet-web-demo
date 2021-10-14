package org.czh.servlet_web;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

/**
 * @author : czh
 * description :
 * date : 2021/10/14
 * email : 916419307@qq.com
 */
@SuppressWarnings("RedundantThrows")
public class Demo2Servlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletOutputStream out = resp.getOutputStream();
        out.write("hello get demo2".getBytes(StandardCharsets.UTF_8));
    }

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        System.out.println("Demo2Servlet 正在初始化。。。");
        System.out.println("Demo2Servlet init参数[initParam] = " + config.getInitParameter("initParam"));
        System.out.println("Demo2Servlet config上下文 = " + config.getServletContext().toString());
        System.out.println();
    }
}
