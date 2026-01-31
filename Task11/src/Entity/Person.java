package Entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Setter
@Getter
@Entity
@Table(name="person")
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    int id;

    @OneToOne(mappedBy = "person", cascade = CascadeType.ALL) // only added for Bi-Direction
    Passport passport;

    @Column(name="firstName")
    String firstName;

    @Column(name="lastNmae")
    String lastName;

    @Temporal(TemporalType.DATE)
    @Column(name="birthDate")
    Date  birthDate;

    public Person(String firstName, String lastName, Date birthDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
    }
}
