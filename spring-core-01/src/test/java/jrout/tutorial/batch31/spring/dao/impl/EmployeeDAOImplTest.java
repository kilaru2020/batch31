package jrout.tutorial.batch31.spring.dao.impl;

import jrout.tutorial.batch31.spring.AppConfig;
import jrout.tutorial.batch31.spring.dao.IEmployeeDAO;
import jrout.tutorial.batch31.spring.domain.Employee;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { AppConfig.class })
public class EmployeeDAOImplTest {

    @Autowired
    private IEmployeeDAO employeeDAO;

    @Test
    public void fetchEmployee() {
        Employee employee = employeeDAO.fetchEmployee(30002);
        System.out.println(employee.getFirstName());
        System.out.println(employee.getLastName());

    }
}