package jrout.tutorial.batch31.jdbc.service.impl;

import jrout.tutorial.batch31.jdbc.dao.IEmployeeDAO;
import jrout.tutorial.batch31.jdbc.dao.impl.EmployeeDAOImpl;
import jrout.tutorial.batch31.jdbc.domain.Employee;
import jrout.tutorial.batch31.jdbc.service.IEmployeeService;
import org.apache.log4j.Logger;

import java.sql.Date;
import java.util.List;

public class EmployeeServiceImpl implements IEmployeeService {

    private static Logger LOGGER = Logger.getLogger(EmployeeServiceImpl.class);

    private IEmployeeDAO employeeDAO;
    @Override
    public Employee fetchEmployee(int empId) {
//        System.out.println("Inside EmployeeServiceImpl::fetchEmployee");
        LOGGER.info("Inside EmployeeServiceImpl::fetchEmployee");
        employeeDAO = new EmployeeDAOImpl();
        return employeeDAO.fetchEmployee(empId);
    }

    @Override
    public float fetchSalary(int empId) {
        employeeDAO = new EmployeeDAOImpl();
        Employee employee = employeeDAO.fetchSalary(empId);
        // if the hire_date is on 2000.. I want to give extra bonus to the employee
        // 30000 actual salary
        // 30,000+ 1000

//        if(employee.getHireDate().after(new Date())){
          if(employee.getHireDate() != null){ // if hiredate is 2000
            return employee.getSalary() + 1000;
        }
        return employee.getSalary();
    }

    @Override
    public Employee[] fetchWithLastName(String lastName) {
        employeeDAO = new EmployeeDAOImpl();
        Employee[] employees = employeeDAO.fetchWithLastName(lastName);
        return employees;
    }

    @Override
    public List<Employee> fetchWithLastNameWithCollection(String lastName) {
        employeeDAO = new EmployeeDAOImpl();
        List<Employee> employees = employeeDAO.fetchWithLastNameWithCollection(lastName);

        return employees;


    }

    private String trimSomething(String data){
        if(data != null)
            return data.trim();
        else
            return data;
    }

}
