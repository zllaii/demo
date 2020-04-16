package com.example.demo.service;

import com.example.demo.entity.Device;
import com.example.demo.entity.User;
import com.example.demo.entity.UserDevice;
import com.example.demo.mapper.DeviceMapper;
import com.example.demo.mapper.UserDeviceMapper;
import com.example.demo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service//声明为服务
public class UserDeviceService {

    @Autowired  //注入userMapper
    private UserMapper userMapper;
    @Autowired
    private DeviceMapper deviceMapper;
    @Autowired
    private UserDeviceMapper userDeviceMapper;

    //插入数据
    public String insert(String uid, String uname, String did, String dname){
        User user = new User(uid, uname);
        Device device = new Device(did, dname);
        UserDevice userDevice = new UserDevice(uid, did);
        userMapper.insert(user);
        deviceMapper.insert(device);
        userDeviceMapper.insert(userDevice);
        return "-----INSERT SUCCESS!-----";
    }

    //删除数据
    public String delete(String uid){
        userMapper.delete(uid);
        userDeviceMapper.delete(uid);
        return "-----DELETE SUCCESS!-----";
    }

    public List<User> selectUser(String uid){
        return userMapper.select(uid);
    }

    public List<User> selectUserAll(){
        return userMapper.selectAll();
    }

    public List<Device> selectDevice(String uid){
        return deviceMapper.select(uid);
    }

    public List<Device> selectDeviceAll(){
        return deviceMapper.selectAll();
    }

    public List<UserDevice> selectUserDevice(String uid){
        return userDeviceMapper.select(uid);
    }
    public List<UserDevice> selectUserDeviceAll(){
        return userDeviceMapper.selectAll();
    }
}
