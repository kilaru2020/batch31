package jrout.tutorial.springjpa.springjpa;

import jrout.tutorial.springjpa.springjpa.model.Account;
import jrout.tutorial.springjpa.springjpa.model.Phone;
import jrout.tutorial.springjpa.springjpa.model.Reader;
import jrout.tutorial.springjpa.springjpa.model.Student;
import jrout.tutorial.springjpa.springjpa.repository.ReaderRepository;
import jrout.tutorial.springjpa.springjpa.repository.StudentRepository;
import lombok.extern.log4j.Log4j2;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.Optional;
import java.util.Set;

@SpringBootTest
@Log4j2
public class SpringJpaCachingTests {

	@Autowired
	private StudentRepository repository;

	@Autowired
	private ReaderRepository readerRepository;

	@Autowired
	EntityManager entityManager;

	@Test
	public void contextLoads() {
	}
}
