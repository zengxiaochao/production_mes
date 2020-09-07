package com.example.production_mes.mapper;


import com.example.production_mes.pojo.equip_maintenance_plan;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Equip_maintenance_planMapper {

    @Select("SELECT * FROM equip_maintenance_plan;")
    List<equip_maintenance_plan> allequip_maintenance_plan();


    @Select("SELECT * FROM equip_maintenance_plan WHERE id=#{id};")
    equip_maintenance_plan byidequip_maintenance_plan(String id);

    @Insert("INSERT INTO equip_maintenance_plan (id,equip_type,maintenance,cycle,warn_time,user_name,user_id,del_flag,remarks,create_by,update_by,create_date,update_date) VALUES(#{id},#{equip_type},#{maintenance},#{cycle},#{warn_time},#{user_name},#{user_id},#{del_flag},#{remarks},#{create_by},#{update_by},#{create_date},#{update_date})")
    void add(equip_maintenance_plan equip_maintenance_p);
}
