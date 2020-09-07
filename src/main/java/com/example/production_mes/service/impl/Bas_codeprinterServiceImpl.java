package com.example.production_mes.service.impl;

import com.example.production_mes.mapper.Bas_codeprinterMapper;
import com.example.production_mes.pojo.bas_codeprinter;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class Bas_codeprinterServiceImpl {




    @Autowired
    private Bas_codeprinterMapper bas_codeprinterMapper;

    public List<bas_codeprinter> all() {
        return bas_codeprinterMapper.all();
    }
    public bas_codeprinter byid(String id) {
        return bas_codeprinterMapper.byid(id);
    }


}
