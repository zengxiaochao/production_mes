package com.example.production_mes.service;

import com.example.production_mes.entity.BasWorkorder;

import java.util.List;

/**
 * (BasWorkorder)表服务接口
 *
 * @author makejava
 * @since 2020-09-16 09:09:30
 */
public interface BasWorkorderService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    BasWorkorder queryById(String id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<BasWorkorder> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param basWorkorder 实例对象
     * @return 实例对象
     */
    BasWorkorder insert(BasWorkorder basWorkorder);

    /**
     * 修改数据
     *
     * @param basWorkorder 实例对象
     * @return 实例对象
     */
    BasWorkorder update(BasWorkorder basWorkorder);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(String id);

}