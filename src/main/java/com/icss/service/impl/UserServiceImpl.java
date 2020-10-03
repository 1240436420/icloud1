package com.icss.service.impl;

import com.icss.domain.User;
import com.icss.mapper.UserMapper;
import com.icss.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    // @Transactional(readOnly = true)
    @Override
    public List<User> findAll() {
        return userMapper.selectAll();
    }

    @Override
    public boolean insertUser(User user) {
       return userMapper.insert(user)>0?true:false;
    }


}