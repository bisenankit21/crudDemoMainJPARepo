package com.example.springboot.crudDemoMainJPARepo.JPARepository;

import com.example.springboot.crudDemoMainJPARepo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
