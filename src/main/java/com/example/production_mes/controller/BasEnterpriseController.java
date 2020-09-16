package com.example.production_mes.controller;

import com.example.production_mes.entity.BasEnterprise;
import com.example.production_mes.service.BasEnterpriseService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * (BasEnterprise)表控制层
 *
 * @author makejava
 * @since 2020-09-16 09:08:18
 */
@RestController
@RequestMapping("basEnterprise")
public class BasEnterpriseController {
    /**
     * 服务对象
     */
    @Resource
    private BasEnterpriseService basEnterpriseService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public BasEnterprise selectOne(String id) {
        return this.basEnterpriseService.queryById(id);
    }

}