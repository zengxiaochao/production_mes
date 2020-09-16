package com.example.production_mes.controller;

import com.example.production_mes.entity.QcAbnormalProcess;
import com.example.production_mes.service.QcAbnormalProcessService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 异常工序检测(QcAbnormalProcess)表控制层
 *
 * @author makejava
 * @since 2020-09-16 09:09:43
 */
@RestController
@RequestMapping("qcAbnormalProcess")
public class QcAbnormalProcessController {
    /**
     * 服务对象
     */
    @Resource
    private QcAbnormalProcessService qcAbnormalProcessService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public QcAbnormalProcess selectOne(String id) {
        return this.qcAbnormalProcessService.queryById(id);
    }

}