package com.example.druid.dao;

import com.example.druid.bean.*;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author xiaolong
 * @create 2020-07-13 16:24
 * @description
 */
@Mapper
@Repository
public interface LoginMapper {

    @Select("select * from login")
    List<Login> findall();
}
