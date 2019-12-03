package jrout.tutorial.batch31.springrestws.service;

import jrout.tutorial.batch31.springrestws.domain.Employee;

public interface IEmployee {
    Employee fetchEmployee(int empId);
}
