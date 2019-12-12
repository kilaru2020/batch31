package jrout.tutorial.springjpa.springjpa.repository;

import jrout.tutorial.springjpa.springjpa.model.Reader;
import jrout.tutorial.springjpa.springjpa.model.Student;
import org.springframework.context.annotation.Scope;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.annotation.Resource;
import java.util.List;

@Resource()
public interface ReaderRepository extends JpaRepository<Reader, Long> {
    List<Student> findByEmail(String email);
}
