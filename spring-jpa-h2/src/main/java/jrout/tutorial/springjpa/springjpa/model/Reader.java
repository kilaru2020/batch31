package jrout.tutorial.springjpa.springjpa.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Reader {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;
    private String firstName;
    private String lastName;
    private String email;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "READER_SUBSCRIPTION", joinColumns = @JoinColumn(name = "reader_id"),
    inverseJoinColumns = @JoinColumn(name = "subscription_id"))
    private Set<Subscription> subscriptions = new HashSet<>();
}
