package jrout.tutorial.batch31.spring.service.impl;

import jrout.tutorial.batch31.spring.AppConfig;
import jrout.tutorial.batch31.spring.service.IEmployee;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { AppConfig.class })
public class EmployeeImplTest {

    @Autowired
    private IEmployee iEmployee;

    @Test
    public void callMe() {
        iEmployee.callMe();
    }
}