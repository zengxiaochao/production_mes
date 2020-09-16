package com.example.production_mes.controller;

import com.example.production_mes.entity.TecFlow;
import com.example.production_mes.service.TecFlowService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 工艺路由维护（流程）(TecFlow)表控制层
 *
 * @author makejava
 * @since 2020-09-16 09:09:54
 */
@RestController
@RequestMapping("tecFlow")
public class TecFlowController {
    /**
     * 服务对象
     */
    @Resource
    private TecFlowService tecFlowService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public TecFlow selectOne(String id) {
        return this.tecFlowService.queryById(id);
    }

}