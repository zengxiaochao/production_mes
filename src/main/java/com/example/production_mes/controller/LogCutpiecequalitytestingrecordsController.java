package com.example.production_mes.controller;

import com.example.production_mes.entity.LogChopingbizrecords;
import com.example.production_mes.entity.LogCutpiecequalitytestingrecords;
import com.example.production_mes.service.LogCutpiecequalitytestingrecordsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * (LogCutpiecequalitytestingrecords)表控制层
 *
 * @author makejava
 * @since 2020-09-16 09:09:38
 */
@RestController
@RequestMapping("logCutpiecequalitytestingrecords")
public class LogCutpiecequalitytestingrecordsController {
    /**
     * 服务对象
     */
    @Resource
    private LogCutpiecequalitytestingrecordsService logCutpiecequalitytestingrecordsService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public LogCutpiecequalitytestingrecords selectOne(String id) {
        return this.logCutpiecequalitytestingrecordsService.queryById(id);
    }

    @GetMapping("selectAll")
    public List<LogCutpiecequalitytestingrecords> selectAll(String id) {
        return this.logCutpiecequalitytestingrecordsService.queryAllByLimit(0,100000);
    }

}