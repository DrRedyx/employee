package com.example.employee;

import java.util.List;
import java.util.Map;

public interface DepartmentService {
    Employee getMinSalaryDepartmentEmployee(Integer department);
    Employee getMaxSalaryDepartmentEmployee(Integer department);
    List<Employee> getDepartment(Integer department);
    Map <Integer, List<Employee>> getAllEmployee();

}
