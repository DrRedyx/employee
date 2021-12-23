package com.example.employee;


import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private final Map <String, Employee> employees;

    public EmployeeServiceImpl() {
        employees = new HashMap<>();

    }

    @Override
    public Employee addEmployee(String firstname, String lastname) {
        String fullName = firstname + lastname;
        if (!employees.containsKey(fullName)) {
            Employee employee = new Employee(firstname, lastname);
            employees.put(fullName, employee);
            return employee;
        } else {
            throw new EmployeeIsAlreadyWorkException();
        }
    }
    @Override
    public Employee deleteEmployee(String firstname, String lastname) {
        String fullName = firstname + lastname;
        if (employees.containsKey(fullName)) {
            Employee employee = employees.get(fullName);
            employees.remove(fullName);
            return employee;
        } else {
            throw new EmployeeNotFindException();
        }
    }
    @Override
    public Employee findEmployee (String firstname, String lastname){
        String fullName = firstname + lastname;
        if (employees.containsKey(fullName)) {
            Employee employee = employees.get(fullName);
            return employee;
        } else {
            throw new EmployeeNotFindException();
        }
    }

    @Override
    public void printAllEmployee() {
        for (String name : employees.keySet()) {
            Employee employee = employees.get(name);
            System.out.println(employee);
        }
    }
}
