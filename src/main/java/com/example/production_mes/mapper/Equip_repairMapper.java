package com.example.production_mes.mapper;

import com.example.production_mes.pojo.equip_repair;
import com.example.production_mes.pojo.sys_log;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface Equip_repairMapper {


    @Select("SELECT * FROM equip_repair;")
    List<equip_repair > allequip_repair();


    @Select("SELECT * FROM equip_repair WHERE id=#{id};")
    equip_repair  equip_repairbyid(String id);

    @Insert("INSERT INTO equip_repair (id,mid,fault_type,fault_reason,fault_desc,fault_imgs,del_flag,remarks,create_by,create_date,update_by,update_date) VALUES(#{id},#{mid},#{fault_type},#{fault_reason},#{fault_desc},#{fault_imgs},#{del_flag},#{remarks},#{create_by},#{create_date},#{update_by},#{update_date})")
    void add(equip_repair equip_r);
}
