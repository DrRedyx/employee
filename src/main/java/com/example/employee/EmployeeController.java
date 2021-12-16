package com.example.employee;


import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping(path = "/add")
    public String add(@RequestParam("firstName") String firstName, @RequestParam("lastName") String lastname) {
        Employee employee = employeeService.addEmployee(firstName, lastname);
        return "Сотрудник " + employee + " добавлен";
    }

    @GetMapping("/remove")
    public String remove(@RequestParam("firstName") String firstName, @RequestParam("lastName") String lastname) {
        Employee employee = employeeService.deleteEmployee(firstName, lastname);
        return "Сотрудник " + employee + " удален";
    }

    @GetMapping("/find")
    public String find(@RequestParam("firstName") String firstName, @RequestParam("lastName") String lastname) {
        Employee employee = employeeService.findEmployee(firstName, lastname);
        return "Сотрудник " + employee + " найден";
    }

    @GetMapping("/print")
    public List<Employee> print() {
        return employeeService.print();
    }
}
