package com.example.production_mes.service.impl;


import com.example.production_mes.mapper.Equip_fault_reportMapper;
import com.example.production_mes.pojo.equip_fault_report;
import com.example.production_mes.service.Equip_fault_reportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Equip_fault_reportServiceImpl implements Equip_fault_reportService {
    @Autowired
    private Equip_fault_reportMapper equip_fault_reportMapper;


    @Override
    public List<equip_fault_report> all() {
        return equip_fault_reportMapper.allequip_fault_report();
    }

    @Override
    public equip_fault_report byid(String id) {
        return equip_fault_reportMapper.equip_fault_reportbyid(id);
    }
}
