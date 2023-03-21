package com.liu.web.viewresolver;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author 韩顺平
 * @version 1.0
 */

@RequestMapping("/goods")
@Controller
public class GoodsHandler {

    @RequestMapping(value = "/buy")
    public String buy() {
        System.out.println("------buy()-----");
        return "liuView";//待会再填写自定义视图名
    }

    /**
     * 演示直接指定要请求转发的或者是重定向的页面
     * @return
     */
    @RequestMapping(value = "/order")
    public String order() {
        System.out.println("=======order()=====");
        //请求转发到 /WEB-INF/pages/my_view.jsp
        //下面的 /WEB-INF/pages/my_view.jsp 被解析成 /springmvc/WEB-INF/pages/my_view.jsp
        //return "forward:/WEB-INF/pages/my_view.jsp";
        //return "forward:/aaa/bbb/ok.jsp";

        //直接指定要重定向的页面
        //1. 对于重定向来说，不能重定向到 /WEB-INF/ 目录下
        //2. redirect 关键字，表示进行重定向
        //3. /login.jsp 在服务器解析 /springmvc/login.jsp
        return "redirect:/login.jsp";

        // /WEB-INF/pages/my_view.jsp 被解析 /springmvc/WEB-INF/pages/my_view.jsp
        //return "redirect:/WEB-INF/pages/my_view.jsp";
    }
}