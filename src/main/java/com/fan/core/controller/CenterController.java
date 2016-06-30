package com.fan.core.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Date;

/**
 * Created by fqc on 2016/6/30.
 */
@Controller
public class CenterController {
    @RequestMapping(value = "/test/index.do", method = RequestMethod.POST)
    public String test(String name, Date birthday) {
        System.out.println(name);
        System.out.println(birthday);
        return "index";
    }
}
