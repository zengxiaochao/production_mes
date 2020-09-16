package com.example.production_mes.controller;

import com.example.production_mes.entity.Material;
import com.example.production_mes.service.MaterialService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * (Material)表控制层
 *
 * @author makejava
 * @since 2020-09-16 09:09:41
 */
@RestController
@RequestMapping("material")
public class MaterialController {
    /**
     * 服务对象
     */
    @Resource
    private MaterialService materialService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Material selectOne(String id) {
        return this.materialService.queryById(id);
    }

}