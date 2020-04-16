package com.example.demo.mapper;

import com.example.demo.entity.Device;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface DeviceMapper {

    @Insert("insert ignore into device(did, dname) values(#{did}, #{dname})")
    void insert(Device device);

    @Delete("delete from device where did = #{did}")
    void delete(String did);

    @Select("select * from device where did = #{did}")
    List<Device> select(String did);

    @Select("select * from device")
    List<Device> selectAll();
}
