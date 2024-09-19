package com.ncm.springboot.cruddemo.service;

import java.util.List;

import com.ncm.springboot.cruddemo.entity.Employee;

public interface EmployeeService {
    
    List<Employee> findAll();

    Employee findById(int theId);

    Employee save(Employee thEmployee);

    public void deleteById(int theId);
    
}
