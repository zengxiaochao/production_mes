package com.example.production_mes.controller;

import com.example.production_mes.entity.BasProduct;
import com.example.production_mes.service.BasProductService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * (BasProduct)表控制层
 *
 * @author makejava
 * @since 2020-09-16 09:09:29
 */
@RestController
@RequestMapping("basProduct")
public class BasProductController {
    /**
     * 服务对象
     */
    @Resource
    private BasProductService basProductService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public BasProduct selectOne(String id) {
        return this.basProductService.queryById(id);
    }

}