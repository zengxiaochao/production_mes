package com.example.production_mes.controller;

import com.example.production_mes.entity.BasBom;
import com.example.production_mes.service.BasBomService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 物料清单(BasBom)表控制层
 *
 * @author makejava
 * @since 2020-09-16 09:08:12
 */
@RestController
@RequestMapping("basBom")
public class BasBomController {
    /**
     * 服务对象
     */
    @Resource
    private BasBomService basBomService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public BasBom selectOne(String id) {
        return this.basBomService.queryById(id);
    }

}