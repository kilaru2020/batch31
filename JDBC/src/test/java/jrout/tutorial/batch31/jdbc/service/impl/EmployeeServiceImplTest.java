package jrout.tutorial.batch31.jdbc.service.impl;

import jrout.tutorial.batch31.jdbc.domain.Employee;
import jrout.tutorial.batch31.jdbc.service.IEmployeeService;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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
        Employee employee = employeeService.fetchEmployee(10003);
        assertNotNull(employee); // this object should not be null
        assertEquals(10003,employee.getEmpNo());

    }

    @Test
    public void fetchSalary() {
        float salary = employeeService.fetchSalary(100);
        assertTrue("Salary is less than 50,000", salary > 50_000);
    }

    @Test
    public void fetchWithLastName() {
        Employee[] employees = employeeService.fetchWithLastName("Streng");
        assertNotNull(employees);
        assertTrue(employees.length > 180);
    }

    @Test
    public void fetchWithLastNameWithArrayList() {
        List<Employee> employees = employeeService.fetchWithLastNameWithCollection("Streng");
        assertNotNull(employees);
        assertTrue(employees.size() > 100);

    }

    @Test
    public void arrayListExample(){
        int ages [] = new int[5];
        ages[0] = 4;
        ages[1] = 45;
        ages[2] = 44;
        ages[3] = 43;
        ages[4] = 40;
//        ages[5] = 40;

        List<Integer> ageList = new ArrayList(); // java.util
        ageList.add(4);
        ageList.add(43);
        ageList.add(44);
        ageList.add(45);
        ageList.add(46);
        ageList.add(47);
        ageList.add(48);
        ageList.add(42);
        ageList.add(42);
//        ageList.add("Peter");

        System.out.println(ages.length);
        System.out.println(ageList.size());

        System.out.println(ages);
        System.out.println(ageList);





    }

    @Test
    public void setExample(){
        Set<Integer> uniqueAges = new HashSet<>(); // java.util
        uniqueAges.add(4);
        uniqueAges.add(43);
        uniqueAges.add(44);
        uniqueAges.add(44);

        System.out.println(uniqueAges);


    }

}