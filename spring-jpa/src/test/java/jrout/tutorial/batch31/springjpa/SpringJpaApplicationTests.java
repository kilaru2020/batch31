package jrout.tutorial.batch31.springjpa;

import jrout.tutorial.batch31.springjpa.model.Departments;
import jrout.tutorial.batch31.springjpa.model.Employees;
import jrout.tutorial.batch31.springjpa.model.Salaries;
import jrout.tutorial.batch31.springjpa.repository.EmployeeRepository;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;

@SpringBootTest
@Log4j2
class SpringJpaApplicationTests {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Test
    void contextLoads() {
    }

    @Test
    public void testEmployeeModel() {
        Employees employees = new Employees();
    }


    @Test
    public void testEmployeeFind() {
        Optional<Employees> optionalEmployees = employeeRepository.findById(10064);
//        Employees employees = optionalEmployees.get();
        Employees employees = optionalEmployees.orElse(null);

        if (employees != null) {
            System.out.println(employees.getEmpNo());
            System.out.println(employees.getFirstName());
            System.out.println(employees.getLastName());
        }
    }

    @Test
    public void testFindAll() {
        Iterable<Employees> all = employeeRepository.findAll();
        Iterator<Employees> iterator = all.iterator();
        while (iterator.hasNext()) {
            Employees employees = iterator.next();
            System.out.println(employees.getEmpNo() + " " + employees.getFirstName() + " " + employees.getLastName());
        }


        /*all.forEach(employees -> {
            System.out.println(employees.getEmpNo() + " " + employees.getFirstName() + " " + employees.getLastName());
        });
        */

    }

    @Test
    public void testOneToMany() {
        Optional<Employees> employees = employeeRepository.findById(10001);
        Employees employees1 = employees.get();
        List<Salaries> salaries = employees1.getSalaries();
        log.info(salaries.size());
        salaries.forEach(System.out::println);
    }


    @Test
    public void testManyToMany(){
        Optional<Employees> optionalEmployees = employeeRepository.findById(10001);
        Employees employees = optionalEmployees.get();
        List<Departments> departments = employees.getDepartments();
        log.info(departments.size());
    }
}