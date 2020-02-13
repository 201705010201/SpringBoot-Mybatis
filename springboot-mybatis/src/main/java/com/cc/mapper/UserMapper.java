package com.cc.mapper;

import com.cc.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

//@Mapper : 表示本类是一个 MyBatis 的 Mapper，等价于以前 Spring 整合 MyBatis 时的 Mapper 接口
@Mapper
@Repository
public interface UserMapper {
    //选择全部用户
    List<User> selectAllUser();

    //根据id选择用户
    User selectUserById(int id);

    //增加用户
    int addUser(User user);

    //修改用户
    int updateUser(User user);

    //删除用户
    int deleteUser(int id);

}
