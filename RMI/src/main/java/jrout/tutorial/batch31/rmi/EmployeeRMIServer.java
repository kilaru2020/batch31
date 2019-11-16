package jrout.tutorial.batch31.rmi;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class EmployeeRMIServer {
    public static void main(String[] args) throws Exception {
        IEmployeeRMI employeeRMI = new EmployeeRMIImpl();

        Registry registry = LocateRegistry.createRegistry(2345);
        registry.rebind("EmployeeRMI",employeeRMI);
        System.out.println("RMI Started..and employee rmi is binded....");
    }
}
