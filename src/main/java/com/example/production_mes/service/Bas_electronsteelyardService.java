package com.example.production_mes.service;

import com.example.production_mes.pojo.bas_electronsteelyard;

import java.util.List;

public interface Bas_electronsteelyardService {
    List<bas_electronsteelyard> all();

    bas_electronsteelyard byid(String id);
}
