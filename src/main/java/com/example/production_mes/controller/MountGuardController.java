package com.example.production_mes.controller;

import com.example.production_mes.entity.MountGuard;
import com.example.production_mes.service.MountGuardService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 员工上岗表(MountGuard)表控制层
 *
 * @author makejava
 * @since 2020-09-16 09:09:41
 */
@RestController
@RequestMapping("mountGuard")
public class MountGuardController {
    /**
     * 服务对象
     */
    @Resource
    private MountGuardService mountGuardService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public MountGuard selectOne(String id) {
        return this.mountGuardService.queryById(id);
    }

}