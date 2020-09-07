package com.example.production_mes.service.impl;


import com.example.production_mes.mapper.Equip_maintenance_planMapper;
import com.example.production_mes.pojo.equip_maintenance_plan;
import com.example.production_mes.service.Equip_maintenance_planService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Equip_maintenance_planServiceImpl implements Equip_maintenance_planService {
    @Autowired
    private Equip_maintenance_planMapper equip_maintenance_planMapper;


    @Override
    public List<equip_maintenance_plan> all() {
        return equip_maintenance_planMapper.allequip_maintenance_plan();
    }

    @Override
    public equip_maintenance_plan byid(String id) {
        return equip_maintenance_planMapper.byidequip_maintenance_plan(id);
    }

    @Override
    public void add(equip_maintenance_plan equip_maintenance_p) {
        equip_maintenance_planMapper.add(equip_maintenance_p);
    }
}
