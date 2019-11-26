package jrout.tutorial.batch31.spring.service.impl;

import jrout.tutorial.batch31.spring.service.IEmployee;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component // Spring Container
public class EmployeeImpl implements IEmployee {
    public void callMe() {
        System.out.println("I am been called...");
    }
}
