package com.example.production_mes.service;

import com.example.production_mes.pojo.bas_iphoto;

import java.util.List;

public interface Bas_iphotoSerice {
    List<bas_iphoto> all();

    bas_iphoto byid(String id);
}
