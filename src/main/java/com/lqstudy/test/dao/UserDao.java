package com.lqstudy.test.dao;

import com.lqstudy.test.entity.UserEntity;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserDao {

    UserEntity getById(Integer id);
    UserEntity getByFirstName(String firstName);

}
