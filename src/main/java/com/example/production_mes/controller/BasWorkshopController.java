package com.example.production_mes.controller;

import com.example.production_mes.entity.BasWorkshop;
import com.example.production_mes.service.BasWorkshopService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * (BasWorkshop)表控制层
 *
 * @author makejava
 * @since 2020-09-16 09:09:31
 */
@RestController
@RequestMapping("basWorkshop")
public class BasWorkshopController {
    /**
     * 服务对象
     */
    @Resource
    private BasWorkshopService basWorkshopService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public BasWorkshop selectOne(String id) {
        return this.basWorkshopService.queryById(id);
    }

}