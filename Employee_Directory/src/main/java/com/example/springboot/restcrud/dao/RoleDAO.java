package com.example.springboot.restcrud.dao;

import com.example.springboot.restcrud.entity.Role;

public interface RoleDAO {

    public Role findRoleByName(String roleName);

}
