package com.example.production_mes.service.impl;

import com.example.production_mes.mapper.logMapper;
import com.example.production_mes.pojo.sys_log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class logServiceImpl implements com.example.production_mes.service.logService {
    @Autowired
    private logMapper logmapper;



    @Override
    public List<sys_log> selectAllLogs() {
        return logmapper.allLogs();
    }
    @Override
    public sys_log findlog(String id) {
        return logmapper.log(id);
    }
}
