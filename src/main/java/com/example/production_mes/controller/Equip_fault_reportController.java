package com.example.production_mes.controller;

import com.example.production_mes.pojo.equip_fault_report;
import com.example.production_mes.service.Equip_fault_reportService;
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


    /**
     * 添加维修记录
     */
    @RequestMapping("/add")
    public String add(
            @RequestParam("equip_id")String equip_id,
            @RequestParam("equip_no")String equip_no,
            @RequestParam("equip_type")String equip_type,
            @RequestParam("equip_loc")String equip_loc,
            @RequestParam("fault_desc")String fault_desc,
            @RequestParam("status")String status,
            @RequestParam("report_person")String report_person,
            @RequestParam("assign_time")String assign_time,
            @RequestParam("maintenance_worker")String maintenance_worker,
//            @RequestParam("del_flag")String del_flag,
            @RequestParam("remarks")String remarks,
            @RequestParam("create_by")String create_by,
            @RequestParam("update_by")String update_by,
            Model model
    ){
        equip_fault_report equip_fault_r = new equip_fault_report();
        equip_fault_r.setId(String.valueOf(IDGenerator.generateID()));
        equip_fault_r.setEquip_id(equip_id);
        equip_fault_r.setEquip_no(equip_no);
        equip_fault_r.setEquip_type(equip_type);
        equip_fault_r.setEquip_loc(equip_loc);
        equip_fault_r.setFault_desc(fault_desc);
        equip_fault_r.setStatus(status);
        equip_fault_r.setReport_person(report_person);
        equip_fault_r.setMaintenance_worker(maintenance_worker);
        equip_fault_r.setDel_flag("0");
        equip_fault_r.setRemarks(remarks);
        equip_fault_r.setCreate_by(create_by);
        equip_fault_r.setUpdate_by(update_by);

        equip_fault_r.setCreate_date(new TimeUtils().NowTime());
        equip_fault_r.setAssign_time(new TimeUtils().NowTime());
        equip_fault_r.setUpdate_date(new TimeUtils().NowTime());




        equip_fault_reportService.add(equip_fault_r);
        return "index";
    }




    /**
     * 更新维修记录
     */

}

