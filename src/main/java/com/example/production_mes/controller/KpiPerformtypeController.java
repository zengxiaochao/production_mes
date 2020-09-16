package com.example.production_mes.controller;

import com.example.production_mes.entity.KpiPerformtype;
import com.example.production_mes.service.KpiPerformtypeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 绩效方式表(KpiPerformtype)表控制层
 *
 * @author makejava
 * @since 2020-09-16 09:09:36
 */
@RestController
@RequestMapping("kpiPerformtype")
public class KpiPerformtypeController {
    /**
     * 服务对象
     */
    @Resource
    private KpiPerformtypeService kpiPerformtypeService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public KpiPerformtype selectOne(String id) {
        return this.kpiPerformtypeService.queryById(id);
    }

}