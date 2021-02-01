package com.feng.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Administrator
 * @Date: 2021/2/1 22:48
 * @Description:
 */
@Controller
public class UserController {

    @RequestMapping("/hello")
    public String testHello() {
        System.out.println("来到了UserController当中。");
        return "ok";
    }

    @RequestMapping("/show")
    public String show(Model model){
        model.addAttribute("uid","123456789");
        model.addAttribute("name","Jerry");
        return "test";
    }
}
