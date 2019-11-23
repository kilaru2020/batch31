package jrout.tutorial.spring.springcore.service;


import jrout.tutorial.spring.springcore.domain.Employee;

import java.util.List;

public interface IEmployeeService {
    Employee fetchEmployee(int empId);
    float fetchSalary(int empId);
    Employee [] fetchWithLastName(String lastName);
    List<Employee> fetchWithLastNameWithCollection(String lastName);
}
