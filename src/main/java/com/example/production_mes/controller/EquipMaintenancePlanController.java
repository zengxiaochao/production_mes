package com.example.production_mes.controller;

import com.example.production_mes.entity.EquipMaintenancePlan;
import com.example.production_mes.entity.EquipReport;
import com.example.production_mes.service.EquipMaintenancePlanService;
import com.example.production_mes.utils.IDGenerator;
import com.example.production_mes.utils.TimeUtils;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * (EquipMaintenancePlan)表控制层
 *
 * @author makejava
 * @since 2020-09-16 09:09:34
 */
@RestController
@RequestMapping("equipMaintenancePlan")
public class EquipMaintenancePlanController {
    /**
     * 服务对象
     */
    @Resource
    private EquipMaintenancePlanService equipMaintenancePlanService;


    @GetMapping("selectAll")
    public List<EquipMaintenancePlan> selectAll() {
        return this.equipMaintenancePlanService.queryAllByLimit(0,1000);
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public EquipMaintenancePlan selectOne(String id) {
        return this.equipMaintenancePlanService.queryById(id);
    }
    /*
     * 查找全部
     * */
    @RequestMapping("/all")
    public List<EquipMaintenancePlan> all(Model model){
        List<EquipMaintenancePlan> equip_maintenance_planList = equipMaintenancePlanService.queryAllByLimit(0,20);
        model.addAttribute("allequip_maintenance_plan", equip_maintenance_planList);
        return equip_maintenance_planList;
    }
    /**
     * 添加保养记录
     */
    @RequestMapping("/add")
    public String add(
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
    ){

        EquipMaintenancePlan equip_maintenance_p = new EquipMaintenancePlan();
        equip_maintenance_p.setId(String.valueOf(IDGenerator.generateID()));
        equip_maintenance_p.setCycle(cycle);
        equip_maintenance_p.setRemarks(remarks);
        equip_maintenance_p.setUserId(user_id);
        equip_maintenance_p.setDelFlag(del_flag);
        equip_maintenance_p.setUpdateBy(update_by);
        equip_maintenance_p.setCreateBy(create_by);
        equip_maintenance_p.setWarnTime(warn_time);
        equip_maintenance_p.setUserName(user_name);
        equip_maintenance_p.setEquipType(equip_type);
        equip_maintenance_p.setMaintenance(maintenance);
        equip_maintenance_p.setUpdateDate(new TimeUtils().NowTimeN());
        equip_maintenance_p.setCreateDate(new TimeUtils().NowTimeN());
        equipMaintenancePlanService.insert(equip_maintenance_p);
        return "index";
    }

}