package com.abhi.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.abhi.springboot.model.Employee;

@Repository
public interface Employeerepository extends JpaRepository<Employee, Long>  {

}
