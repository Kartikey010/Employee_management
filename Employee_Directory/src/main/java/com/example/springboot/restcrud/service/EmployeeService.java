package com.example.springboot.restcrud.service;

import java.util.List;

import com.example.springboot.restcrud.entity.Employee;

public interface EmployeeService {

    List<Employee> findAll();
    Employee findById(int id);

    Employee save(Employee employee);

    void deleteById(int id);
}
