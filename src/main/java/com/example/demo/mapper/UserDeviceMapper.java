package com.example.demo.mapper;

import com.example.demo.entity.UserDevice;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserDeviceMapper {

    @Insert("insert into user_device(uuid, uid, did) values(uuid(), #{uid}, #{did})")
    void insert(UserDevice userDevice);

    @Delete("delete from user_device where uid = #{uid}")
    void delete(String uid);

    @Select("select * from user_device where uid = #{uid}")
    List<UserDevice> select(String uid);

    @Select("select * from user_device")
    List<UserDevice> selectAll();
}
