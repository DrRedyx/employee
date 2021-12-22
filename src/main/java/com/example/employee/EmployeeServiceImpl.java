package com.example.employee;


import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private Integer num;
    private final Map <Integer, Employee> employees;

    public EmployeeServiceImpl() {
        employees = new HashMap<>();

    }

    @Override
    public Employee addEmployee(String firstname, String lastname) {
        Employee employee = new Employee(firstname, lastname);
        num = employees.size();
        employees.put(num, employee);
        num++;
        return employee;
    }
    @Override
    public Employee deleteEmployee(Integer num) {
        if (employees.containsKey(num)) {
            Employee employee = employees.get(num);
            employees.remove(num);
            return employee;
        } else {
            throw new EmployeeNotFindException();
        }
    }
    @Override
    public Employee findEmployee (Integer num){
        if (employees.containsKey(num)) {
            Employee employee = employees.get(num);
            return employee;
        } else {
            throw new EmployeeNotFindException();
        }
    }
}
