package com.example.production_mes.controller;

import com.example.production_mes.entity.BasElectronsteelyard;
import com.example.production_mes.service.BasElectronsteelyardService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * (BasElectronsteelyard)表控制层
 *
 * @author makejava
 * @since 2020-09-16 09:08:16
 */
@RestController
@RequestMapping("basElectronsteelyard")
public class BasElectronsteelyardController {
    /**
     * 服务对象
     */
    @Resource
    private BasElectronsteelyardService basElectronsteelyardService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public BasElectronsteelyard selectOne(String id) {
        return this.basElectronsteelyardService.queryById(id);
    }

}