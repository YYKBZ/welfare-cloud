package com.welfare.controller;

import com.welfare.entity.Admin;
import com.welfare.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {


    @Autowired
    private LoginService loginService;

    @GetMapping("/login1")
    public String login1(){

        return "login";
    }

    @PostMapping("/login")
    public ModelAndView login(Admin admin , ModelAndView modelAndView){
        Admin admin1 = loginService.loginAdmin(admin);
        System.out.println("进入方法");
        if (admin1!=null){
            System.out.println("登录成功");
            modelAndView.setViewName("index");
            return modelAndView;
        }else {
            System.out.println("登录失败");
            modelAndView.setViewName("login");
            return modelAndView;
        }
    }
}
