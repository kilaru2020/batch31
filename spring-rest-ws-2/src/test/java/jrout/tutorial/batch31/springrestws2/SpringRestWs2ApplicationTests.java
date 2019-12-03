package jrout.tutorial.batch31.springrestws2;

import jrout.tutorial.batch31.springrestws2.domain.Employee;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.client.RestTemplate;

@SpringBootTest
class SpringRestWs2ApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    public void callRest(){
        RestTemplate restTemplate = new RestTemplate();
        Employee forObject = restTemplate.getForObject("http://localhost:8080/fetch/10001", Employee.class);
        System.out.println(forObject.getFirstName());
    }
}
