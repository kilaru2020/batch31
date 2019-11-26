package jrout.tutorial.batch31.spring.dao;


import jrout.tutorial.batch31.spring.domain.Employee;

import java.util.List;

public interface IEmployeeDAO {
    Employee fetchEmployee(int empId);
    Employee fetchSalary(int empId);

    Employee[] fetchWithLastName(String lastName);
    List<Employee> fetchWithLastNameWithCollection(String lastName);
}
