package com.example.production_mes.service;

import com.example.production_mes.pojo.bas_codeprinter;

import java.util.List;

public interface Bas_codeprinterService {
    List<bas_codeprinter> all();

    bas_codeprinter byid(String id);
}
