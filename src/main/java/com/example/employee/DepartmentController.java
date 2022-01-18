package com.example.employee;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/departments")
public class DepartmentController {

    private final DepartmentService departmentService;

    public DepartmentController(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }

    public String getMinSalaryDepartmentEmployee(int department) {
        return "Employee with min salary " +  departmentService.getMinSalaryDepartmentEmployee(department);
    }
    public String getMaxSalaryDepartmentEmployee(int department) {
        return "Employee with min salary "  + departmentService.getMaxSalaryDepartmentEmployee(department);
    }
    public String getDepartment(int department) {
        return "All department employee: " + departmentService.getDepartment(department);
    }
    public String getAllEmployee() {
        return "All Employee: " + departmentService.getAllEmployee();
    }
}

