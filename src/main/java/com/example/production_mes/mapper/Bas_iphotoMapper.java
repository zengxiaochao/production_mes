package com.example.production_mes.mapper;

import com.example.production_mes.pojo.bas_iphoto;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Bas_iphotoMapper {


    @Select("SELECT * FROM bas_iphoto;")
    List<bas_iphoto> all();


    @Select("SELECT * FROM bas_iphoto WHERE id=#{id};")
    bas_iphoto byid(String id);
}
