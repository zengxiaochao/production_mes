package com.example.production_mes.controller;

import com.example.production_mes.entity.BasWorkorder;
import com.example.production_mes.service.BasWorkorderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * (BasWorkorder)表控制层
 *
 * @author makejava
 * @since 2020-09-16 09:09:30
 */
@RestController
@RequestMapping("basWorkorder")
public class BasWorkorderController {
    /**
     * 服务对象
     */
    @Resource
    private BasWorkorderService basWorkorderService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public BasWorkorder selectOne(String id) {
        return this.basWorkorderService.queryById(id);
    }

}