package com.example.production_mes.controller;

import com.example.production_mes.entity.EquipFaultReport;
import com.example.production_mes.entity.EquipMaintenancePlan;
import com.example.production_mes.entity.EquipReport;
import com.example.production_mes.service.EquipFaultReportService;
import com.example.production_mes.utils.IDGenerator;
import com.example.production_mes.utils.TimeUtils;
import org.apache.ibatis.annotations.Param;
import com.example.production_mes.dto.Result;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;

/**
 * (EquipFaultReport)表控制层
 *
 * @author makejava
 * @since 2020-09-16 09:09:33
 */
@RestController
@RequestMapping("equipFaultReport")
public class EquipFaultReportController {
    /**
     * 服务对象
     */
    @Resource
    private EquipFaultReportService equipFaultReportService;
    /**
     * 查找全部
     * @return
     */
    @GetMapping("selectAll")
    public List<EquipFaultReport> selectAll() {
        return this.equipFaultReportService.queryAllByLimit(0,1000);
    }
    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public EquipFaultReport selectOne(String id) {
        return this.equipFaultReportService.queryById(id);
    }

    @GetMapping("deleteById")
    public Result deleteById(String id) {
        System.out.println(id);
        equipFaultReportService.deleteById(id);
        return Result.success("删除成功");
    }

    /**
     * 查询
     * 搜索时时使用了动态sql
     * @param name
     * @param address
     * @param pageIndex
     * @param pageSize
     * @param model
     * @return
     */
    @RequestMapping("/all")
    public List<EquipFaultReport> all(@Param("name") String name,@Param("address") String address, @Param("pageIndex") int pageIndex,@Param("pageSize")  int pageSize, Model model){
        List<EquipFaultReport> EquipFaultReportList = equipFaultReportService.queryAllByLimit(pageIndex,pageSize);
        if(!name.equals(""))
        {
            List<EquipFaultReport> EquipFaultReportList2 = equipFaultReportService.queryByAddress(address,name);
            return EquipFaultReportList2;
        }
        return EquipFaultReportList;
    }

    /**
     * 条件查询
     * @param equip_type
     * @param equip_loc
     * @param status
     * @return
     */
    @GetMapping("select")
    public List<EquipFaultReport> select(@Param("equip_type")String equip_type, @Param("equip_loc")String equip_loc, @Param("status")String status) {
        return this.equipFaultReportService.query(equip_type,equip_loc,status);
    }

    /**
     * 派工
     * @param map
     * @return
     */
    @RequestMapping(value="/edit")
    public Result edit(@RequestBody HashMap<String, String> map
                       ) {
        EquipFaultReport equipFaultReport = new EquipFaultReport();
        equipFaultReport.setId(map.get("id"));
        equipFaultReport.setMaintenanceWorker(map.get("maintenanceWorker"));
        equipFaultReport.setStatus("0002");
        equipFaultReport.setAssignTime(TimeUtils.StringToDate(TimeUtils.NowTime()));
        equipFaultReport.setUpdateBy(map.get("reportPerson"));
        equipFaultReport.setUpdateDate(TimeUtils.StringToDate(TimeUtils.NowTime()));
        equipFaultReport = equipFaultReportService.update(equipFaultReport);
        return Result.success("派工成功");
    }

    /**
     * 报修
     * @param map
     * @return
     */
    @RequestMapping(value="/add")
    public Result add(@RequestBody HashMap<String, String> map
    ) {
        EquipFaultReport equipFaultReport = new EquipFaultReport();
        equipFaultReport.setId(IDGenerator.generateIDByDateStr());
        equipFaultReport.setEquipNo(map.get("equipNo"));
        equipFaultReport.setEquipType(map.get("equipType"));
        equipFaultReport.setEquipLoc(map.get("equipLoc"));
        equipFaultReport.setFaultDesc(map.get("faultDesc"));
        equipFaultReport.setStatus("0001");
        equipFaultReport.setDelFlag("0");
        equipFaultReport.setReportPerson(map.get("reportPerson"));
        equipFaultReport.setCreateBy(map.get("reportPerson"));
        equipFaultReport.setCreateDate(TimeUtils.StringToDate(TimeUtils.NowTime()));
        equipFaultReportService.insert(equipFaultReport);
        return Result.success("添加成功");
    }

    @RequestMapping(value="/edit2",method= RequestMethod.POST)
    public Result edit2(@ModelAttribute EquipFaultReport equipFaultReport) {
        System.out.println(equipFaultReport.toString());
        equipFaultReportService.update(equipFaultReport);
        return Result.success("修改成功");
    }



}