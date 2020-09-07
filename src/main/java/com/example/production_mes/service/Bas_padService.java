package com.example.production_mes.service;

import com.example.production_mes.pojo.bas_pad;

import java.util.List;

public interface Bas_padService {
    List<bas_pad> all();

    bas_pad byid(String id);
}
