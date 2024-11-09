package com.example.springboot.restcrud.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.example.springboot.restcrud.entity.User;

public interface UserService extends UserDetailsService {

    public User findByUserName(String userName);

}
