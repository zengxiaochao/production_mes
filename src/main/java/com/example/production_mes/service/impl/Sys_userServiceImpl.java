package com.example.production_mes.service.impl;

import com.example.production_mes.mapper.Sys_userMapper;
import com.example.production_mes.mapper.logMapper;
import com.example.production_mes.pojo.sys_log;
import com.example.production_mes.pojo.sys_user;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Sys_userServiceImpl implements com.example.production_mes.service.Sys_userService {



    @Autowired
    private Sys_userMapper sys_userMapper;



    @Override
    public List<sys_user> selectAllLogs() {
        return sys_userMapper.all();
    }
    @Override
    public sys_user login(String login_name) {
        return sys_userMapper.login(login_name);
    }



}
