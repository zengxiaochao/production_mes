package com.example.production_mes.controller;

import com.example.production_mes.entity.BasPad;
import com.example.production_mes.service.BasPadService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * (BasPad)表控制层
 *
 * @author makejava
 * @since 2020-09-16 09:09:28
 */
@RestController
@RequestMapping("basPad")
public class BasPadController {
    /**
     * 服务对象
     */
    @Resource
    private BasPadService basPadService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public BasPad selectOne(String id) {
        return this.basPadService.queryById(id);
    }

}