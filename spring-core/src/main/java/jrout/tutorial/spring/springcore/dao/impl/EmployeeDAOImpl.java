package jrout.tutorial.spring.springcore.dao.impl;


import jrout.tutorial.spring.springcore.dao.IEmployeeDAO;
import jrout.tutorial.spring.springcore.domain.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Component
public class EmployeeDAOImpl implements IEmployeeDAO {

    @Autowired
    private DataSource dataSource;

    private Connection connection = null;
    @Override
    public Employee fetchEmployee(int empId) {
        System.out.println("Inside EmployeeDAOImpl::fetchEmployee");
        Employee employee = null;
        try {
            connection = dataSource.getConnection();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from employees where emp_no= "+empId);

            while(resultSet.next()) {
                employee = new Employee();
                employee.setEmpNo(resultSet.getInt("emp_no"));
                employee.setFirstName(resultSet.getString("first_name"));
                employee.setLastName(resultSet.getString("last_name"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {

        }
        return employee;
    }



    @Override
    public Employee fetchSalary(int empId) {
        connection =null;

        Employee employee = new Employee();
        employee.setEmpNo(empId);
        employee.setHireDate(new Date(2222222222l));
        employee.setSalary(33434.00f);
        return employee;
    }

    @Override
    public Employee[] fetchWithLastName(String lastName) {
        Employee employees[] = new Employee[200];

        System.out.println("Inside EmployeeDAOImpl::fetchEmployee");
        connection = null;
        Employee employee = null;
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("select * from employees where last_name = ?");
            preparedStatement.setString(1,lastName);
            ResultSet resultSet = preparedStatement.executeQuery();

            int index = 0;
            while(resultSet.next()) {
                employee = new Employee();
                employee.setEmpNo(resultSet.getInt("emp_no"));
                employee.setFirstName(resultSet.getString("first_name"));
                employee.setLastName(resultSet.getString("last_name"));
                employees[index++] = employee;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {

        }
        return employees;
    }

    @Override
    public List<Employee> fetchWithLastNameWithCollection(String lastName) {
//        Employee employeeList[] = new Employee[200];
        List<Employee> employeeList = new ArrayList<>();
        System.out.println("Inside EmployeeDAOImpl::fetchEmployee");
        connection = null;
        Employee employee = null;
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("select * from employees where last_name = ?");
            preparedStatement.setString(1,lastName);
            ResultSet resultSet = preparedStatement.executeQuery();

            int index = 0;
            while(resultSet.next()) {
                employee = new Employee();
                employee.setEmpNo(resultSet.getInt("emp_no"));
                employee.setFirstName(resultSet.getString("first_name"));
                employee.setLastName(resultSet.getString("last_name"));
//                employeeList[index++] = employee;
                employeeList.add(employee);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {

        }
        return employeeList;
    }
}
