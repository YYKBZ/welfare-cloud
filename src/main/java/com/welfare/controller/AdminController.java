package com.welfare.controller;

import com.welfare.entity.Admin;
import com.welfare.mapper.AdminMapper;
import com.welfare.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private AdminService adminService;

    @GetMapping("/all")
    public ModelAndView findAllAdmin(ModelAndView modelAndView){
        List<Admin> allAdmin = adminService.findAllAdmin();
        modelAndView.setViewName("admin-list");
        modelAndView.addObject("admin",allAdmin);
        return modelAndView;
    }

    @PostMapping("/add")
    public Integer addAdmin(@RequestBody Admin admin){
        return adminService.addAdmin(admin);
    }

    @PostMapping("/del")
    public Integer delAdmin(@RequestBody Admin admin){
        return adminService.delAdmin(admin);
    }

    @PostMapping("/init")
    public Integer initAdminPwd(@RequestBody Admin admin){
        return adminService.initAdminPwd(admin);
    }

    @PostMapping("/update")
    public Integer updatePwd(@RequestBody Admin admin){
        return adminService.updatePwd(admin);
    }
}
