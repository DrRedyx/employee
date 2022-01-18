package com.example.employee;

import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
@Service
public class DepartmentServiceImpl implements DepartmentService {


    private final EmployeeService employeeService;

    public DepartmentServiceImpl(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @Override
    public Employee getMinSalaryDepartmentEmployee(int department) {
        return employeeService.getAll().stream().
                filter(employee -> employee.getDepartment() == department)
                .min(Comparator.comparing(Employee::getSalary))
                .get();
    }

    @Override
    public Employee getMaxSalaryDepartmentEmployee(int department) {
        return employeeService.getAll().stream().
        filter(employee -> employee.getDepartment() == department)
                .max(Comparator.comparing(Employee::getSalary))
                .get();
    }

    @Override
    public List<Employee> getDepartment(int department) {
        return employeeService.getAll().stream().
                filter(employee -> employee.getDepartment() == department)
                .collect(Collectors.toList());
    }

    @Override
    public Map<Integer, List<Employee>> getAllEmployee() {
        return employeeService.getAll().stream().
                collect(Collectors.groupingBy(Employee::getDepartment));
    }
}
