package com.example.springboot.service;

import com.example.springboot.entity.User;

public interface UserService {
    User selectByPrimaryKey(Integer id);

}
