package com.example.production_mes.service.impl;

import com.example.production_mes.dao.EquipMaintenancePlanDao;
import com.example.production_mes.entity.EquipMaintenancePlan;
import com.example.production_mes.service.EquipMaintenancePlanService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (EquipMaintenancePlan)表服务实现类
 *
 * @author makejava
 * @since 2020-09-16 09:09:34
 */
@Service("equipMaintenancePlanService")
public class EquipMaintenancePlanServiceImpl implements EquipMaintenancePlanService {
    @Resource
    private EquipMaintenancePlanDao equipMaintenancePlanDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public EquipMaintenancePlan queryById(String id) {
        return this.equipMaintenancePlanDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<EquipMaintenancePlan> queryAllByLimit(int offset, int limit) {
        return this.equipMaintenancePlanDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param equipMaintenancePlan 实例对象
     * @return 实例对象
     */
    @Override
    public EquipMaintenancePlan insert(EquipMaintenancePlan equipMaintenancePlan) {
        this.equipMaintenancePlanDao.insert(equipMaintenancePlan);
        return equipMaintenancePlan;
    }

    /**
     * 修改数据
     *
     * @param equipMaintenancePlan 实例对象
     * @return 实例对象
     */
    @Override
    public EquipMaintenancePlan update(EquipMaintenancePlan equipMaintenancePlan) {
        this.equipMaintenancePlanDao.update(equipMaintenancePlan);
        return this.queryById(equipMaintenancePlan.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String id) {
        return this.equipMaintenancePlanDao.deleteById(id) > 0;
    }
}