package com.example.production_mes.service;

import com.example.production_mes.pojo.sys_user;

import java.util.List;

public interface Sys_userService {
    List<sys_user> selectAllLogs();

    sys_user login(String login_name);
}
