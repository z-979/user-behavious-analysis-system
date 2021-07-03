package com.zhou.controller;

import com.zhou.mapper.RealMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
public class RealController {

    @Autowired
    RealMapper realMapper;

    @RequestMapping("/realtime")
    public String getData(@RequestBody Map map){
        Integer id=(Integer)map.get("id");
//        System.out.println(realMapper.getData(id));
       return realMapper.getData(id);
    }
}
