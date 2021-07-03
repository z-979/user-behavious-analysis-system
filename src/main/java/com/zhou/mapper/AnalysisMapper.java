package com.zhou.mapper;

import com.zhou.entity.Analysis;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface AnalysisMapper {

    //查询所有信息
    public List<Analysis> getAllByTime(Integer time);

}
