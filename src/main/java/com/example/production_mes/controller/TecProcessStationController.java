package com.example.production_mes.controller;

import com.example.production_mes.entity.TecProcessStation;
import com.example.production_mes.service.TecProcessStationService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 工序与工站关系(TecProcessStation)表控制层
 *
 * @author makejava
 * @since 2020-09-16 09:09:56
 */
@RestController
@RequestMapping("tecProcessStation")
public class TecProcessStationController {
    /**
     * 服务对象
     */
    @Resource
    private TecProcessStationService tecProcessStationService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public TecProcessStation selectOne(String id) {
        return this.tecProcessStationService.queryById(id);
    }

}