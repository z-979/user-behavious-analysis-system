package com.zhou.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface RealMapper {

    //查询数据
    public String getData(Integer id);
}
