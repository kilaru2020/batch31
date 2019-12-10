package jrout.tutorial.batch31.springjpa.model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
public class Departments {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer deptNo;
    private String deptName;

    /*@ManyToMany
    @JoinTable(name = "dept_emp", joinColumns = @JoinColumn(name = ))
    private List<Employees> employees = new ArrayList<>();
*/



}
