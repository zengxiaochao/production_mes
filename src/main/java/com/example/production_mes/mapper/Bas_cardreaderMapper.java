package com.example.production_mes.mapper;

import com.example.production_mes.pojo.bas_cardreader;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Bas_cardreaderMapper {


    @Select("SELECT * FROM bas_cardreader;")
    List<bas_cardreader> all();


    @Select("SELECT * FROM bas_cardreader WHERE id=#{id};")
    bas_cardreader byid(String id);
}
