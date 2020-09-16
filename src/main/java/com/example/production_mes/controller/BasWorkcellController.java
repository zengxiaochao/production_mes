package com.example.production_mes.controller;

import com.example.production_mes.entity.BasWorkcell;
import com.example.production_mes.service.BasWorkcellService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * (BasWorkcell)表控制层
 *
 * @author makejava
 * @since 2020-09-16 09:09:30
 */
@RestController
@RequestMapping("basWorkcell")
public class BasWorkcellController {
    /**
     * 服务对象
     */
    @Resource
    private BasWorkcellService basWorkcellService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public BasWorkcell selectOne(String id) {
        return this.basWorkcellService.queryById(id);
    }

}