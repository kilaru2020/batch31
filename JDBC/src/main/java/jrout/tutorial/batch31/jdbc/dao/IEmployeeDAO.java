package jrout.tutorial.batch31.jdbc.dao;

import jrout.tutorial.batch31.jdbc.domain.Employee;

public interface IEmployeeDAO {
    Employee fetchEmployee(int empId);
    Employee fetchSalary(int empId);
}
