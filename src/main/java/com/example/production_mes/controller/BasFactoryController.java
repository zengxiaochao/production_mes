package com.example.production_mes.controller;

import com.example.production_mes.entity.BasFactory;
import com.example.production_mes.service.BasFactoryService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * (BasFactory)表控制层
 *
 * @author makejava
 * @since 2020-09-16 09:09:26
 */
@RestController
@RequestMapping("basFactory")
public class BasFactoryController {
    /**
     * 服务对象
     */
    @Resource
    private BasFactoryService basFactoryService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public BasFactory selectOne(String id) {
        return this.basFactoryService.queryById(id);
    }

}