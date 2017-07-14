package com.lugi.demo.service;

import com.lugi.common.service.GenericService;
import com.lugi.demo.model.User;
import com.lugi.demo.model.UserCriteria;

/**
 * Created by fengcs on 2017/7/14.
 */
public interface UserService extends GenericService<User, UserCriteria, Integer> {

    User findByName(String name);

}
