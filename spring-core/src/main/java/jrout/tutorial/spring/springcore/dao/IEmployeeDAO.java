package jrout.tutorial.spring.springcore.dao;

import jrout.tutorial.spring.springcore.domain.Employee;

import java.util.List;

public interface IEmployeeDAO {
    Employee fetchEmployee(int empId);
    Employee fetchSalary(int empId);

    Employee[] fetchWithLastName(String lastName);
    List<Employee> fetchWithLastNameWithCollection(String lastName);
}
