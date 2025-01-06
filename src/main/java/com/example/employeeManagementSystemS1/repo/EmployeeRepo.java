package com.example.employeeManagementSystemS1.repo;

import com.example.employeeManagementSystemS1.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo extends JpaRepository<Employee,Integer> {
    //we use integer because primary key is a integer
}
