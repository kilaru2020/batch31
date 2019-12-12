package jrout.tutorial.springjpa.springjpa.repository;

import jrout.tutorial.springjpa.springjpa.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Long> {
    Student findByEmail(String email);
    Student findByEmailAndId(String email, Long Id);
}
