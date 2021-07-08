package com.welfare.controller;

import com.welfare.entity.Role;
import com.welfare.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/***
 * (4)管理员管理
 * 2021/7/5
 */
@Controller
@RequestMapping("/role")
public class RoleController {

    @Autowired
    private RoleService roleService;

    @GetMapping("all")
    public ModelAndView selectAllRole(ModelAndView modelAndView) {
        List<Role> roles = roleService.selectAllRole();
        modelAndView.addObject("roles",roles);
        modelAndView.setViewName("admin-role");
        return modelAndView;
    }

    @PostMapping("insert")
    public Integer insertRole(@RequestBody Role role){
        return roleService.insertRole(role);
    }

    @PostMapping("del")
    public Integer delRole(@RequestBody Role role){
        return roleService.delRole(role);
    }

    @PostMapping("update")
    Integer updateRole(@RequestBody Role role){
        return roleService.updateRole(role);
    }
}
