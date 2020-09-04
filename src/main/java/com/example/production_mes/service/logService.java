package com.example.production_mes.service;

import com.example.production_mes.pojo.sys_log;
import org.springframework.stereotype.Service;

import java.util.List;



public interface logService {
    List<sys_log> selectAllLogs();
    sys_log findlog(String id);
}
