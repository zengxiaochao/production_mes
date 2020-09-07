package com.example.production_mes.mapper;

import com.example.production_mes.pojo.bas_electronsteelyard;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Bas_electronsteelyardMapper {



    @Select("SELECT * FROM bas_electronsteelyard;")
    List<bas_electronsteelyard> all();


    @Select("SELECT * FROM bas_electronsteelyard WHERE id=#{id};")
    bas_electronsteelyard byid(String id);
}
