package com.example.production_mes.service.impl;

import com.example.production_mes.mapper.Bas_electronsteelyardMapper;
import com.example.production_mes.pojo.bas_electronsteelyard;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class Bas_electronsteelyardServiceImpl implements com.example.production_mes.service.Bas_electronsteelyardService {




    @Autowired
    private Bas_electronsteelyardMapper bas_electronsteelyardMapper;

    @Override
    public List<bas_electronsteelyard> all() {
        return bas_electronsteelyardMapper.all();
    }
    @Override
    public bas_electronsteelyard byid(String id) {
        return bas_electronsteelyardMapper.byid(id);
    }


}
