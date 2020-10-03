package com.icss.service;

import com.icss.domain.User;

import java.util.List;

public interface UserService {
    List<User> findAll();
   boolean insertUser(User user);

}