package jrout.tutorial.spring.springcore;

import jrout.tutorial.spring.springcore.dao.IEmployeeDAO;
import jrout.tutorial.spring.springcore.dao.impl.EmployeeDAOImpl;
import jrout.tutorial.spring.springcore.domain.Employee;
import jrout.tutorial.spring.springcore.service.IEmployeeService;
import jrout.tutorial.spring.springcore.service.impl.EmployeeServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import static org.junit.Assert.*;

@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
public class SpringCoreApplicationTests {

    @Autowired
//    @Resource
    private IEmployeeService employeeService;

    @Test
    public void contextLoads() {
    }

    @Test
    public void fetchEmployee() {
        Employee employee = employeeService.fetchEmployee(10003);
        assertNotNull(employee); // this object should not be null
        assertEquals(10003,employee.getEmpNo());
        System.out.println(employee.getFirstName());

    }

}
