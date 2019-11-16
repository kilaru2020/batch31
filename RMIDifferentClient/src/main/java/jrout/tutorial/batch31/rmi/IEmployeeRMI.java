package jrout.tutorial.batch31.rmi;

import jrout.tutorial.batch31.jdbc.domain.Employee;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IEmployeeRMI extends Remote {
    public Employee fetchEmployee(int empId) throws RemoteException;
}
