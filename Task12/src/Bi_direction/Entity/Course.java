package Bi_direction.Entity;

import Bi_direction.Entity.Instructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Setter
@Getter
@NoArgsConstructor
@Entity
@Table(name="course")
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name="instructor_id")
    private Instructor instructor;

    @Column(name="course_name")
    private String course_name;

    public Course(String course_name) {
        this.course_name = course_name;
    }
}
