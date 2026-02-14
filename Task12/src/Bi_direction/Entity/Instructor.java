package Bi_direction.Entity;

import Bi_direction.Entity.Course;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@Entity
@Table(name = "instructor")
public class Instructor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="instructor_name")
    private String instructor_name;

    @OneToMany(mappedBy = "instructor", cascade = CascadeType.ALL)
    private List<Course>courses;

    public Instructor(String instructor_name) {
        this.instructor_name = instructor_name;
    }
}
