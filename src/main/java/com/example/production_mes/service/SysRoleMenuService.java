package com.example.production_mes.service;

import com.example.production_mes.entity.SysRoleMenu;

import java.util.List;

/**
 * 角色-菜单(SysRoleMenu)表服务接口
 *
 * @author makejava
 * @since 2020-09-16 09:09:51
 */
public interface SysRoleMenuService {

    /**
     * 通过ID查询单条数据
     *
     * @param roleId 主键
     * @return 实例对象
     */
    SysRoleMenu queryById(String roleId);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<SysRoleMenu> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param sysRoleMenu 实例对象
     * @return 实例对象
     */
    SysRoleMenu insert(SysRoleMenu sysRoleMenu);

    /**
     * 修改数据
     *
     * @param sysRoleMenu 实例对象
     * @return 实例对象
     */
    SysRoleMenu update(SysRoleMenu sysRoleMenu);

    /**
     * 通过主键删除数据
     *
     * @param roleId 主键
     * @return 是否成功
     */
    boolean deleteById(String roleId);

}