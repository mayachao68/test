package com.bawie.service;

import com.bawie.entity.User;
import com.bawie.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper mapper;
    public List<User> findAll() {
        return mapper.selectAll();
    }
}
