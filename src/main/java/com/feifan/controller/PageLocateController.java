package com.feifan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Lidd on 2018/2/13.
 */
@Controller
@RequestMapping("/page")
public class PageLocateController {

    @RequestMapping("/order")
    public String order(){
        return "/order";
    }

    @RequestMapping("/paper")
    public String paper(){
        return "/paper";
    }

    @RequestMapping("/customer")
    public String customer(){
        return "/customer";
    }

    @RequestMapping("/index")
    public String index(){
        return "/index";
    }
}
