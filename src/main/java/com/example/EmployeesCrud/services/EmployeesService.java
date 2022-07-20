package com.example.EmployeesCrud.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.EmployeesCrud.domain.Employees;
import com.example.EmployeesCrud.repository.EmployeesRepository;

@Service
public class EmployeesService {
	@Autowired
    private EmployeesRepository repo;
	
	public List<Employees> listAll() {
//        List<Employees> findAll = (List<Employees>) repo.findAll();
        return repo.findAll();
        
    }
     
    public void save(Employees emp) {
        repo.save(emp);
    }
     
    public Employees get(long id) {
       return repo.findById(id).get();
    }
     
    public void delete(long id) {
        repo.deleteById(id);
    }
}

	