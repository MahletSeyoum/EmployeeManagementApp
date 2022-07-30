package com.example.employeemanagemnetapp.controller;

import com.example.employeemanagemnetapp.domain.Employee;
import com.example.employeemanagemnetapp.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    @GetMapping(name = "/")
    public ResponseEntity<?> viewAllEmployees(){
        List<Employee> employees= employeeService.viewAllEmployees();
        return ResponseEntity.ok(employees);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> viewEmployeesById(@PathVariable String id){
       Employee employee= employeeService.viewEmployeeById(id);
       return ResponseEntity.ok(employee);
    }

    @GetMapping()
    public ResponseEntity<?>
}
