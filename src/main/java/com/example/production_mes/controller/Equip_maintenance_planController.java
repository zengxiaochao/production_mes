package com.example.production_mes.controller;

import com.example.production_mes.pojo.equip_maintenance_plan;
import com.example.production_mes.service.Equip_maintenance_planService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/equip_maintenance_plan")
public class Equip_maintenance_planController {


    @Autowired
    private Equip_maintenance_planService equip_maintenance_planService;

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
        List<equip_maintenance_plan> equip_maintenance_planList = equip_maintenance_planService.all();
        model.addAttribute("allequip_maintenance_plan", equip_maintenance_planList);
        return equip_maintenance_planList.toString();
    }
    /*
    * 通过ID进行查询
    * */
    @RequestMapping("/byid")
    @ResponseBody
    public String byid(Model model){
        return equip_maintenance_planService.byid("1").toString();
    }



}
