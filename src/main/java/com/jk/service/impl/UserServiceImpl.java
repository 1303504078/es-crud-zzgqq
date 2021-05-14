package com.jk.service.impl;

import com.jk.dao.EsDao;
import com.jk.pojo.UserBean;
import com.jk.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private EsDao esDao;
    @Autowired
    private ElasticsearchRepository estm;

    public void add(UserBean user) {
        esDao.save(user);
    }

    @Override
    public List<UserBean> query() {
        Iterable<UserBean> all = esDao.findAll();
        Iterator< UserBean > iterator = all.iterator();
        List< UserBean > list = new ArrayList< UserBean >();
        while ( iterator.hasNext() ){
            list.add( iterator.next() );
        }
        return list;
    }

    @Override
    public void del(Integer id) {
        esDao.deleteById( id );
    }

    @Override
    public Optional<UserBean> queryUserById(Integer id) {
        Optional<UserBean> byId = esDao.findById(id);
        return byId;
    }

    @Override
    public List<UserBean> query2(UserBean user) {
        return null;
    }
}
