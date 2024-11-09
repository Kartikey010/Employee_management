package com.example.springboot.restcrud.service;

import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import com.example.springboot.restcrud.dao.EmployeeDAO;
import com.example.springboot.restcrud.entity.Employee;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    private EmployeeDAO employeeDAO;

    public EmployeeServiceImpl(EmployeeDAO employeeDAO) {
        this.employeeDAO = employeeDAO;
    }

    @Override
    public List<Employee> findAll() {
        return employeeDAO.findAll();
    }

    @Override
    public Employee findById(int id) {
        return employeeDAO.findById(id);
    }

    @Transactional
    @Override
    public Employee save(Employee employee) {
        Employee dbEmployee = employeeDAO.save(employee);
        return dbEmployee;
    }

    @Transactional
    @Override
    public void deleteById(int id) {
        employeeDAO.deleteById(id);
    }
}
