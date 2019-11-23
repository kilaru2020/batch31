package jrout.tutorial.spring.springcore.service.impl;



import jrout.tutorial.spring.springcore.dao.IEmployeeDAO;
import jrout.tutorial.spring.springcore.dao.impl.EmployeeDAOImpl;
import jrout.tutorial.spring.springcore.domain.Employee;
import jrout.tutorial.spring.springcore.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

//@Component
@Service
public class EmployeeServiceImpl implements IEmployeeService {

    @Autowired
    private IEmployeeDAO employeeDAO;

    @Override
    public Employee fetchEmployee(int empId) {
        System.out.println("Inside EmployeeServiceImpl::fetchEmployee");
        return employeeDAO.fetchEmployee(empId);
    }

    @Override
    public float fetchSalary(int empId) {
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
        Employee[] employees = employeeDAO.fetchWithLastName(lastName);
        return employees;
    }

    @Override
    public List<Employee> fetchWithLastNameWithCollection(String lastName) {
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
