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
        Employee employee = new Employee(firstname, lastname);
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                employees[i] = employee;
                return employee;
            }
        }
        throw new StateIsFullException();
    }

    public Employee deleteEmployee(String firstname, String lastname) {
        Employee employee = new Employee(firstname, lastname);
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].equals(employee)) {
                employees[i] = null;
                return employee;
            }
        }
        throw new EmployeeNotFindException();
    }

    public Employee findEmployee(String firstname, String lastname) {
        Employee employee = new Employee(firstname, lastname);
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].equals(employee)) {
                employee = employees[i];
                return employee;
            }
        }
        throw new EmployeeNotFindException();
    }
}
