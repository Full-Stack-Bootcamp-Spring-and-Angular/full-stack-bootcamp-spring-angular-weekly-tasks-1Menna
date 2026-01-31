package Entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Setter
@Getter
@Entity
@Table(name="passport")
public class Passport {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    int id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="person_id")
    Person person;

    @Column(name="passport_no")
    String passport_no;

    @Temporal(TemporalType.DATE)
    @Column(name="expiry_date")
    Date expiry_date;

    public Passport(String passport_no, Date expiry_date) {
        this.passport_no = passport_no;
        this.expiry_date = expiry_date;
    }
}
