package com.fan.core.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by fqc on 2016/7/2.
 */
@Controller
@RequestMapping("brand")
public class BrandController {

    @RequestMapping("list.do")
    public String list() {
        return "brand/list";
    }
}
