package com.hewlettpackard.employeemanagement;

import com.hewlettpackard.employeemanagement.model.Employees;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EmployeeManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeManagementApplication.class, args);
		Employees employees = new Employees();
		System.out.println(employees.ListOfEmployees().toString());
	}

}
