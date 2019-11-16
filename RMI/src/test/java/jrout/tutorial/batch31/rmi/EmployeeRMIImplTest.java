package jrout.tutorial.batch31.rmi;

import jrout.tutorial.batch31.jdbc.domain.Employee;
import jrout.tutorial.batch31.rmi.EmployeeRMIImpl;
import jrout.tutorial.batch31.rmi.IEmployeeRMI;
import org.junit.Test;

public class EmployeeRMIImplTest {

    @Test
    public void fetchEmployee() throws Exception {
        IEmployeeRMI employeeRMI = new EmployeeRMIImpl();
        Employee employee = employeeRMI.fetchEmployee(30001);
        System.out.println(employee.getFirstName());
    }
}