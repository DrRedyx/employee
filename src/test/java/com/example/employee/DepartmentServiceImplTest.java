package com.example.employee;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static com.example.employee.Constanta.*;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class DepartmentServiceImplTest {
    @Mock
    private EmployeeService testMock;

    @InjectMocks
    private DepartmentServiceImpl departmentService;


    @Test
    public void minSalary() {
        when(testMock.getAll()).thenReturn(TRUE_LIST);
        assertEquals(DEPARTMENT1_MIN, departmentService.getMinSalaryDepartmentEmployee(1));
    }

    @Test
    public void maxSalary() {
        when(testMock.getAll()).thenReturn(TRUE_LIST);
        assertEquals(DEPARTMENT1_MAX, departmentService.getMaxSalaryDepartmentEmployee(1));
    }

    @Test
    public void throwDepartmentNotFind() {
        when(testMock.getAll()).thenReturn(TRUE_LIST);
        assertThrows(DepatmentNotFindException.class,
        () -> departmentService.getMinSalaryDepartmentEmployee(0));
    }
    @Test
    public void throwEmployeeNotFind() {
        when(testMock.getAll()).thenReturn(TRUE_LIST);
        assertThrows(EmployeeNotFindException.class,
                () -> departmentService.getMinSalaryDepartmentEmployee(0));
    }

    @Test
    public void findExceptionEmployeesOfDepartment() {
        when(testMock.getAll()).thenReturn(TRUE_LIST);
        assertThrows(DepatmentNotFindException.class,
                () -> departmentService.getDepartment(0));
    }

    @Test
    public void findEmployeesOfDepartment() {
        when(testMock.getAll()).thenReturn(TRUE_LIST);
        assertEquals(TRUE_LIST_1DEPARTMENT, departmentService.getDepartment(1));
    }

    @Test
    public void findDepartmentAll() {
        when(testMock.getAll()).thenReturn(TRUE_LIST);
        assertEquals(TRUE_MAPA, departmentService.getAllEmployee());
    }

}