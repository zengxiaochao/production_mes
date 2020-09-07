package com.example.production_mes.service.impl;

import com.example.production_mes.mapper.Bas_cardreaderMapper;
import com.example.production_mes.mapper.logMapper;
import com.example.production_mes.pojo.bas_cardreader;
import com.example.production_mes.pojo.equip_fault_report;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Bas_cardreaderServiceImpl implements com.example.production_mes.service.Bas_cardreaderService {
    @Autowired
    private Bas_cardreaderMapper bas_cardreaderMapper;

    @Override
    public List<bas_cardreader> all() {
        return bas_cardreaderMapper.all();
    }
    @Override
    public bas_cardreader byid(String id) {
        return bas_cardreaderMapper.byid(id);
    }


}

