package com.example.production_mes.controller;

import com.example.production_mes.entity.BasCellEmployee;
import com.example.production_mes.service.BasCellEmployeeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * (BasCellEmployee)表控制层
 *
 * @author makejava
 * @since 2020-09-16 09:08:14
 */
@RestController
@RequestMapping("basCellEmployee")
public class BasCellEmployeeController {
    /**
     * 服务对象
     */
    @Resource
    private BasCellEmployeeService basCellEmployeeService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public BasCellEmployee selectOne(String id) {
        return this.basCellEmployeeService.queryById(id);
    }

}