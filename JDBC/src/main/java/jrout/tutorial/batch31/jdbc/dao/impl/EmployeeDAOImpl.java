package jrout.tutorial.batch31.jdbc.dao.impl;

import jrout.tutorial.batch31.jdbc.dao.IEmployeeDAO;
import jrout.tutorial.batch31.jdbc.domain.Employee;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDAOImpl implements IEmployeeDAO {
    private String url = "jdbc:mysql://localhost:3306/employees?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    private Connection connection = null;
    static{
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    private Connection establishConnection(){
        if(connection != null) {
            return connection;
        }
        try {
            connection = DriverManager.getConnection(url, "root", "root");
            System.out.println("Connection established...");
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return connection;
    }
    @Override
    public Employee fetchEmployee(int empId) {
        System.out.println("Inside EmployeeDAOImpl::fetchEmployee");
        connection = establishConnection();
        Employee employee = null;
        try {
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
            closeConnection();
        }
        return employee;
    }

    private void closeConnection() {
        System.out.println("Closing the connection...");
        if(connection != null){
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public Employee fetchSalary(int empId) {
        connection = establishConnection();

        Employee employee = new Employee();
        employee.setEmpNo(empId);
        employee.setHireDate(new Date(2222222222l));
        employee.setSalary(33434.00f);
        return employee;
    }

    @Override
    public Employee[] fetchWithLastName(String lastName) {
        Employee employees[] = new Employee[200];

        connection = establishConnection();
        System.out.println("Inside EmployeeDAOImpl::fetchEmployee");
        connection = establishConnection();
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
            closeConnection();
        }
        return employees;
    }

    @Override
    public List<Employee> fetchWithLastNameWithCollection(String lastName) {
//        Employee employeeList[] = new Employee[200];
        List<Employee> employeeList = new ArrayList<>();
        System.out.println("Inside EmployeeDAOImpl::fetchEmployee");
        connection = establishConnection();
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
            closeConnection();
        }
        return employeeList;
    }
}
