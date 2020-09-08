package com.example.production_mes.service;

import com.example.production_mes.pojo.equip_fault_report;

import java.util.List;



public interface Equip_fault_reportService {

    List<equip_fault_report> all();
    equip_fault_report byid(String id);

    void add(equip_fault_report equip_fault_r);
}
