package com.hewlettpackard.employeemanagement.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Employees {
    public Map<String, List<Employee>> ListOfEmployees(){
        Map<String, List<Employee>> employees = new HashMap<>();
        List<Employee> employeeList = new ArrayList<>();

        Employee employee1 = new Employee();
        employee1.setEmployee_id("1");
        employee1.setFirst_name("Alby");
        employee1.setLast_name("Mens");
        employee1.setEmail("alb@gmail.com");
        employee1.setTitle("Finance Lead");

        Employee employee2 = new Employee();
        employee2.setEmployee_id("2");
        employee2.setFirst_name("Geo");
        employee2.setLast_name("Mens");
        employee2.setEmail("geo@gmail.com");
        employee2.setTitle("Technical Lead");

        employeeList.add(employee1);
        employeeList.add(employee2);

        employees.put("Employees", employeeList);
        return employees;
    }
}
