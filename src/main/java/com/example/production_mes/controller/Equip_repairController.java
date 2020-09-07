package com.example.production_mes.controller;

import com.example.production_mes.pojo.equip_repair;
import com.example.production_mes.service.Equip_repairService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/equip_repair")
public class Equip_repairController {

    @Autowired
    private Equip_repairService equip_repairService;


    @RequestMapping("/test")
    @ResponseBody
    public String test(Model model){
        return "get";
    }

    /*
     * 查找全部
     * */
    @RequestMapping("/all")
    @ResponseBody
    public String all(Model model){
        List<equip_repair> equip_repairList = equip_repairService.all();
        model.addAttribute("all_Equip_repairList", equip_repairList);
        return equip_repairList.toString();
    }
    /*
     * 通过ID进行查询
     * */
    @RequestMapping("/byid")
    @ResponseBody
    public String byid(Model model){
        return equip_repairService.byid("1").toString();
    }



}
