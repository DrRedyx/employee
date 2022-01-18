package com.example.employee;


import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private final List<Employee> employees;

    public EmployeeServiceImpl() {
        employees = new ArrayList<>();

    }

    @Override
    public Employee addEmployee(String firstname, String lastname, int salary, int department) {
        Employee employee = new Employee(firstname, lastname, salary, department);
            if (!employees.contains(employee)) {
                employees.add(employee);
                return employee;
            } else {
                throw new EmployeeIsAlreadyWorkException();
            }
        }
    @Override
    public Employee deleteEmployee(String firstname, String lastname, int salary, int department) {
        Employee employee = new Employee(firstname, lastname, salary, department);
        if (!employees.contains(employee)) {
            employees.remove(employee);
            return employee;
        } else {
            throw new EmployeeNotFindException();
        }
    }
    @Override
    public Employee findEmployee (String firstname, String lastname, int salary, int department){
        Employee employee = new Employee(firstname, lastname, salary, department);
        if (!employees.contains(employee)) {
            return employee;
        } else {
            throw new EmployeeNotFindException();
        }
    }

    @Override
    public List<Employee> getAll() {
        return employees;
    }
}
