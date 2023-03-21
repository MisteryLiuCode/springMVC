package com.liu.web.viewresolver;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.view.AbstractView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

/**
 * @author 韩顺平
 * @version 1.0
 */

/**
 * 老师解读
 * 1. MyView继承了AbstractView, 就可以作为一个视图使用
 * 2. @Component(value = "myView"),该视图会注入到容器中, 名字/id是 myView
 */
//@Component(value = "liuViewX") 这里暂时改为liuViewX,自定义视图找不到,会去找默认视图解析器
@Component(value = "liuView")
public class MyView extends AbstractView {
//    完成视图渲染
    @Override
    protected void renderMergedOutputModel(Map<String, Object> model,
                                           HttpServletRequest request,
                                           HttpServletResponse response) throws Exception {
        //完成视图渲染
        //并且可以确定我们要跳转的页面 [请求转发] /WEB-INF/pages/my_view.jsp
        System.out.println("进入到自己的视图..");

        //老师解读
        //1. 下面就是进行请求转发到 /WEB-INF/pages/my_view.jsp
        //2. /WEB-INF/pages/my_view.jsp 会被springmvc解析
        //   /springmvc/WEB-INF/pages/my_view.jsp
        request.getRequestDispatcher("/WEB-INF/pages/my_view.jsp")
                .forward(request, response);

    }
}
