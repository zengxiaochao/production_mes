package com.example.production_mes.controller;


import com.example.production_mes.entity.EquipRepair;
import com.example.production_mes.entity.EquipReport;
import com.example.production_mes.service.EquipRepairService;
import com.example.production_mes.service.EquipReportService;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("equipReport")
public class EquipReportController {

    @Resource
    private EquipReportService equipReportService;

    @GetMapping("selectAll")
    public List<EquipReport> selectAll() {
        return this.equipReportService.queryAllByLimit(0,1000);
    }

    @GetMapping("selectBy")
    public List<EquipReport> selectBy(String by) {
        return this.equipReportService.selectBy(by);
    }



    @GetMapping("select")
    public List<EquipReport> select(@Param("type")String type, @Param("spec")String spec, @Param("id")String id) {

//        if(type.equals("电子秤"))
//            ctype="0001";
//        else if(type.equals("读卡器"))
//            ctype="0002";
//        else if(type.equals("条码打印机"))
//            ctype="0003";
//        else if(type.equals("安卓PAD"))
//            ctype="0004";
//        else if(type.equals("红外对射枪"))
//            ctype="0005";
//        if(spec.equals("重量"))
//            cspec="0001";
//        else if(spec.equals("体积"))
//            cspec="0002";
//        else if(spec.equals("长度"))
//            cspec="0003";
//        System.out.println(ctype);
//        System.out.println(cspec);
//        System.out.println(id);
        return this.equipReportService.query(type,spec,id);
    }
}
