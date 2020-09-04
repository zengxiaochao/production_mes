package com.example.production_mes.mapper;

import com.example.production_mes.pojo.sys_log;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface logMapper {
    @Select("SELECT * FROM sys_log;")
    List<sys_log> allLogs();


    @Select("SELECT * FROM sys_log WHERE id=#{id};")
    sys_log log(String id);
}
