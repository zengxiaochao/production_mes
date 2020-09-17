package com.example.production_mes.controller;

import com.example.production_mes.entity.EquipRepair;
import com.example.production_mes.service.EquipRepairService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * (EquipRepair)表控制层
 *
 * @author makejava
 * @since 2020-09-16 09:09:34
 */
@RestController
@RequestMapping("equipRepair")
public class EquipRepairController {
    /**
     * 服务对象
     */
    @Resource
    private EquipRepairService equipRepairService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")

    public EquipRepair selectOne(String id) {
        return this.equipRepairService.queryById(id);
    }



    @GetMapping("selectAll")
    public List<EquipRepair> selectAll() {
        return this.equipRepairService.queryAllByLimit(0,10);
    }


}