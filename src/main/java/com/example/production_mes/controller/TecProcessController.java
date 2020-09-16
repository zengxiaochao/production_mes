package com.example.production_mes.controller;

import com.example.production_mes.entity.TecProcess;
import com.example.production_mes.service.TecProcessService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 工艺基础数据维护（工序）(TecProcess)表控制层
 *
 * @author makejava
 * @since 2020-09-16 09:09:55
 */
@RestController
@RequestMapping("tecProcess")
public class TecProcessController {
    /**
     * 服务对象
     */
    @Resource
    private TecProcessService tecProcessService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public TecProcess selectOne(String id) {
        return this.tecProcessService.queryById(id);
    }

}