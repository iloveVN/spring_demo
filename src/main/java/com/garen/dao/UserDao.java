package com.garen.dao;

import com.garen.domain.BaseQueryVo;
import com.garen.domain.User;

import java.util.List;

/**
 * DAO接口， mybatis动态实现impl
 */
public interface UserDao {

    public List<User> findAllUser(BaseQueryVo<User> baseQueryVo) throws Exception;

    void saveUser(User user) throws Exception;

}
