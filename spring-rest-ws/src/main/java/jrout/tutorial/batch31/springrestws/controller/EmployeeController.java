package jrout.tutorial.batch31.springrestws.controller;

import jrout.tutorial.batch31.springrestws.domain.Employee;
import jrout.tutorial.batch31.springrestws.service.IEmployee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class EmployeeController {

    @Autowired
    IEmployee employee;

    @GetMapping("/fetchemp")
    @ResponseBody
    public Employee getEmployee(@RequestParam(name = "empId") int empId){
        return employee.fetchEmployee(empId);
    }
}
