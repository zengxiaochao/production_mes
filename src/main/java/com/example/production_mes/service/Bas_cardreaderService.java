package com.example.production_mes.service;

import com.example.production_mes.pojo.bas_cardreader;

import java.util.List;

public interface Bas_cardreaderService {
    List<bas_cardreader> all();

    bas_cardreader byid(String id);
}
