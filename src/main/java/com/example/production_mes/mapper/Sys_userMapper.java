package com.example.production_mes.mapper;


import com.example.production_mes.pojo.sys_log;
import com.example.production_mes.pojo.sys_user;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Sys_userMapper {


    @Select("SELECT * FROM sys_user;")
    List<sys_user> all();


    @Select("SELECT * FROM sys_user WHERE login_name=#{login_name};")
    sys_user login(String login_name);

}
