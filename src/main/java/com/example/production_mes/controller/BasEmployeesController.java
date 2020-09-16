package com.example.production_mes.controller;

import com.example.production_mes.entity.BasEmployees;
import com.example.production_mes.service.BasEmployeesService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * (BasEmployees)表控制层
 *
 * @author makejava
 * @since 2020-09-16 09:08:17
 */
@RestController
@RequestMapping("basEmployees")
public class BasEmployeesController {
    /**
     * 服务对象
     */
    @Resource
    private BasEmployeesService basEmployeesService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public BasEmployees selectOne(String id) {
        return this.basEmployeesService.queryById(id);
    }

}