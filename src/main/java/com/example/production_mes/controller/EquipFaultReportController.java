package com.example.production_mes.controller;

import com.example.production_mes.entity.EquipFaultReport;
import com.example.production_mes.entity.EquipMaintenancePlan;
import com.example.production_mes.service.EquipFaultReportService;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * (EquipFaultReport)表控制层
 *
 * @author makejava
 * @since 2020-09-16 09:09:33
 */
@RestController
@RequestMapping("equipFaultReport")
public class EquipFaultReportController {
    /**
     * 服务对象
     */
    @Resource
    private EquipFaultReportService equipFaultReportService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public EquipFaultReport selectOne(String id) {
        return this.equipFaultReportService.queryById(id);
    }
    /*
     * 查找全部
     * */
    @RequestMapping("/all")
    public List<EquipFaultReport> all(Model model){
        List<EquipFaultReport> EquipFaultReportList = equipFaultReportService.queryAllByLimit(0,20);
        model.addAttribute("EquipFaultReport", EquipFaultReportList);
        return EquipFaultReportList;
    }

}