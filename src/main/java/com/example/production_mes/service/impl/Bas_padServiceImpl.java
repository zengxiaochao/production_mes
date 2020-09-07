package com.example.production_mes.service.impl;

import com.example.production_mes.mapper.Bas_padMapper;
import com.example.production_mes.pojo.bas_pad;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class Bas_padServiceImpl implements com.example.production_mes.service.Bas_padService {



    @Autowired
    private Bas_padMapper bas_padMapper;

    @Override
    public List<bas_pad> all() {
        return bas_padMapper.all();
    }
    @Override
    public bas_pad byid(String id) {
        return bas_padMapper.byid(id);
    }


}
