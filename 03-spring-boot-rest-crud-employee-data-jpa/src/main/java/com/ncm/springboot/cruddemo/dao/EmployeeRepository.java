package com.ncm.springboot.cruddemo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ncm.springboot.cruddemo.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

     //! The Spring Data JPA handdles all of the CRUD Methods for us

     // just want to sort the data by last name
     public List<Employee> findAllByOrderByLastNameAsc();
}
