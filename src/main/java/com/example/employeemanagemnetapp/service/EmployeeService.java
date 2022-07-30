package com.example.employeemanagemnetapp.service;

import com.example.employeemanagemnetapp.domain.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

public interface EmployeeService {
    Employee viewEmployeeById(String id);
    List<Employee> viewAllEmployees();
    Employee addEmployee(Employee employee);
    void deleteEmployee(String id);
    Employee updateEmployee(String id, Employee employee);

}
