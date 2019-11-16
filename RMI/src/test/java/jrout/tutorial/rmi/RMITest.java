package jrout.tutorial.rmi;
import jrout.tutorial.batch31.jdbc.domain.Employee;
import jrout.tutorial.batch31.jdbc.service.IEmployeeService;
import jrout.tutorial.batch31.jdbc.service.impl.EmployeeServiceImpl;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class RMITest {
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
}
