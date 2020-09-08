package com.example.production_mes.mapper;


import com.example.production_mes.pojo.equip_fault_report;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Equip_fault_reportMapper {



    @Select("SELECT * FROM equip_fault_report;")
    List<equip_fault_report> allequip_fault_report();


    @Select("SELECT * FROM equip_fault_report WHERE id=#{id};")
    equip_fault_report equip_fault_reportbyid(String id);

    @Insert("INSERT INTO equip_fault_report (id,equip_id,equip_no,equip_type,equip_loc,fault_desc,status,report_person,assign_time,maintenance_worker,del_flag,remarks,create_by,create_date,update_by,update_date) VALUES(#{id},#{equip_id},#{equip_no},#{equip_type},#{equip_loc},#{fault_desc},#{status},#{report_person},#{assign_time},#{maintenance_worker},#{del_flag},#{remarks},#{create_by},#{create_date},#{update_by},#{update_date})")
    void add(equip_fault_report equip_fault_r);
}
