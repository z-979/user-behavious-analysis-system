package com.zhou.controller;


import com.zhou.entity.App;
import com.zhou.mapper.AppMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class AppController {

    @Autowired
    AppMapper appMapper;

    @RequestMapping("/app")
    public List<App> getAllByClass(@RequestBody Map map)
    {
        Integer time=(Integer)map.get("time");
//        System.out.println(time);
//        System.out.println(appMapper.getAllByClass(time));
        return appMapper.getAllByClass(time);
    }


}
