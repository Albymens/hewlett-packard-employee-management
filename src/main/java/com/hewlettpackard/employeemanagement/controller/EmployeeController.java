package com.hewlettpackard.employeemanagement.controller;

import com.hewlettpackard.employeemanagement.model.Employee;
import com.hewlettpackard.employeemanagement.model.Employees;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class EmployeeController {

    Employees employees = new Employees();

    @GetMapping("/employees")
    public Map<String, List<Employee>> listEmployees(){
        return employees.ListOfEmployees();
    }
}
