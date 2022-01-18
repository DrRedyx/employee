package com.example.employee;

import java.util.List;
import java.util.Map;

public interface DepartmentService {
    Employee getMinSalaryDepartmentEmployee(int department);
    Employee getMaxSalaryDepartmentEmployee(int department);
    List<Employee> getDepartment(int department);
    Map <Integer, List<Employee>> getAllEmployee();

}
