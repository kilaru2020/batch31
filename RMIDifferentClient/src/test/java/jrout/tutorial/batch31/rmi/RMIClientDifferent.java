package jrout.tutorial.batch31.rmi;

import jrout.tutorial.batch31.jdbc.domain.Employee;
import org.junit.Test;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class RMIClientDifferent {

    @Test
    public void testRMI() throws Exception {
        Registry registry = LocateRegistry.getRegistry("localhost",2345);
        IEmployeeRMI employeeRMI = (IEmployeeRMI) registry.lookup("EmployeeRMI");
        Employee employee = employeeRMI.fetchEmployee(30001);
        System.out.println("*******" + employee.getFirstName()+" >>>>>>>>>>");
    }
}
