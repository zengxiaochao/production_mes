package com.example.production_mes.controller;

import com.example.production_mes.entity.EquipFaultReport;
import com.example.production_mes.entity.EquipMaintenancePlan;
import com.example.production_mes.service.EquipFaultReportService;
import com.example.production_mes.utils.TimeUtils;
import org.apache.ibatis.annotations.Param;
import com.example.production_mes.dto.Result;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
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
//        System.out.println(pageIndex);
//        System.out.println(pageSize);
//        model.addAttribute("EquipFaultReport", EquipFaultReportList);
        if(!name.equals(""))
        {
//            System.out.println(name);
//            System.out.println(address);
            List<EquipFaultReport> EquipFaultReportList2 = equipFaultReportService.queryByAddress(address,name);
            return EquipFaultReportList2;
        }
        return EquipFaultReportList;
    }

    @RequestMapping("/edit")
    public Result edit(@RequestBody @Param("id") String id,
                       @RequestBody @Param("equipId") String equipId,
                       @RequestBody @Param("equipNo") String equipNo,
                       @RequestBody @Param("equipType") String equipType,
                       @RequestBody @Param("equipLoc") String equipLoc,
                       @RequestBody @Param("faultDesc") String faultDesc,
                       @RequestBody @Param("status") String status,
                       @RequestBody @Param("reportPerson") String reportPerson,
                       @RequestBody @Param("assignTime") String assignTime,
                       @RequestBody @Param("maintenanceWorker") String maintenanceWorker,
                       @RequestBody @Param("createBy") String createBy,
                       @RequestBody @Param("createDate") String createDate,
                       @RequestBody @Param("updateBy") String updateBy,
                       @RequestBody @Param("updateDate") String updateDate,
                       @RequestBody @Param("remarks") String remarks,
                       @RequestBody @Param("delFlag") String delFlag
                       ) {
        EquipFaultReport equipFaultReport = new EquipFaultReport();
        equipFaultReport.setId(id);
        equipFaultReport.setEquipId(equipId);
        equipFaultReport.setEquipNo(equipNo);
        equipFaultReport.setEquipType(equipType);
        equipFaultReport.setEquipLoc(equipLoc);
        equipFaultReport.setFaultDesc(faultDesc);
        equipFaultReport.setStatus(status);
        equipFaultReport.setReportPerson(reportPerson);
//        equipFaultReport.setAssignTime(assignTime);
        equipFaultReport.setMaintenanceWorker(maintenanceWorker);
        equipFaultReport.setCreateBy(createBy);
//        equipFaultReport.setCreateDate(createDate);
        equipFaultReport.setUpdateBy(updateBy);
//        equipFaultReport.setUpdateDate(updateDate);
        equipFaultReport.setRemarks(remarks);
        equipFaultReport.setDelFlag(delFlag);

        System.out.println(id);
        System.out.println(equipId);
        System.out.println(equipNo);
        System.out.println(equipType);
        System.out.println(equipLoc);
        System.out.println(faultDesc);
        System.out.println(status);
        System.out.println(reportPerson);
        System.out.println(assignTime);
        System.out.println(maintenanceWorker);
        System.out.println(createBy);
        System.out.println(createDate);
        System.out.println(updateBy);
        System.out.println(updateDate);
        System.out.println(remarks);
        System.out.println(delFlag);
        equipFaultReport = equipFaultReportService.update(equipFaultReport);
        return Result.success("删除成功");
    }


}