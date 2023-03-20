package com.liu.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @author 韩顺平
 * @version 1.0
 */
@RequestMapping(value = "/user")
@Controller //UserHandler就是一个处理器/控制器,注入到容器
public class UserHandler {

    /**
     * 老韩解读
     * 1. method=RequestMethod.POST: 表示请求buy目标方法必须是 post
     * 2. RequestMethod 四个常用选项 POST, GET, PUT, DELETE[后面我们会详解]
     * 3. SpringMVC 控制器默认支持GET和POST两种方式
     * <p>
     * 4. buy()方法请求的url: http://ip:port/工程路径/user/buy
     * 5. @PostMapping(value = "/buy")等价 @RequestMapping(value = "/buy",method = RequestMethod.POST)
     * @return
     */
    @RequestMapping(value = "/buy")
//    @PostMapping(value = "/buy")
    public String buy() {
        System.out.println("购买商品~");
        return "success";
    }

    /**
     * 老韩解读
     * 1. params="bookId" 表示请求该目标方法时，必须给一个bookId参数, 值没有限定
     * 2. search(String bookId): 表示请求目标方法时, 携带的bookId=100, 就会将请求携带的 bookId对应的
     * 值 100, 赋给 String bookId
     * 3. params = "bookId=100" 表示必须给一个bookId参数, 而且值必须是100
     *
     * @return
     */
    @RequestMapping(value = "/find", params = "bookId=100", method = RequestMethod.GET)
    public String search(String bookId) {
        System.out.println("查询书籍 bookId= " + bookId);
        return "success";
    }

    /**
     * 要求: 可以配置  /user/message/aa, /user/message/aa/bb/cc
     * 1. @RequestMapping(value = "/message/**") /** 可以匹配多层路径
     */

    @RequestMapping(value = "/message/**")
    public String im() {
        System.out.println("发送消息");
        return "success";
    }

    //要求： 我们希望目标方法获取到 username 和 userid, value="/xx/{username}" - @PathVariable("username")..
    //前端页面: <a href="user/reg/kristina/300">占位符的演示</a>
    //(value = "/reg/{username}/{userid}"): 表示kristina->{username} 300=>{userid}
    @RequestMapping(value = "/reg/{username}/{userid}")
    public String register(@PathVariable("username") String name,
                           @PathVariable("userid") String id) {
        System.out.println("接收到参数--" + "username= " + name + "--" + "usreid= " + id);
        return "success";
    }

    @RequestMapping(value = "/hi")
    public String hi() {
        System.out.println("hi");
        return "success";
    }

    //@RequestMapping(value = "/hi")
    //public String hi2() {
    //    System.out.println("hi");
    //    return "success";
    //}

    /**
     * hello3(String email)： 如果我们的请求参数有 email=xx, 就会将传递的值,赋给String email
     * ,要求名称保持一致, 如果不一致，那么接收不到数据, 而是null
     * @param email
     * @return
     */
    @GetMapping(value = "/hello3")
    public String hello3(String email) {
        System.out.println("hello3 " + email);
        return "success";
    }
}
