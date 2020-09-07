package com.example.production_mes.controller;

import com.example.production_mes.pojo.equip_fault_report;
import com.example.production_mes.service.Equip_fault_reportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/equip_fault_report")
public class Equip_fault_reportController {

    @Autowired
    private Equip_fault_reportService equip_fault_reportService;


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
        List<equip_fault_report> equip_fault_reportList = equip_fault_reportService.all();
        model.addAttribute("allequip_fault_report", equip_fault_reportList);
        return equip_fault_reportList.toString();
    }
    /*
     * 通过ID进行查询
     * */
    @RequestMapping("/byid")
    @ResponseBody
    public String byid(Model model){
        return equip_fault_reportService.byid("1").toString();
    }

}
