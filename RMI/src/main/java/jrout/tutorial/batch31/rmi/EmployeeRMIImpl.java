package jrout.tutorial.batch31.rmi;

import jrout.tutorial.batch31.jdbc.domain.Employee;
import jrout.tutorial.batch31.jdbc.service.IEmployeeService;
import jrout.tutorial.batch31.jdbc.service.impl.EmployeeServiceImpl;
import jrout.tutorial.batch31.rmi.IEmployeeRMI;

import java.io.Serializable;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class EmployeeRMIImpl extends UnicastRemoteObject implements IEmployeeRMI, Serializable {

    protected EmployeeRMIImpl() throws RemoteException {
        super();
    }

    @Override
    public Employee fetchEmployee(int empId) throws RemoteException {
        IEmployeeService employeeService =  new EmployeeServiceImpl();;
        Employee employee = employeeService.fetchEmployee(empId);
        return employee;
    }
}
