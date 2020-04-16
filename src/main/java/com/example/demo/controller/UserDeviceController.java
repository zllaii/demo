package com.example.demo.controller;

import com.example.demo.entity.Device;
import com.example.demo.entity.User;
import com.example.demo.entity.UserDevice;
import com.example.demo.service.UserDeviceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController //声明为一个Restful的Controller
public class UserDeviceController {

    @Autowired  //注入userService
    private UserDeviceService userDeviceService;

    //插入数据
    @RequestMapping(value = "/insert")
    public String insert(String uid, String uname, String did, String dname){
        return userDeviceService.insert(uid, uname, did, dname);
    }

    //删除数据
    @RequestMapping(value = "/delete")
    public String delete(String uid){
        return userDeviceService.delete(uid);
    }

    //查找UserDevice
    @RequestMapping(value = "/select")
    public List<UserDevice> select(String uid){
        return userDeviceService.selectUserDevice(uid);
    }

    //查找UserDeviceAll
    @RequestMapping(value = "/selectAll")
    public List<UserDevice> selectAll(){
        return userDeviceService.selectUserDeviceAll();
    }

    //查找User
    @RequestMapping(value = "/selectU")
    public List<User> selectU(String uid){
        return userDeviceService.selectUser(uid);
    }

    //查找UserAll
    @RequestMapping(value = "/selectUAll")
    public List<User> selectUAll(){
        return userDeviceService.selectUserAll();
    }

    //查找Device
    @RequestMapping(value = "/selectD")
    public List<Device> selectD(String did){
        return userDeviceService.selectDevice(did);
    }

    //查找UserDeviceAll
    @RequestMapping(value = "/selectDAll")
    public List<Device> selectDAll(){
        return userDeviceService.selectDeviceAll();
    }
}
