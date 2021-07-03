package com.zhou.mapper;

import com.zhou.entity.App;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface AppMapper {

    //查询所有信息
    public List<App> getAllByClass(Integer time);
}
