package com.example.employee;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeServiceImplTest {

    private EmployeeServiceImpl employeeService;

    @BeforeEach
    public void setEmployeeService() {
        employeeService = new EmployeeServiceImpl();
    }

    @Test
    public void addEmployee() {
        Employee actual = new Employee("Ivan", "Ivanov", 45000, 1);
        assertEquals(employeeService.addEmployee("Ivan", "Ivanov", 45000, 1), actual);
    }

    @Test
    public void deleteEmployee() {
        Employee actual = employeeService.addEmployee("Ivan", "Ivanov", 45000, 1);
        assertEquals(employeeService.deleteEmployee("Ivan", "Ivanov", 45000, 1), actual);
    }

    @Test
    public void findEmployee() {
        Employee actual = employeeService.addEmployee("Ivan", "Ivanov", 45000, 1);
        assertEquals(employeeService.findEmployee("Ivan", "Ivanov", 45000, 1), actual);
    }

    @Test
    public void throwExceptionWithNumberInFirstOrLastName() {
        assertThrows(StringIsNotAlphabeticException.class,
                ()-> employeeService.addEmployee("451", "Ivanov", 0, 0));
        assertThrows(StringIsNotAlphabeticException.class,
                ()-> employeeService.addEmployee("Ivan", "455", 0, 0));
    }

    @Test
    public void throwEmployeeIsAlreadyWork() {
        employeeService.addEmployee("Ivan", "Ivanov", 45000, 1);
        assertThrows(EmployeeIsAlreadyWorkException.class,
                ()-> employeeService.addEmployee("Ivan", "Ivanov", 45000, 1));
    }

    @Test
    public void throwEmployeeNotFind() {
        employeeService.addEmployee("Ivan", "Ivanov", 45000, 1);

        assertThrows(EmployeeNotFindException.class,
                ()-> employeeService.findEmployee("Ivan", "Ivanov", 4500, 2));

        assertThrows(EmployeeNotFindException.class,
                ()-> employeeService.deleteEmployee("Ivan", "Ivanov", 4500, 2));
    }
}