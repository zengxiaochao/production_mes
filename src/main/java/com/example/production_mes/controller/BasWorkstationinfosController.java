package com.example.production_mes.controller;

import com.example.production_mes.entity.BasWorkstationinfos;
import com.example.production_mes.service.BasWorkstationinfosService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * (BasWorkstationinfos)表控制层
 *
 * @author makejava
 * @since 2020-09-16 09:09:32
 */
@RestController
@RequestMapping("basWorkstationinfos")
public class BasWorkstationinfosController {
    /**
     * 服务对象
     */
    @Resource
    private BasWorkstationinfosService basWorkstationinfosService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public BasWorkstationinfos selectOne(String id) {
        return this.basWorkstationinfosService.queryById(id);
    }

}