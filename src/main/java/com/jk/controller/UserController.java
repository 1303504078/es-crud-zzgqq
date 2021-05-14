package com.jk.controller;

import com.jk.pojo.UserBean;
import com.jk.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("zzg")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("add")
    private void add(UserBean user){
          userService.add(user);
    }
    @RequestMapping("query")
    private List<UserBean> query(){
     return   userService.query();
    }
    @RequestMapping("del")
    private void del(Integer id){
        userService.del(id);
    }
    @RequestMapping("queryUserById")
    private Optional<UserBean> queryUserById(Integer id){
        return  userService.queryUserById(id);
    }

    @RequestMapping("query2")
    private List<UserBean> query2(UserBean user){
        return   userService.query2(user);
    }

}
