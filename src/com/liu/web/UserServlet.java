package com.liu.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author 韩顺平
 * @version 1.0
 * 老师说明
 * 1. 如果我们使用了SpringMVC, 在一个类上标识@Controller
 * 2. 表示将该类视为一个控制器，注入到容器
 * 3. 比原生servlet开发要简化很多
 */
@Controller
public class UserServlet {


    //编写方法，响应用户的请求

    /**
     * 老师解读
     * 1. login() 方法是用于响应用户的登录请求
     * 2. @RequestMapping(value = "/login") 类似我们以前在原生的Servlet
     *   配置 url-pattern, 就是给方法配置一个url映射
     * 3. 即当用户在浏览器输入 http://localhost:8080/web工程路径/login 就能够访问到login()
     * 4. return "login_ok"; 表示返回结果给视图解析器(InternalResourceViewResolver)
     *   , 视图解析器会根据配置，来决定跳转到哪个页面
     *
     *     <bean class="org.springframework.web.servlet.view.InternalResourceViewResolver">
     *
     *         <property name="prefix" value="/WEB-INF/pages/"/>
     *         <property name="suffix" value=".jsp"/>
     *     </bean>
     *
     *     根据上面的配置 return "login_ok"; 就是转发到 /WEB-INF/pages/login_ok.jsp
     */
    @RequestMapping(value = "/login")
    public String login() {

        System.out.println("login ok.......");
        return "login_ok";
    }
}
