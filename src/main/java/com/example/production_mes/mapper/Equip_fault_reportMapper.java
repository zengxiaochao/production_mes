package com.example.production_mes.mapper;


import com.example.production_mes.pojo.equip_fault_report;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Equip_fault_reportMapper {



    @Select("SELECT * FROM equip_fault_report;")
    List<equip_fault_report> allequip_fault_report();


    @Select("SELECT * FROM equip_fault_report WHERE id=#{id};")
    equip_fault_report equip_fault_reportbyid(String id);



}
