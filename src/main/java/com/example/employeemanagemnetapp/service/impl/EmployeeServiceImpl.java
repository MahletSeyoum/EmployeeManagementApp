package com.example.employeemanagemnetapp.service.impl;

import com.example.employeemanagemnetapp.domain.Employee;
import com.example.employeemanagemnetapp.repository.EmployeeRepository;
import com.example.employeemanagemnetapp.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;

    @Override
    public Employee viewEmployeeById(String id) {
        return employeeRepository.findById(id).get();
    }

    @Override
    public List<Employee> viewAllEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee addEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public void deleteEmployee(String id) {
        employeeRepository.deleteById(id);
    }

    @Override
    public Employee updateEmployee(String id, Employee employee) {
        if(employeeRepository.findById(id).isPresent()){
            employee.setId(id);
            employeeRepository.save(employee);
        }
        return employeeRepository.save(employee);
    }
}
