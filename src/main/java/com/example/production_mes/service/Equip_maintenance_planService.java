package com.example.production_mes.service;

import com.example.production_mes.pojo.equip_maintenance_plan;

import java.util.List;



public interface Equip_maintenance_planService {


    List<equip_maintenance_plan> all();
    equip_maintenance_plan byid(String id);
}
