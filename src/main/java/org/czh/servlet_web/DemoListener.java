package org.czh.servlet_web;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * @author : czh
 * description :
 * date : 2021/10/14
 * email : 916419307@qq.com
 */
public class DemoListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent event) {
        System.out.println("ServletContext 正在初始化。。。");
        System.out.println("ServletContextEvent事件 = " + event);
        System.out.println("ServletContextEvent[servletDemoDate] = " + event.getServletContext().getInitParameter("servletDemoDate"));
        System.out.println();
    }

    @Override
    public void contextDestroyed(ServletContextEvent event) {
        System.out.println("ServletContext将要销毁。。。");
        System.out.println("ServletContextEvent事件 = " + event);
        System.out.println();
    }
}
