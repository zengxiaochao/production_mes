package com.example.production_mes.controller;

import com.example.production_mes.service.BasBomService;
import com.example.production_mes.utils.RedisUtil;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;


@RestController
@RequestMapping("radis")
public class RadisController {


    @Resource
    private RedisUtil redisUtil;

    @RequestMapping("get")
    public Object redisget(String key){
        return redisUtil.get(key);
    }
}