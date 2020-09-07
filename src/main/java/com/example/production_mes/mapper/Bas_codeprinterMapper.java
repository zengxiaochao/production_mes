package com.example.production_mes.mapper;

import com.example.production_mes.pojo.bas_codeprinter;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Bas_codeprinterMapper {



    @Select("SELECT * FROM bas_codeprinter;")
    List<bas_codeprinter> all();


    @Select("SELECT * FROM bas_codeprinter WHERE id=#{id};")
    bas_codeprinter byid(String id);
}
