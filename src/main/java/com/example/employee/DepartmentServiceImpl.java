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
    public Employee getMinSalaryDepartmentEmployee(Integer department) {
        if (department != null || department < 5 || department != 0) {
            return employeeService.getAll().stream().
                    filter(employee -> employee.getDepartment() == department)
                    .min(Comparator.comparing(Employee::getSalary))
                    .orElseThrow(() -> new EmployeeNotFindException());
        }
        else {
            throw new DepatmentNotFindException();
        }
    }

    @Override
    public Employee getMaxSalaryDepartmentEmployee(Integer department) {
        if (department != null || department < 5 || department != 0) {
            return employeeService.getAll().stream().
                    filter(employee -> employee.getDepartment() == department)
                    .max(Comparator.comparing(Employee::getSalary))
                    .orElseThrow(() -> new EmployeeNotFindException());
        } else {
            throw new DepatmentNotFindException();
        }
    }

    @Override
    public List<Employee> getDepartment(Integer department) {
        if (department != null || department < 5 || department != 0) {
            return employeeService.getAll().stream().
                    filter(employee -> employee.getDepartment() == department)
                    .collect(Collectors.toList());
        } else {
            throw new DepatmentNotFindException();
        }
    }

    @Override
    public Map<Integer, List<Employee>> getAllEmployee() {
        return employeeService.getAll().stream().
                collect(Collectors.groupingBy(Employee::getDepartment));
    }
}
