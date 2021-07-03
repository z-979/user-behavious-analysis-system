package com.zhou.mapper;

import com.zhou.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface UserMapper {
    //增加一个用户
    public boolean addUser(User user);

    //通过用户名查询用户密码
    public String getPwdByName(String name);

    //查询用户
    public List<User> getAll();

}
