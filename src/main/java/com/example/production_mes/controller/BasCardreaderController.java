package com.example.production_mes.controller;

import com.example.production_mes.entity.BasCardreader;
import com.example.production_mes.service.BasCardreaderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * (BasCardreader)表控制层
 *
 * @author makejava
 * @since 2020-09-16 09:08:13
 */
@RestController
@RequestMapping("basCardreader")
public class BasCardreaderController {
    /**
     * 服务对象
     */
    @Resource
    private BasCardreaderService basCardreaderService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public BasCardreader selectOne(String id) {
        return this.basCardreaderService.queryById(id);
    }

}