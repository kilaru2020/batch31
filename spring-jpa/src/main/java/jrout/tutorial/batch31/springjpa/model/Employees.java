package jrout.tutorial.batch31.springjpa.model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
public class Employees {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer empNo;

    private LocalDate birthDate;
    private String firstName;
    private String lastName;
    private char gender;
    private LocalDate hireDate;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "empNo")
    private List<Salaries> salaries = new ArrayList<>();

    @ManyToMany(mappedBy = "employees")
    private List<Departments> departments = new ArrayList<>();
}
