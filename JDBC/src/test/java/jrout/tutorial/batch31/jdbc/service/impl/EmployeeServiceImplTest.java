package jrout.tutorial.batch31.jdbc.service.impl;

import jrout.tutorial.batch31.jdbc.domain.Employee;
import jrout.tutorial.batch31.jdbc.service.IEmployeeService;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
//import org.junit.Assert;

public class EmployeeServiceImplTest {
    private IEmployeeService employeeService;

    @Before
    public void setUp() throws Exception {
        employeeService = new EmployeeServiceImpl();
        System.out.println("Before the run...");
    }

    @After
    public void tearDown() throws Exception {
        employeeService = null;
        System.out.println("After completion");
    }

    @Test
    public void fetchEmployee() {
        Employee employee = employeeService.fetchEmployee(100);
        assertNotNull(employee); // this object should not be null
        assertEquals(100,employee.getEmpNo());
    }

    @Test
    public void fetchSalary() {
        float salary = employeeService.fetchSalary(100);
        assertTrue("Salary is less than 50,000", salary > 50_000);
    }

}