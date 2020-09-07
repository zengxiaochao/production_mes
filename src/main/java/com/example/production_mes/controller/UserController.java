package com.example.production_mes.controller;


import com.example.production_mes.pojo.sys_log;
import com.example.production_mes.pojo.sys_user;
import com.example.production_mes.service.Equip_fault_reportService;
import com.example.production_mes.service.Sys_userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/sys_user")
public class UserController {

    @Autowired
    private Sys_userService sys_userService;



    @RequestMapping("/login")
    public String alluser(
            @RequestParam("login_name")String login_name,
            @RequestParam("password")String password,
            Model model){
        sys_user login_user = sys_userService.login(login_name);
        if(login_user==null)
        {
            model.addAttribute("msg","用户名或密码错误");
            return "/login";
        }
        else if(!login_user.getPassword().equals(password))
        {
            model.addAttribute("msg","用户名或密码错误");
            return "/login";
        }
        model.addAttribute("user",login_user);
        return "index";
    }
}
