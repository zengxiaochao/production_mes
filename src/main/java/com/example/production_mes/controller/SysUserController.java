package com.example.production_mes.controller;

import com.example.production_mes.entity.SysUser;
import com.example.production_mes.service.SysUserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 用户表(SysUser)表控制层
 *
 * @author makejava
 * @since 2020-09-16 09:09:52
 */
@RestController
@RequestMapping("sysUser")
public class SysUserController {
    /**
     * 服务对象
     */
    @Resource
    private SysUserService sysUserService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public SysUser selectOne(String id) {
        return this.sysUserService.queryById(id);
    }

}