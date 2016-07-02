package com.fan.core.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Date;

/**
 * Created by fqc on 2016/6/30.
 */
@Controller
@RequestMapping("/admin")
public class CenterController {
    /**
     * 默认跳转页面（目前用于 开发中方便测试）
     * @param name
     * @param birthday
     * @return
     */
    @RequestMapping(value = "/test.do")///test/test.do但是请注意跳转后的页面的上下文路径是相对于/admin/test/*...路径的，因此这里的test就去掉吧
    public String test(String name, Date birthday) {
        System.out.println(name);
        System.out.println(birthday);
        System.out.println("进入admin中，只是路径匹配，与包结构无关");
        return "index";// back_page/index 对应 "/WEB-INF/back_page/back_page/index.jsp"
    }

    //跳转入口页面
    @RequestMapping("/index.do")
    public String index() {
        System.out.println("index.do");
        return "index";
    }

    //跳转头页面
    @RequestMapping("/top.do")
    public String top() {
        return "top";
    }

    //跳转主体页面
    @RequestMapping("/main.do")
    public String main() {
        return "main";
    }


    /*@InitBinder  //局部配置类型转换器，但是全局更加一劳永逸
    public void initBinder(WebDataBinder binder, WebRequest request) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yy-MM-dd HH:mm:ss"); //注意springmvc的数据绑定 参数不匹配的话 无法正确请求 例如:2016-01-01 13:14
        binder.registerCustomEditor(Date.class, new CustomDateEditor(simpleDateFormat, true));
    }*/
}
/*
@Controller
public class CenterController implements WebBindingInitializer{
    @RequestMapping(value = "/test/index.do", method = RequestMethod.POST)
    public String test(String name, Date birthday) {
        System.out.println(name);
        System.out.println(birthday);
        return "index";
    }

    public void initBinder(WebDataBinder binder, WebRequest request) {

    }
}
*/
