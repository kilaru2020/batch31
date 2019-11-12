package jrout.tutorial.batch31.jdbc.service;

import jrout.tutorial.batch31.jdbc.domain.Employee;

public interface IEmployeeService {
    Employee fetchEmployee(int empId);
    float fetchSalary(int empId);
}
