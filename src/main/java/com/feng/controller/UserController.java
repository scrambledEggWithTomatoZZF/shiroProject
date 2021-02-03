package com.feng.controller;

import com.feng.entitiy.User;
import com.feng.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author: zzf
 * @Date: 2021/2/1 22:48
 * @Description:
 */
@Controller
public class UserController {

    @Autowired
    public UserService userService;

    @RequestMapping("/toLogin")
    public String login() {
        System.out.println("跳转到登录页面！");
        return "login";
    }

    @RequestMapping("/login")
    public void login(User user) {
        userService.login(user);
    }

    @RequestMapping("/queryAll")
    public void queryAll() {
        userService.findAll();

    }

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

    @RequestMapping("/detail")
    public String detail(){
        System.out.println("来到了detail页面！");
        return "detail";
    }
}
