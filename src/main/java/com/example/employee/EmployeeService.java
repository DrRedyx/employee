package com.example.employee;

public interface EmployeeService {
    Employee addEmployee(String firstname, String lastname);
    Employee deleteEmployee(Integer num);
    Employee findEmployee(Integer num);
}
