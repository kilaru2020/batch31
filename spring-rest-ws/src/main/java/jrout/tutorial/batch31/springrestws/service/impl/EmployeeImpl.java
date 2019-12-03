package jrout.tutorial.batch31.springrestws.service.impl;

import jrout.tutorial.batch31.springrestws.dao.IEmployeeDAO;
import jrout.tutorial.batch31.springrestws.domain.Employee;
import jrout.tutorial.batch31.springrestws.service.IEmployee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component // Spring Container
public class EmployeeImpl implements IEmployee {

    @Autowired
    IEmployeeDAO iEmployeeDAO;
    public Employee fetchEmployee(int empId){
        return iEmployeeDAO.fetchEmployee(empId);
    }
}
