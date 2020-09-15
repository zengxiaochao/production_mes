package com.example.production_mes.controller;

import com.example.production_mes.service.Bas_codeprinterService;
import com.example.production_mes.service.Bas_electronsteelyardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/bas_electronsteelyard")
public class Bas_electronsteelyardController {


    @Autowired
    private Bas_electronsteelyardService bas_electronsteelyardService;

    @RequestMapping("/test")
    @ResponseBody
    public String test(Model model){
        return "get";
    }


    /**
     * 添加
     * @param model
     * @return
     */
    @RequestMapping("/add")
    @ResponseBody
    public String add(Model model){
        return "add";
    }
    /**
     * 删除
     * @param model
     * @return
     */
    @RequestMapping("/delete")
    @ResponseBody
    public String delete(Model model){
        return "delete";
    }
    /**
     * 修改
     * @param model
     * @return
     */
    @RequestMapping("/edit")
    @ResponseBody
    public String edit(Model model){
        return "edit";
    }
    /**
     * 查询
     * @param model
     * @return
     */
    @RequestMapping("/select")
    @ResponseBody
    public String select(Model model){
        return "select";
    }
}