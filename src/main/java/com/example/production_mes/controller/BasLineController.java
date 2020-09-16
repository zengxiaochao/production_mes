package com.example.production_mes.controller;

import com.example.production_mes.entity.BasLine;
import com.example.production_mes.service.BasLineService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * (BasLine)表控制层
 *
 * @author makejava
 * @since 2020-09-16 09:09:27
 */
@RestController
@RequestMapping("basLine")
public class BasLineController {
    /**
     * 服务对象
     */
    @Resource
    private BasLineService basLineService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public BasLine selectOne(String id) {
        return this.basLineService.queryById(id);
    }

}