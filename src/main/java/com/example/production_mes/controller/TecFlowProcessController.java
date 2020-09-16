package com.example.production_mes.controller;

import com.example.production_mes.entity.TecFlowProcess;
import com.example.production_mes.service.TecFlowProcessService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 工艺路由与工序关系(TecFlowProcess)表控制层
 *
 * @author makejava
 * @since 2020-09-16 09:09:55
 */
@RestController
@RequestMapping("tecFlowProcess")
public class TecFlowProcessController {
    /**
     * 服务对象
     */
    @Resource
    private TecFlowProcessService tecFlowProcessService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public TecFlowProcess selectOne(String id) {
        return this.tecFlowProcessService.queryById(id);
    }

}