package com.example.production_mes.controller;

import com.example.production_mes.pojo.equip_repair;
import com.example.production_mes.service.Equip_repairService;
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

    /**
     * 报修
     */


    @RequestMapping("/add")
    public String add(
//            @RequestParam("id")String id,
            @RequestParam("mid")String mid,
            @RequestParam("fault_type")String fault_type,
            @RequestParam("fault_reason")String fault_reason,
            @RequestParam("fault_desc")String fault_desc,
            @RequestParam("fault_imgs")String fault_imgs,
            @RequestParam("del_flag")String del_flag,
            @RequestParam("remarks")String remarks,
            @RequestParam("create_by")String create_by,
            @RequestParam("update_by")String update_by,
//            @RequestParam("create_date")String create_date,
//            @RequestParam("update_date")String update_date,
            Model model
    ){

        equip_repair equip_r = new equip_repair();
        equip_r.setId(String.valueOf(IDGenerator.generateID()));
        equip_r.setMid(mid);
        equip_r.setRemarks(remarks);
        equip_r.setDel_flag(del_flag);
        equip_r.setCreate_by(create_by);
        equip_r.setUpdate_by(update_by);
        equip_r.setFault_desc(fault_desc);
        equip_r.setFault_imgs(fault_imgs);
        equip_r.setFault_type(fault_type);
        equip_r.setUpdate_date(new TimeUtils().NowTime());
        equip_r.setCreate_date(new TimeUtils().NowTime());
        equip_r.setFault_reason(fault_reason);
        equip_repairService.add(equip_r);
        return "index";
    }
}
