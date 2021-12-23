package com.example.employee;

import java.util.HashMap;

public interface EmployeeService {
    Employee addEmployee(String firstname, String lastname);
    Employee deleteEmployee(String firstname, String lastname);
    Employee findEmployee(String firstname, String lastname);
    void printAllEmployee();
}
