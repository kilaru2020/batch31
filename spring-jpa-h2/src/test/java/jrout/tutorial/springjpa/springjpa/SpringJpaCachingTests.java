package jrout.tutorial.springjpa.springjpa;

import jrout.tutorial.springjpa.springjpa.model.Account;
import jrout.tutorial.springjpa.springjpa.model.Phone;
import jrout.tutorial.springjpa.springjpa.model.Reader;
import jrout.tutorial.springjpa.springjpa.model.Student;
import jrout.tutorial.springjpa.springjpa.repository.ReaderRepository;
import jrout.tutorial.springjpa.springjpa.repository.StudentRepository;
import lombok.extern.log4j.Log4j2;
import net.sf.ehcache.CacheManager;
import org.hibernate.Session;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;
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

	@Test
	public void findReader(){
		readerRepository.findById(1L);
	}

	@Test
	@Transactional
	public void cacheLevel1(){
		Student student = entityManager.find(Student.class, 1L);
		log.info(student.getName());

		student = entityManager.find(Student.class, 1L);
		log.info(student.getName());
	}

	@Ignore
	@Transactional
	public void cacheLevel2(){
		Student student = entityManager.find(Student.class, 1L);
		log.info(student.getName());

		student = entityManager.find(Student.class, 1L);
		log.info(student.getName());
		Session session = entityManager.unwrap(Session.class);
		session.evict(student);

		List<Student> select_s_from_student_s = entityManager.createQuery("select s from Student s")
				.setHint("org.hibernate.cacheable", true)
				.getResultList();

		select_s_from_student_s.forEach(System.out::println);
	}
}