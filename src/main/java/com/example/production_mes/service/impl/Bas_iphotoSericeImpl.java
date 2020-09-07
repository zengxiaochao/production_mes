package com.example.production_mes.service.impl;

import com.example.production_mes.mapper.Bas_iphotoMapper;
import com.example.production_mes.pojo.bas_iphoto;
import com.example.production_mes.pojo.equip_fault_report;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class Bas_iphotoSericeImpl implements com.example.production_mes.service.Bas_iphotoSerice {


    @Autowired
    private Bas_iphotoMapper bas_iphotoMapper;

    @Override
    public List<bas_iphoto> all() {
        return bas_iphotoMapper.all();
    }
    @Override
    public bas_iphoto byid(String id) {
        return bas_iphotoMapper.byid(id);
    }


}
