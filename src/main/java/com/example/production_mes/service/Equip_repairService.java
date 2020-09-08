package com.example.production_mes.service;
import com.example.production_mes.pojo.equip_repair;
import org.springframework.stereotype.Service;

import java.util.List;


public interface Equip_repairService {

    List<equip_repair> all();
    equip_repair byid(String id);

    String add(equip_repair equip_r);
}
