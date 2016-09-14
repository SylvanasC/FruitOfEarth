package com.sylvanas.foe.modules.fru.service;

import com.sylvanas.foe.modules.fru.dao.UserDao;
import com.sylvanas.foe.modules.fru.entity.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by chenyong on 2016/9/13.
 */
@Service
public class UserService{

    @Resource
    private UserDao userDao;

    public User getUserById(int userId) {
        return userDao.selectByPrimaryKey(userId);
    }
}
