package com.example.employee;


import java.util.Collection;
import java.util.List;

public interface EmployeeService {
    Employee addEmployee(String firstname, String lastname, int salary, int department);
    Employee deleteEmployee(String firstname, String lastname, int salary, int department);
    Employee findEmployee(String firstname, String lastname, int salary, int department);
    List<Employee> getAll();
}
