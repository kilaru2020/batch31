package jrout.tutorial.batch31.springbootjms2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jms.annotation.EnableJms;

@SpringBootApplication
@EnableJms
public class SpringBootJms2Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootJms2Application.class, args);
    }

}
