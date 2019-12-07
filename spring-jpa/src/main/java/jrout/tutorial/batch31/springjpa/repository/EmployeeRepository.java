package jrout.tutorial.batch31.springjpa.repository;

import jrout.tutorial.batch31.springjpa.model.Employees;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
//public interface EmployeeRepository extends JpaRepository {
public interface EmployeeRepository extends CrudRepository<Employees, Integer> {
}
