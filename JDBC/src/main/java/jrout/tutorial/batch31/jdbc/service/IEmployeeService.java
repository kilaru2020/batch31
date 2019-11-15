package jrout.tutorial.batch31.jdbc.service;

import jrout.tutorial.batch31.jdbc.domain.Employee;

import java.util.List;

public interface IEmployeeService {
    Employee fetchEmployee(int empId);
    float fetchSalary(int empId);
    Employee [] fetchWithLastName(String lastName);
    List<Employee> fetchWithLastNameWithCollection(String lastName);
}
