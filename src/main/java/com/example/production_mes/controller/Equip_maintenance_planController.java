package com.example.production_mes.controller;

import com.example.production_mes.pojo.equip_maintenance_plan;
import com.example.production_mes.service.Equip_maintenance_planService;
import com.example.production_mes.utils.IDGenerator;
import com.example.production_mes.utils.TimeUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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

    /**
     * 添加保养记录
     */
    @RequestMapping("/add")
    public String add(
            Model model,
            @RequestParam("equip_type")String equip_type,
            @RequestParam("maintenance")String maintenance,
            @RequestParam("cycle")String cycle,
            @RequestParam("warn_time")int warn_time,
            @RequestParam("user_name")String user_name,
            @RequestParam("user_id")String user_id,
            @RequestParam("del_flag")String del_flag,
            @RequestParam("remarks")String remarks,
            @RequestParam("create_by")String create_by,
            @RequestParam("update_by")String update_by
//            @RequestParam("create_date")String create_date,
//            @RequestParam("update_date")String update_date
    ){

        equip_maintenance_plan equip_maintenance_p = new equip_maintenance_plan();
//        equip_maintenance_p.setId(id);
        equip_maintenance_p.setId(String.valueOf(IDGenerator.generateID()));
        equip_maintenance_p.setCycle(cycle);
        equip_maintenance_p.setRemarks(remarks);
        equip_maintenance_p.setUser_id(user_id);
        equip_maintenance_p.setDel_flag(del_flag);
        equip_maintenance_p.setUpdate_by(update_by);
        equip_maintenance_p.setCreate_by(create_by);
        equip_maintenance_p.setWarn_time(warn_time);
        equip_maintenance_p.setUser_name(user_name);
        equip_maintenance_p.setEquip_type(equip_type);
        equip_maintenance_p.setMaintenance(maintenance);
//        equip_maintenance_p.setUpdate_date(update_date);
        equip_maintenance_p.setUpdate_date(new TimeUtils().NowTime());
//        equip_maintenance_p.setCreate_date(create_date);
        equip_maintenance_p.setCreate_date(new TimeUtils().NowTime());
        equip_maintenance_planService.add(equip_maintenance_p);
        return "index";
    }


}
