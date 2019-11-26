package jrout.tutorial.batch31.spring.dao.impl;

import jrout.tutorial.batch31.spring.dao.IEmployeeDAO;
import jrout.tutorial.batch31.spring.domain.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Component
public class EmployeeDAOImpl implements IEmployeeDAO {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public Employee fetchEmployee(int empId) {
        /*String firstName = jdbcTemplate.queryForObject("select first_name from employees where emp_no= ?", new Object[]{empId}, String.class);
        Employee employee = new Employee();
        employee.setFirstName(firstName);
        return employee;*/

        /*Employee employee = jdbcTemplate
                .queryForObject("select * from employees where emp_no = ?", new Object[]{empId},
                        new EmployeeMapper());*/

        Employee employee = jdbcTemplate
                .queryForObject("select * from employees where emp_no = ?", new Object[]{empId},
                        new RowMapper<Employee>() {
                            @Override
                            public Employee mapRow(ResultSet resultSet, int i) throws SQLException {
                                Employee employee = new Employee();
                                employee.setFirstName(resultSet.getString("first_name"));
                                employee.setLastName(resultSet.getString("last_name"));
                                return employee;
                            }
                        });
        return employee;
    }

    public Employee fetchSalary(int empId) {
        return null;
    }

    public Employee[] fetchWithLastName(String lastName) {
        return new Employee[0];
    }

    public List<Employee> fetchWithLastNameWithCollection(String lastName) {
        return null;
    }
}

class EmployeeMapper implements RowMapper<Employee> {

    @Override
    public Employee mapRow(ResultSet resultSet, int i) throws SQLException {
        Employee employee = new Employee();
        employee.setFirstName(resultSet.getString("first_name"));
        employee.setLastName(resultSet.getString("last_name"));
        return employee;
    }
}
