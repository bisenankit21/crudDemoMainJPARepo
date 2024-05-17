package com.example.springboot.crudDemoMainJPARepo.service;

import com.example.springboot.crudDemoMainJPARepo.JPARepository.EmployeeRepository;
import com.example.springboot.crudDemoMainJPARepo.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class EmployeeServiceImpl implements EmployeeService{

    private EmployeeRepository employeeRepository;
@Autowired
    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee findById(int id) {
        return employeeRepository.findById(id).orElse(null);
    }

    @Override
   // @Transactional   //since we are modefying the database we will use annnotation at service layer
    //no neeed to list Transactional annotation while working with JPA repo as JPA Repo will prpvide its functianlity

    public Employee save(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    @Transactional   //since we are modefying the database we will use annnotation at service layer
    public void deleteById(int id) {
        employeeRepository.deleteById(id);
    }
}
