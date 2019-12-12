package jrout.tutorial.batch31.springjpa.repository;

import jrout.tutorial.batch31.springjpa.model.Employees;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employees, Integer> {
}
