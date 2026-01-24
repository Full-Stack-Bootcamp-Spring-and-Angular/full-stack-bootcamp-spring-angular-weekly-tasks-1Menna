package Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@Table(name="User")
public class User {
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

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", passwrd='" + passwrd + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getPasswrd() {
        return passwrd;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setPasswrd(String passwrd) {
        this.passwrd = passwrd;
    }
}
