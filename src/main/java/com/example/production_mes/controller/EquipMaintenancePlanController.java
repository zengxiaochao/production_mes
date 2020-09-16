package com.example.production_mes.controller;

import com.example.production_mes.entity.EquipMaintenancePlan;
import com.example.production_mes.service.EquipMaintenancePlanService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

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

}