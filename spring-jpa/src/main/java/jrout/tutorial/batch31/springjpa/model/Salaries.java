package jrout.tutorial.batch31.springjpa.model;

import lombok.Data;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@Entity
@ToString
public class Salaries {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer empNo;
    private Integer salary;
    private LocalDate fromDate;
    private LocalDate toDate;
}
