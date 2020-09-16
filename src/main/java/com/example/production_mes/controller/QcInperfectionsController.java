package com.example.production_mes.controller;

import com.example.production_mes.entity.QcInperfections;
import com.example.production_mes.service.QcInperfectionsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * (QcInperfections)表控制层
 *
 * @author makejava
 * @since 2020-09-16 09:09:44
 */
@RestController
@RequestMapping("qcInperfections")
public class QcInperfectionsController {
    /**
     * 服务对象
     */
    @Resource
    private QcInperfectionsService qcInperfectionsService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public QcInperfections selectOne(String id) {
        return this.qcInperfectionsService.queryById(id);
    }

}