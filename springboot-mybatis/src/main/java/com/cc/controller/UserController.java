package com.cc.controller;

import com.cc.mapper.UserMapper;
import com.cc.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserMapper userMapper;

    //选择全部用户
    @GetMapping("/selectUser")
    public String selectAllUser(){
        List<User> users = userMapper.selectAllUser();

        for (User user : users) {
            System.out.println(user);
        }
        return "users";
    }

    //根据id选择用户
    @GetMapping("/selectUserById")
    public String selectUserById(){
        User user = userMapper.selectUserById(1);
        System.out.println(user);
        return "ok";
    }

    //添加一个用户
    @GetMapping("/addUser")
    public String addUser(){
        userMapper.addUser(new User(4,"moon","123"));
        return "ok";
    }

    //修改一个用户
    @GetMapping("/updateUser")
    public String updateUser(){
        userMapper.updateUser(new User(4,"小花","123"));
        return "ok";
    }

    //根据id删除用户
    @GetMapping("/deleteUser")
    public String deleteUser(){
        userMapper.deleteUser(3);
        return "ok";
    }
}
