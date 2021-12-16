package com.example.employee;


import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {

    private List<Employee> employees = new ArrayList();

    public Employee addEmployee(String firstname, String lastname) {
        Employee employee = new Employee(firstname, lastname);
        employees.add(employee);
        return employee;
    }
    public Employee deleteEmployee(String firstname, String lastname) {
        Employee employee = new Employee(firstname, lastname);
        if (employees.contains(employee)) {
            employees.remove(employee);
            return employee;
        } else {
            throw new EmployeeNotFindException();
        }
    }

    public Employee findEmployee (String firstname, String lastname){
        Employee employee = new Employee(firstname, lastname);
        if (employees.contains(employee)) {
            return employee;
        } else {
            throw new EmployeeNotFindException();
        }
    }

    public List<Employee> print() {
        return employees;
    }
}
