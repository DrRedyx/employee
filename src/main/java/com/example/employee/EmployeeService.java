package com.example.employee;


import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    private Employee[] employees = //new Employee[4];
            {
            new Employee("Sandro", "Necromancer"),
            new Employee("Lord", "Voldemort"),
            new Employee("Saruman", "White"),
            new Employee("Wild", "Hunt"),
    };

    public Employee addEmployee(String firstname, String lastname) {
        Employee employee = null;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                employees[i] = new Employee(firstname, lastname);
                employee = employees[i];
                break;
            }
        }
            return employee;
    }

    public Employee deleteEmployee(String firstname, String lastname) {
        Employee employee = null;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getFirstName().equals(firstname) && employees[i].getLastName().equals(lastname)) {
                employee = employees[i];
                employees[i] = null;
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

    public Employee print(int id) {
        Employee employee = null;
        for (int i = 0; i < employees.length; i++) {
            if (i == id) {
                employee = employees[i];
            }
        }
        if (employee == null) {
            return employee;
        } else {
            return employee;
        }
    }
    public int length() {
        return employees.length;
    }
}
