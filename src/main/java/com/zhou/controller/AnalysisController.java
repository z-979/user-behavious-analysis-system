package com.zhou.controller;

import com.zhou.entity.Analysis;
import com.zhou.mapper.AnalysisMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class AnalysisController {
    @Autowired
    AnalysisMapper analysisMapper;

    @RequestMapping("/analysis")
    public List<Analysis> getAllByTime(@RequestBody Map map)
    {
        Integer time=(Integer)map.get("time");
//        System.out.println(time);
//        System.out.println(appMapper.getAllByClass(time));
        return analysisMapper.getAllByTime(time);
    }

}
