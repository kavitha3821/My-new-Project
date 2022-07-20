package com.example.EmployeesCrud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.EmployeesCrud.domain.Employees;

@Repository
public interface EmployeesRepository extends JpaRepository<Employees, Long>{
	
	
}