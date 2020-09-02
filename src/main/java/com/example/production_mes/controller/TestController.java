package com.example.production_mes.controller;
 
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;




@RequestMapping //是一个用来处理请求地址映射的注解，可用于类或方法上。用于类上，表示类中的所有响应请求的方法都是以该地址作为父路径
@RestController //用来返回Json
public class TestController {
    @RequestMapping("/testlogin")
    public String greeting(){
        return "354451354654134654";
    }
}