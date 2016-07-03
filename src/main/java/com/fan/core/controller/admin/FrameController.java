package com.fan.core.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by fqc on 2016/7/2.
 */
@Controller
@RequestMapping("admin/frame")
public class FrameController {

    @RequestMapping("product_main.do")
    public String product_main() {
        return "frame/product_main";
    }

    @RequestMapping("product_left.do")
    public String product_left() {
        return "frame/product_left";
    }


    @RequestMapping("order_main.do")
    public String order_main() {
        return "frame/order_main";
    }

    @RequestMapping("order_left.do")
    public String order_left() {
        return "frame/order_left";
    }

}
