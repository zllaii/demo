package com.example.demo.mapper;

import com.example.demo.entity.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper//声明UserMapper为一个Mapper接口
public interface UserMapper {

    @Insert("insert ignore into user(uid, uname) values(#{uid}, #{uname})")
    void insert(User user);

    @Delete("delete from user where uid = #{uid}")
    void delete(String uid);

    @Select("select * from user where uid = #{uid}")
    List<User> select(String uid);

    @Select("select * from user")
    List<User> selectAll();
}
