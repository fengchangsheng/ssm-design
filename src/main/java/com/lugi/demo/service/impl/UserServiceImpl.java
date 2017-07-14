package com.lugi.demo.service.impl;

import com.lugi.common.service.impl.GenericServiceImpl;
import com.lugi.demo.dao.UserMapper;
import com.lugi.demo.model.User;
import com.lugi.demo.model.UserCriteria;
import com.lugi.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

/**
 * Created by fengcs on 2017/7/14.
 */
@SuppressWarnings("serial")
@Service("userService")
public class UserServiceImpl extends GenericServiceImpl<User,UserCriteria,Integer> implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public void afterPropertiesSet() throws Exception {
        Assert.notNull(this.userMapper, "Property 'leaseHouseMapper' is required");
        this.setAbstractMapperDao(userMapper);
    }

    @Override
    public User findByName(String name) {
        return userMapper.findByName(name);
    }
}
