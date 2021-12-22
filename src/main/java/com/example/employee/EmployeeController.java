package com.example.employee;


import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    private final EmployeeServiceImpl employeeService;

    public EmployeeController(EmployeeServiceImpl employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping(path = "/add")
    public String add(@RequestParam("firstName") String firstName, @RequestParam("lastName") String lastname) {
        Employee employee = employeeService.addEmployee(firstName, lastname);
        return "Сотрудник " + employee + " добавлен";
    }

    @GetMapping("/remove/{id}")
    public String remove(@PathVariable("id") Integer id) {
        Employee employee = employeeService.deleteEmployee(id);
        return "Сотрудник " + employee + " удален";
    }

    @GetMapping("/find/{id}")
    public String find(@PathVariable("id") Integer id) {
        Employee employee = employeeService.findEmployee(id);
        return "Сотрудник " + employee + " найден";
    }
}
