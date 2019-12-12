package jrout.tutorial.springjpa.springjpa;

import jrout.tutorial.springjpa.springjpa.model.*;
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
public class SpringJpaAssociationTests {

	@Autowired
	private StudentRepository studentRepository;

	@Autowired
	private ReaderRepository readerRepository;

	@Autowired
	EntityManager entityManager;

	@Test
	public void contextLoads() {
	}

	@Test
	@Transactional
	public void testOneToOne(){
		Student employee = studentRepository.findById(Long.valueOf(1)).get();
		log.info(employee);
		Account account = employee.getAccount();
		log.info(account);
	}

	@Test
	@Transactional
	public void testFindByEmail(){
//		Student employee = studentRepository.findByEmail("xyz@email.com");
		Student employee = studentRepository.findByEmailAndId("xyz@email.com", 1L);
		log.info(employee);
//		Account account = employee.getAccount();
//		log.info(account);
	}

	@Test
	@Transactional // used transactional else it not lazy initializing the phone set
	public void testOneToMany(){
		Optional<Student> byId = studentRepository.findById(Long.valueOf(1));
		Student student = byId.get();
		log.info(student.getName());
		Set<Phone> studentPhoneNumbers = student.getPhoneNumbers();
		log.info(studentPhoneNumbers);
	}

	@Test
	@Transactional
	public void testManyToMany(){
		Reader reader = readerRepository.findById(Long.valueOf(1)).get();
		log.info(reader.getFirstName());

	}



	@Test
	public void testEntityManager(){
		Reader reader = entityManager.find(Reader.class, 1L);
		Assert.assertNotNull(reader);
	}
}
