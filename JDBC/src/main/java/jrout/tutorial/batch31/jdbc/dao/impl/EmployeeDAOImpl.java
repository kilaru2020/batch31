package jrout.tutorial.batch31.jdbc.dao.impl;

import jrout.tutorial.batch31.jdbc.dao.IEmployeeDAO;
import jrout.tutorial.batch31.jdbc.domain.Employee;

import java.sql.Date;

public class EmployeeDAOImpl implements IEmployeeDAO {
    static{

    }
    @Override
    public Employee fetchEmployee(int empId) {
        Employee employee = new Employee();
        employee.setEmpNo(empId);
        return employee;
    }

    @Override
    public Employee fetchSalary(int empId) {
        Employee employee = new Employee();
        employee.setEmpNo(empId);
        employee.setHireDate(new Date(2222222222l));
        employee.setSalary(33434.00f);
        return employee;
    }
}
