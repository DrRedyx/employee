package com.example.employee;


import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    private Employee[] employees = new Employee[9];

    public Employee addEmployee(String firstname, String lastname) {
        Employee employee = new Employee(firstname, lastname);
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                employees[i] = employee;
                break;
            } else {
                employee = null;
            }
        }
        if (employee != null) {
            return employee;
        } else {
            return null;
        }
    }

    public Employee deleteEmployee(String firstname, String lastname) {
        Employee employee = null;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getFirstName().equals(firstname) && employees[i].getLastName().equals(lastname)) {
                employee = employees[i];
            }
        }
        return employee;
        //return "Сотрудник с Фамилией: " + lastname + "и именем: " + firstname + "удален";
    }

    public Employee findEmployee(String firstname, String lastname) {
        Employee employee = null;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getFirstName().equals(firstname) && employees[i].getLastName().equals(lastname)) {
                employee = employees[i];
            }
        }
        return employee;
        //return "Сотрудник с Фамилией: " + lastname + "и именем: " + firstname + "найден";
    }
}
