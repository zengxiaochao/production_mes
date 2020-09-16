package com.example.production_mes.controller;

import com.example.production_mes.entity.BasIphoto;
import com.example.production_mes.service.BasIphotoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * (BasIphoto)表控制层
 *
 * @author makejava
 * @since 2020-09-16 09:09:26
 */
@RestController
@RequestMapping("basIphoto")
public class BasIphotoController {
    /**
     * 服务对象
     */
    @Resource
    private BasIphotoService basIphotoService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public BasIphoto selectOne(String id) {
        return this.basIphotoService.queryById(id);
    }

}