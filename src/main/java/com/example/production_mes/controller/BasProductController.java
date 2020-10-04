package com.example.production_mes.controller;

import com.example.production_mes.dto.Result;
import com.example.production_mes.entity.BasProduct;
import com.example.production_mes.entity.EquipFaultReport;
import com.example.production_mes.entity.EquipRepair;
import com.example.production_mes.service.BasProductService;
import com.example.production_mes.utils.IDGenerator;
import com.example.production_mes.utils.TimeUtils;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.sql.Time;
import java.util.HashMap;
import java.util.List;

/**
 * (BasProduct)表控制层
 *
 * @author makejava
 * @since 2020-09-16 09:09:29
 */
@RestController
@RequestMapping("basProduct")
public class BasProductController {
    /**
     * 服务对象
     */
    @Resource
    private BasProductService basProductService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public BasProduct selectOne(String id) {
        return this.basProductService.queryById(id);
    }



    @GetMapping("selectAll")
    public List<BasProduct> selectAll() {

        /**
         *
         *
         * @description: 分页查询
         * @param 上界与下界
         * @return: java.util.List<com.example.production_mes.entity.BasProduct>
         * @author: weizhipeng
         * @time: 2020/9/29 上午10:01
         */
        return this.basProductService.queryAllByLimit(0,10);



    }

    @RequestMapping(value="/edit")
    public Result edit(@RequestBody HashMap<String, String> map
    ) {

        BasProduct basProduct = new BasProduct();
        basProduct.setId(map.get("id"));
        basProduct.setProductname(map.get("productname"));
        basProduct.setFirstcheck(map.get("firstcheck"));
        basProduct.setCreateBy(map.get("creatby"));
        basProduct.setLotnumber(map.get("lotnumber"));
        basProduct.setFlowId(map.get("flowid"));
        basProduct.setProductabbr(map.get("productabbr"));
        basProduct.setManageway(map.get("manageway"));

        System.out.println(map.get("firstcheck"));

        basProductService.update(basProduct);
        return Result.success("修改成功");

    }

    @GetMapping("deleteById")
    public Result deleteById(String id) {

        basProductService.deleteById(id);
        return Result.success("删除成功");
    }
    @RequestMapping(value="/add")
    public Result add(@RequestBody HashMap<String, String> map
    ) {

        BasProduct basProduct = new BasProduct();
        basProduct.setId(IDGenerator.generateUUID());
        basProduct.setProductname(map.get("productname"));
        basProduct.setFirstcheck(map.get("firstcheck"));
        basProduct.setCreateBy(map.get("creatby"));
        basProduct.setLotnumber(map.get("lotnumber"));
        basProduct.setFlowId(map.get("flowid"));
        basProduct.setProductabbr(map.get("productabbr"));
        basProduct.setManageway(map.get("manageway"));
        basProduct.setCreateBy(map.get("reportPerson"));
        basProduct.setUpdateBy(map.get("reportPerson"));
        basProduct.setUpdateDate(TimeUtils.StringToDate(TimeUtils.NowTime()));
        basProduct.setCreateDate(TimeUtils.StringToDate(TimeUtils.NowTime()));
        basProduct.setDelFlag("0");
        basProduct.setId(IDGenerator.generateUUID());
        System.out.println(IDGenerator.generateUUID());
        basProductService.insert(basProduct);

        return Result.success("添加成功");
    }





}