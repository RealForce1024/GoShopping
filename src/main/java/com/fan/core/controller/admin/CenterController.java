package com.fan.core.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Date;

/**
 * Created by fqc on 2016/6/30.
 */
@Controller
public class CenterController {
    @RequestMapping(value = "/test/index.do")
    public String test(String name, Date birthday) {
        System.out.println(name);
        System.out.println(birthday);
        System.out.println("进入admin中，只是路径匹配，与包结构无关");
        return "index";
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
