package com.zhou.controller;

import com.zhou.entity.User;
import com.zhou.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
public class UserController {

    @Autowired
    UserMapper userMapper;

    @RequestMapping("/users")
    public List<User> getAll(){
        return userMapper.getAll();
    }
    
    @PostMapping("/users/add")
    public boolean addUser(@RequestBody User user){
        return userMapper.addUser(user);
    }

    @PostMapping("/users/login")
    public String getPwdByName(@RequestBody Map map){
        String name=(String)map.get("name");
//        System.out.println(name);
        return userMapper.getPwdByName(name);
    }

}
