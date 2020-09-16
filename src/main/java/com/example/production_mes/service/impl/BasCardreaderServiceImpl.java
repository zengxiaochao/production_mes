package com.example.production_mes.service.impl;

import com.example.production_mes.dao.BasCardreaderDao;
import com.example.production_mes.entity.BasCardreader;
import com.example.production_mes.service.BasCardreaderService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (BasCardreader)表服务实现类
 *
 * @author makejava
 * @since 2020-09-16 09:08:13
 */
@Service("basCardreaderService")
public class BasCardreaderServiceImpl implements BasCardreaderService {
    @Resource
    private BasCardreaderDao basCardreaderDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public BasCardreader queryById(String id) {
        return this.basCardreaderDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<BasCardreader> queryAllByLimit(int offset, int limit) {
        return this.basCardreaderDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param basCardreader 实例对象
     * @return 实例对象
     */
    @Override
    public BasCardreader insert(BasCardreader basCardreader) {
        this.basCardreaderDao.insert(basCardreader);
        return basCardreader;
    }

    /**
     * 修改数据
     *
     * @param basCardreader 实例对象
     * @return 实例对象
     */
    @Override
    public BasCardreader update(BasCardreader basCardreader) {
        this.basCardreaderDao.update(basCardreader);
        return this.queryById(basCardreader.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String id) {
        return this.basCardreaderDao.deleteById(id) > 0;
    }
}