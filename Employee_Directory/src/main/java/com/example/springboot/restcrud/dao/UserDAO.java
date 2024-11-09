package com.example.springboot.restcrud.dao;


import com.example.springboot.restcrud.entity.User;

public interface UserDAO {

    public User findByUserName(String userName);

}
