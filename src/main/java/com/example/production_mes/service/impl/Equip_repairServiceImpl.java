package com.example.production_mes.service.impl;

import com.example.production_mes.mapper.Equip_repairMapper;
import com.example.production_mes.pojo.equip_repair;
import com.example.production_mes.service.Equip_repairService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Equip_repairServiceImpl implements Equip_repairService {

    @Autowired
    private Equip_repairMapper equip_repairMapper;


    @Override
    public List<equip_repair> all() {
        return equip_repairMapper.allequip_repair();
    }

    @Override
    public equip_repair byid(String id) {
        return equip_repairMapper.equip_repairbyid(id);
    }
}
