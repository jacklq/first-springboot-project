package com.lqstudy.test.service.impl;

import com.lqstudy.test.dao.UserDao;
import com.lqstudy.test.entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl {

    @Autowired
    private UserDao userDao ;

    public UserEntity getById(Integer id){
        return userDao.getById(id);
    }

    public UserEntity getByFirstName(String name){
        return userDao.getByFirstName(name);
    }
}
