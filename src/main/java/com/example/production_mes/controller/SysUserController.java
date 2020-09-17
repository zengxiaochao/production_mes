package com.example.production_mes.controller;

import com.example.production_mes.dto.LoginDto;
import com.example.production_mes.dto.Result;
import com.example.production_mes.entity.SysUser;
import com.example.production_mes.service.SysUserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

import static com.example.production_mes.utils.Md5Utils.getMd5Code;

/**
 * 用户表(SysUser)表控制层
 *
 * @author makejava
 * @since 2020-09-16 09:09:52
 */
@RestController
@RequestMapping("sysUser")
public class SysUserController {
    /**
     * 服务对象
     */
    @Resource
    private SysUserService sysUserService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public SysUser selectOne(String id) {
        return this.sysUserService.queryById(id);
    }

    /**
     * 登陆
     * @param loginDto
     * @param response
     * @return
     */
    @PostMapping("login")
    public Result login(@RequestBody LoginDto loginDto, HttpServletResponse response) {

        SysUser sysUser = sysUserService.queryByLoginName(loginDto.getLogin_name());
        if (sysUser == null || !sysUser.getPassword().equals(getMd5Code(loginDto.getPassword()))) {
            return Result.error("账号或密码错误");
        }

        //根据用户id生成jwt
//        String jwt = jwtUtils.generateToken(sysUser.getId());
//        response.setHeader("Authorization", jwt);
//        response.setHeader("Access-control-Expose-Headers", "Authorization");
        //返回用户信息
        return Result.success("登录成功",sysUser);
    }
}