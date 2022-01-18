package com.example.employee;


import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    private final EmployeeServiceImpl employeeService;

    public EmployeeController(
            EmployeeServiceImpl employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping(path = "/add")
    public String add(@RequestParam("firstName") String firstName, @RequestParam("lastName") String lastname, @RequestParam("salary") int salary, @RequestParam("department") int department) {
        Employee employee = employeeService.addEmployee(firstName, lastname, salary, department);
        return "Сотрудник " + employee + " добавлен";
    }

    @GetMapping("/remove")
    public String remove(@RequestParam("firstName") String firstName, @RequestParam("lastName") String lastname, @RequestParam("salary") int salary, @RequestParam("department") int department) {
        Employee employee = employeeService.deleteEmployee(firstName, lastname, salary, department);
        return "Сотрудник " + employee + " удален";
    }

    @GetMapping("/find")
    public String find(@RequestParam("firstName") String firstName, @RequestParam("lastName") String lastname, @RequestParam("salary") int salary, @RequestParam("department") int department) {
        Employee employee = employeeService.findEmployee(firstName, lastname, salary, department);
        return "Сотрудник " + employee + " найден";
    }

    @GetMapping(path = "/print")
    public List<Employee> print() {
        return employeeService.getAll();
    }
}
