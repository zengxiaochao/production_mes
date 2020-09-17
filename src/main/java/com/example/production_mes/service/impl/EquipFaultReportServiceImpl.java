package com.example.production_mes.service.impl;

import com.example.production_mes.dao.EquipFaultReportDao;
import com.example.production_mes.entity.EquipFaultReport;
import com.example.production_mes.service.EquipFaultReportService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (EquipFaultReport)表服务实现类
 *
 * @author makejava
 * @since 2020-09-16 09:09:33
 */
@Service("equipFaultReportService")
public class EquipFaultReportServiceImpl implements EquipFaultReportService {
    @Resource
    private EquipFaultReportDao equipFaultReportDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public EquipFaultReport queryById(String id) {
        return this.equipFaultReportDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<EquipFaultReport> queryAllByLimit(int offset, int limit) {
        return this.equipFaultReportDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param equipFaultReport 实例对象
     * @return 实例对象
     */
    @Override
    public EquipFaultReport insert(EquipFaultReport equipFaultReport) {
        this.equipFaultReportDao.insert(equipFaultReport);
        return equipFaultReport;
    }

    /**
     * 修改数据
     *
     * @param equipFaultReport 实例对象
     * @return 实例对象
     */
    @Override
    public EquipFaultReport update(EquipFaultReport equipFaultReport) {
        this.equipFaultReportDao.update(equipFaultReport);
        return this.queryById(equipFaultReport.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String id) {
        return this.equipFaultReportDao.deleteById(id) > 0;
    }


    /**
     * 查询按钮
     * @param address
     * @param name
     * @return
     */
    @Override
    public List<EquipFaultReport> queryByAddress(String address, String name) {
        return this.equipFaultReportDao.queryByAddress(address, name);
    }
}