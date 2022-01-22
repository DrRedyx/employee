package com.example.employee;


import org.apache.commons.lang3.StringUtils;
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
        if (StringUtils.isAlpha(firstname) && StringUtils.isAlpha(lastname)) {
            StringUtils.capitalize(firstname);
            StringUtils.capitalize(lastname);
            if (!employees.contains(employee)) {
                employees.add(employee);
                return employee;
            } else {
                throw new EmployeeIsAlreadyWorkException();
            }
        }
        else {
            throw new StringIsNotAlphabeticException();
        }
    }
    @Override
    public Employee deleteEmployee(String firstname, String lastname, int salary, int department) {
        Employee employee = new Employee(firstname, lastname, salary, department);
        if (StringUtils.isAlpha(firstname) && StringUtils.isAlpha(lastname)) {
            StringUtils.capitalize(firstname);
            StringUtils.capitalize(lastname);
            if (!employees.contains(employee)) {
                employees.remove(employee);
                return employee;
            } else {
                throw new EmployeeNotFindException();
            }
        }
        else {
            throw new StringIsNotAlphabeticException();
        }
    }
    @Override
    public Employee findEmployee (String firstname, String lastname, int salary, int department){
        Employee employee = new Employee(firstname, lastname, salary, department);
        if (StringUtils.isAlpha(firstname) && StringUtils.isAlpha(lastname)) {
            StringUtils.capitalize(firstname);
            StringUtils.capitalize(lastname);
            if (!employees.contains(employee)) {
                return employee;
            } else {
                throw new EmployeeNotFindException();
            }
        }
        else {
            throw new StringIsNotAlphabeticException();
        }
    }

    @Override
    public List<Employee> getAll() {
        return employees;
    }
}
