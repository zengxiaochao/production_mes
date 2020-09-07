package com.example.production_mes.mapper;

import com.example.production_mes.pojo.bas_pad;
import com.example.production_mes.pojo.equip_fault_report;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Bas_padMapper {

    @Select("SELECT * FROM bas_pad;")
    List<bas_pad> all();


    @Select("SELECT * FROM bas_pad WHERE id=#{id};")
    bas_pad byid(String id);
}
