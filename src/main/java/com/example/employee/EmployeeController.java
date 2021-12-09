package com.example.employee;


import org.springframework.web.bind.annotation.*;

@RestController
//@RequestMapping("/employee")
public class EmployeeController {
    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping(path = "/add")
    public String add(@RequestParam("firstName") String firstName, @RequestParam("lastName") String lastname) {
        Employee employee = employeeService.addEmployee(firstName, lastname);
        if (employee != null) {
            return "Сотрудник " + employee + " добавлен";
        } else {
            throw new StateIsFull();
        }
    }

    @GetMapping("/remove")
    public String remove(@RequestParam("firstName") String firstName, @RequestParam("lastName") String lastname) {
        Employee employee = employeeService.deleteEmployee(firstName, lastname);
        if (employee != null) {
            return "Сотрудник " + employee + " удален";
        } else {
            throw new EmployeeNotFind();
        }
    }

    @GetMapping("/find")
    public String find(@RequestParam("firstName") String firstName, @RequestParam("lastName") String lastname) {
        Employee employee = employeeService.findEmployee(firstName, lastname);
        if (employee != null) {
            return "Сотрудник " + employee + " найден";
        } else {
            throw new EmployeeNotFind();
        }
    }
    @GetMapping("/print/{id}")
    public String print(@PathVariable("id") int id) {
        return  "Штат сотрудников: " + employeeService.print(id);
    }
    @GetMapping("/length")
    public String print() {
        return "Размер " + employeeService.length();
    }

}
