package com.example.production_mes.controller;

import com.example.production_mes.entity.QcViolaction;
import com.example.production_mes.service.QcViolactionService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * (QcViolaction)表控制层
 *
 * @author makejava
 * @since 2020-09-16 09:09:44
 */
@RestController
@RequestMapping("qcViolaction")
public class QcViolactionController {
    /**
     * 服务对象
     */
    @Resource
    private QcViolactionService qcViolactionService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public QcViolaction selectOne(String id) {
        return this.qcViolactionService.queryById(id);
    }

}