package com.jk.service;

import com.jk.pojo.UserBean;

import java.util.List;
import java.util.Optional;


public interface UserService {
    void add(UserBean user);

    List<UserBean> query();

    void del(Integer id);

    Optional<UserBean> queryUserById(Integer id);

    List<UserBean> query2(UserBean user);
}
