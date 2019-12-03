package jrout.tutorial.batch31.springrestws2.controller;

import jrout.tutorial.batch31.springrestws2.domain.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class EmployeeController {

    @GetMapping("/fetch/{empId}")
    @ResponseBody
    //http://localhost:8080/fetch?empId=10001
    //http://localhost:8080/fetch/10001
    //http://localhost:8080/fetch/emp/?empId=10001
    //@GetMapping("/fetch/{type}")

//    public Employee fetchEmployee(@RequestParam(name = "empnumber") int empId){
//    public Employee fetchEmployee(@RequestParam int empId){
    // RestTemplate
    public Employee fetchEmployee(@PathVariable("empId") int empId){
        Employee employee = new Employee();
        employee.setFirstName("Peter");
        employee.setLastName("Pan");
        employee.setEmpNo(empId);
        return employee;
    }
}
