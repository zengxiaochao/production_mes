package com.example.production_mes.controller;

import com.example.production_mes.pojo.sys_log;
import com.example.production_mes.service.logService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@Controller
public class TestController {
    @Autowired
    private logService logserv;

    @RequestMapping("/findlog")
    @ResponseBody
    public String findlog(Model model){

        model.addAttribute("id","132165134134613246");
        return logserv.findlog("02d69c63123143449a147e086a932efb").toString();
    }

    @RequestMapping("/alllog")
    public String alllog(Model model){
        List<sys_log> loglist = logserv.selectAllLogs();
        model.addAttribute("alllog",loglist);
        return "allLog";
    }
}