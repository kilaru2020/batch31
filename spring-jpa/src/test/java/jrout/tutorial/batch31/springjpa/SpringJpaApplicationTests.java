package jrout.tutorial.batch31.springjpa;

import jrout.tutorial.batch31.springjpa.model.Employees;
import jrout.tutorial.batch31.springjpa.repository.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

@SpringBootTest
class SpringJpaApplicationTests {

    @Autowired
    private EmployeeRepository repository;

    @Test
    void contextLoads() {
    }


    @Test
    public void testEmployeeModel(){
        Employees employees = new Employees();
    }


    @Test
    public void testEmployeeFind(){
        Optional<Employees> optionalEmployees = repository.findById(10064);
//        Employees employees = optionalEmployees.get();
        Employees employees = optionalEmployees.orElse(null);

        if(employees != null) {
            System.out.println(employees.getEmpNo());
            System.out.println(employees.getFirstName());
            System.out.println(employees.getLastName());
        }
    }

    @Test
    public void testFindAll(){
        Iterable<Employees> all = repository.findAll();
        all.forEach(employees -> {
            System.out.println(employees.getEmpNo() +" "+ employees.getFirstName() +" " + employees.getLastName());
        });
    }
}
