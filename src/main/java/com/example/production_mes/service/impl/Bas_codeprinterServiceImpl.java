package com.example.production_mes.service.impl;

import com.example.production_mes.mapper.Bas_codeprinterMapper;
import com.example.production_mes.pojo.bas_codeprinter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Bas_codeprinterServiceImpl implements com.example.production_mes.service.Bas_codeprinterService {




    @Autowired
    private Bas_codeprinterMapper bas_codeprinterMapper;

    @Override
    public List<bas_codeprinter> all() {
        return bas_codeprinterMapper.all();
    }
    @Override
    public bas_codeprinter byid(String id) {
        return bas_codeprinterMapper.byid(id);
    }


}
