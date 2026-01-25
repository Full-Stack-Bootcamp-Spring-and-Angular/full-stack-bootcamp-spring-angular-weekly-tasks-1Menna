package Entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Setter
@Getter
@Entity
@Table(name="User")
public class User {
    @Id
    @Column(name = "id")
    int id;

    @Column(name = "firstName")
    String firstName;

    @Column(name = "passwrd")
    String passwrd;

    public User(int id, String firstName, String passwrd) {
        this.id = id;
        this.firstName = firstName;
        this.passwrd = passwrd;
    }

    public User() {

    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", passwrd='" + passwrd + '\'' +
                '}';
    }

}
